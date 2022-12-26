/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DBconncection;
import model.reservationModel;

/**
 *
 * @author andria
 */
@WebServlet(name = "reservationController", urlPatterns = {"/reservationController"})
public class reservationController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        request.getContextPath();

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher req;
        try {
            if (request.getParameter("view") != null) {
                processRequest(request, response);
                int reservID = Integer.parseInt(request.getParameter("resID"));
                if (reservationModel.getReservationData(reservID)) {
                    req = request.getRequestDispatcher("Extras/reservation.jsp");
                    req.forward(request, response);
                } else {
                    req = request.getRequestDispatcher("Extras/fail.jsp");
                    req.forward(request, response);
                }
            } else if (request.getParameter("delete") != null) {
                processRequest(request, response);
                int reservID = Integer.parseInt(request.getParameter("resID"));
                if (reservationModel.getReservationData(reservID)) {
                    DBconncection db = DBconncection.getInstance();
                    db.removeReservation(reservID);
                    req = request.getRequestDispatcher("Extras/delReservation.jsp");
                    req.forward(request, response);
                } else {
                    req = request.getRequestDispatcher("Extras/fail.jsp");
                    req.forward(request, response);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(reservationController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            processRequest(request, response);
            String main = request.getParameter("main");
            String appetizer = request.getParameter("appetizers");
            String dessert = request.getParameter("dessert");
            String drinks = request.getParameter("drinks");

            System.out.println(main + " m " + appetizer + " a " + dessert + " des " + drinks + " dri ");
            reservationModel rm = new reservationModel(main, appetizer, dessert, drinks);
            DBconncection db = DBconncection.getInstance();
            if (db.makeReservation(rm.getMainID(), rm.getAppetizerID(), rm.getDessertID(), rm.getDrinksID())) {
                RequestDispatcher req = request.getRequestDispatcher("Extras/reservationSuccess.jsp");
                req.forward(request, response);

            } else {
                RequestDispatcher req = request.getRequestDispatcher("Extras/reservationFailed.jsp");
                req.forward(request, response);
            }
        } catch (SQLException ex) {
            Logger.getLogger(reservationController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
