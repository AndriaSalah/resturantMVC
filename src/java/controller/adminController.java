/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author andria
 */
@WebServlet(name = "adminController", urlPatterns = {"/adminController"})
public class adminController extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.getContextPath();
        if (request.getParameter("Make reservation") != null) {
            RequestDispatcher req = request.getRequestDispatcher("reservationView.jsp");
            req.forward(request, response);
        }else if (request.getParameter("View reservation") != null) {
            RequestDispatcher req = request.getRequestDispatcher("reservationHistory.jsp");
            req.forward(request, response);
        }else if (request.getParameter("Delete reservation") != null) {
            RequestDispatcher req = request.getRequestDispatcher("reservationDelete.jsp");
            req.forward(request, response);
        }else if (request.getParameter("Add product") != null) {
            RequestDispatcher req = request.getRequestDispatcher("Extras/addProduct.jsp");
          
            req.forward(request, response);
        }else if (request.getParameter("DEL product") != null) {
            RequestDispatcher req = request.getRequestDispatcher("Extras/removeProduct.jsp");
            req.forward(request, response);
        }else if (request.getParameter("Logout") != null) {
            RequestDispatcher req = request.getRequestDispatcher("index.jsp");
            req.forward(request, response);
        }
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
        processRequest(request, response);
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
        processRequest(request, response);
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
