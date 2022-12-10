/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static model.DBconncection.password;
import static model.DBconncection.url;
import static model.DBconncection.user;

/**
 *
 * @author andria
 */
public class reservationModel {

    static int mainID, appetizerID, dessertID, drinksID, orderID, reservationID, tableNumber, totalPrice = 0;
    static String reservationDate;
    static Connection db;
    static String sql;
    static ResultSet sql_result;

    public reservationModel(String main, String appetizer, String dessert, String drinks) throws SQLException {
        getProductIDs(main, appetizer, dessert, drinks);
        startReservation();
        startOrder();
    }

    public static void getProductIDs(String main, String appetizers, String dessert, String drinks) {
        try {
            db = DriverManager.getConnection(url, user, password);
            Statement statement_handler = db.createStatement();
            ResultSet sql_result = null;

            sql = "select productid from products where productname = '" + main + "'";
            System.out.println(sql);
            sql_result = statement_handler.executeQuery(sql);
            if (sql_result.next()) {
                mainID = sql_result.getInt("productId");
            }

            sql = "select productid from products where productname = '" + appetizers + "'";
            System.out.println(sql);
            sql_result = statement_handler.executeQuery(sql);
            if (sql_result.next()) {
                appetizerID = sql_result.getInt("productId");
            }
            sql = "select productid from products where productname = '" + dessert + "'";
            System.out.println(sql);
            sql_result = statement_handler.executeQuery(sql);
            if (sql_result.next()) {
                dessertID = sql_result.getInt("productId");
            }

            sql = "select productid from products where productname = '" + drinks + "'";
            System.out.println(sql);
            sql_result = statement_handler.executeQuery(sql);
            if (sql_result.next()) {
                drinksID = sql_result.getInt("productId");
            }
            sql_result.close();
            db.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBconncection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void startReservation() throws SQLException {

        db = DriverManager.getConnection(url, user, password);
        Statement statement_handler = db.createStatement();
        sql = "select max(reservationID) from reservation";
        System.out.println(sql);
        sql_result = statement_handler.executeQuery(sql);
        if (sql_result.next()) {
            reservationID = sql_result.getInt(1) + 1;
        } 

        sql = "select max(tableNumber) from reservation";
        System.out.println(sql);
        sql_result = statement_handler.executeQuery(sql);
        if (sql_result.next()) {
            tableNumber = sql_result.getInt(1) + 1;
        } 

        reservationDate = java.time.LocalDate.now().toString();
        sql_result.close();
        db.close();
    }

    public void startOrder() {

        try {
            db = DriverManager.getConnection(url, user, password);
            Statement statement_handler = db.createStatement();
            sql = "select max(orderID) from products_orders";
            System.out.println(sql);
            sql_result = statement_handler.executeQuery(sql);
            if (sql_result.next()) {
                orderID = sql_result.getInt(1) + 1;
            } 

            sql = "select sum(productPrice) from products where productID =" + mainID + " or productID =" + appetizerID + " or productID =" + dessertID + "  or productID =" + drinksID ;
            System.out.println(sql);
            sql_result = statement_handler.executeQuery(sql);
            if(sql_result.next()){
            totalPrice = sql_result.getInt(1);
            }
            

            sql_result.close();
            db.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBconncection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static int getMainID() {
        return mainID;
    }

    public static int getAppetizerID() {
        return appetizerID;
    }

    public static int getDessertID() {
        return dessertID;
    }

    public static int getDrinksID() {
        return drinksID;
    }

    public static int getOrderID() {
        return orderID;
    }

    public static int getReservationID() {
        return reservationID;
    }

    public static int getTableNumber() {
        return tableNumber;
    }

    public static int getTotalPrice() {
        return totalPrice;
    }

    public static String getReservationDate() {
        return reservationDate;
    }
}
