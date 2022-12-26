/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static model.DBconncection.password;
import static model.DBconncection.url;
import static model.DBconncection.user;

import static model.reservationModel.orderID;

/**
 *
 * @author himaa
 */
public class DBconncection implements DBconnectionDAO {

    private static DBconncection db;

    final static String url = "jdbc:derby://localhost:1527/resturants";
    final static String user = "resturant";
    final static String password = "12345";

    private DBconncection() {
    }

    public static DBconncection getInstance() {
        if (db == null) {
            db = new DBconncection();
        }
        return db;
    }

    @Override
    public int validate(person p) {
        try {
            Connection db = DriverManager.getConnection(url, user, password);
            Statement statement_handler = db.createStatement();
            String sql = "select userID,userType as type   from person where userName ='" + p.getUsername() + "'and userPass ='" + p.getPassword() + "'";
            ResultSet sql_result = null;
            System.out.println(sql);
//            statement_handler.executeQuery(sql);
            sql_result = statement_handler.executeQuery(sql);

            if (sql_result.next()) {
                if (sql_result.getString("type").equals("admin")) {
                    return 322;
                }
                System.out.println(sql_result.getInt(1));
                return sql_result.getInt(1);
            }

            sql_result.close();
            db.close();
        } catch (SQLException ex) {

            Logger.getLogger(DBconncection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    }

    @Override
    public boolean register(person p) {
        int id = 0;
        try {
            Connection db = DriverManager.getConnection(url, user, password);
            Statement statement_handler = db.createStatement();
            ResultSet sql_result = null;
            String sql = "select max(userID) from person";
            System.out.println(sql);
            sql_result = statement_handler.executeQuery(sql);

            if (sql_result.next()) {
                if (sql_result.getInt(1) < 321 || sql_result.getInt(1) > 322) {
                    id = sql_result.getInt(1);
                    System.out.println(id);
                    id++;
                } else {
                    id = 323;
                }
            }
            sql_result = null;
            sql = "INSERT INTO person (userID, userName,userPass,userType) VALUES(" + id + ",'" + p.getUsername() + "','" + p.getPassword() + "','user')";
            System.out.println(sql);
            statement_handler.executeUpdate(sql);
            sql_result.close();
            db.close();

        } catch (SQLException ex) {

            Logger.getLogger(DBconncection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        return true;
    }

    @Override
    public ArrayList getProducts(String type) throws SQLException {
        Connection db;
        ArrayList<String> temp = new ArrayList<>();
        try {
            db = DriverManager.getConnection(url, user, password);
            Statement statement_handler = db.createStatement();
            ResultSet sql_result = null;
            String sql = "select productName from products where productType ='" + type + "'";
            System.out.println(sql);
            sql_result = statement_handler.executeQuery(sql);
            while (sql_result.next()) {
                temp.add(sql_result.getString("productName"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBconncection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }

    @Override
    public boolean makeReservation(int mainID, int appetizerID, int dessertID, int drinksID) {
        try {
            Connection db;
            String sql;
            db = DriverManager.getConnection(url, user, password);
            Statement statement_handler = db.createStatement();

            sql = "insert into reservation values(" + reservationModel.reservationID + "," + reservationModel.tableNumber + "," + person.getUserID() + ",'" + reservationModel.reservationDate + "')";
            System.out.println(sql);
            statement_handler.executeUpdate(sql);

            sql = "insert into orders values(" + reservationModel.orderID + "," + reservationModel.reservationID + "," + reservationModel.totalPrice + ")";
            System.out.println(sql);
            statement_handler.executeUpdate(sql);

            sql = "insert into products_orders values(" + reservationModel.orderID + "," + appetizerID + ")";
            System.out.println(sql);
            statement_handler.executeUpdate(sql);

            sql = "insert into products_orders values(" + reservationModel.orderID + "," + mainID + ")";
            System.out.println(sql);
            statement_handler.executeUpdate(sql);

            sql = "insert into products_orders values(" + reservationModel.orderID + "," + dessertID + ")";
            System.out.println(sql);
            statement_handler.executeUpdate(sql);

            sql = "insert into products_orders values(" + reservationModel.orderID + "," + drinksID + ")";
            System.out.println(sql);
            statement_handler.executeUpdate(sql);

            db.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBconncection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    @Override
    public String getPrice(String item) {
        try {
            Connection db = DriverManager.getConnection(url, user, password);
            Statement statement_handler = db.createStatement();
            ResultSet sql_result = null;
            String sql = "selec productPrice from products where productName ='" + item + "'";
            System.out.println(sql);
            sql_result = statement_handler.executeQuery(sql);

            if (sql_result.next()) {

                return sql_result.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBconncection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<String> viewReservation(int reservID) {
        ArrayList<String> reservationData = new ArrayList<>();
        try {
            String sql;
            Connection db = DriverManager.getConnection(url, user, password);
            Statement statement_handler = db.createStatement();
            ResultSet sql_result = null;
            sql = "select tablenumber, reservationDate from reservation where reservationID = +" + reservID + "and userID = " + person.getUserID();
            System.out.println(sql);
            sql_result = statement_handler.executeQuery(sql);
            if (sql_result.next()) {
                reservationData.add(sql_result.getString(1));
                reservationData.add(sql_result.getString(2));
            }
            else return null;
            sql = "select orderID from orders where reservationID = +" + reservID;
            System.out.println(sql);
            sql_result = statement_handler.executeQuery(sql);
            if (sql_result.next()) {
                reservationData.add(sql_result.getString(1));
            }
             else return null;
            sql = "select   PRODUCTNAME , orders.orderid , reservation.RESERVATIONID FROM PRODUCTS \n"
                    + "INNER JOIN PRODUCTS_orders ON PRODUCTS_ORDERS.PRODUCTID = PRODUCTS.PRODUCTID \n"
                    + "inner join orders on products_orders.orderID = orders.orderID \n"
                    + "inner join reservation on reservation.RESERVATIONID = orders.RESERVATIONID where reservation.userID = " + person.getUserID() + " and reservation.reservationid =" + reservID;
            System.out.println(sql);
            sql_result = statement_handler.executeQuery(sql);
            while (sql_result.next()) {
                reservationData.add(sql_result.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBconncection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return reservationData;
    }

    @Override
    public boolean addProduct(String dishName, String dishType, int price) {
        String sql;
        int id = 0;
        try {
            Connection db = DriverManager.getConnection(url, user, password);
            Statement statement_handler = db.createStatement();
            ResultSet sql_result = null;
            sql = "select max(productID) from products";
            System.out.println(sql);
            sql_result = statement_handler.executeQuery(sql);
            if (sql_result.next()) {
                id = sql_result.getInt(1) + 1;
            }
            sql = "insert into products values (" + id + ",'" + dishName + "'," + price + ",'" + dishType + "')";
            System.out.println(sql);
            statement_handler.executeUpdate(sql);
            sql_result.close();
            db.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBconncection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteProduct(int id, String itemName) {
        try {
            Connection db = DriverManager.getConnection(url, user, password);
            Statement statement_handler = db.createStatement();
            String sql = "delete from products where productID = " + id + " and productName = '" + itemName + "'";
            System.out.println(sql);
            statement_handler.executeUpdate(sql);
            db.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBconncection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        return true;
    }

    public void searchReservation(int userID) {
        //TODO CODE HERE
    }

    @Override
    public void removeReservation(int reservID) {
        //delete from products_orders where products_orders.orderid=1
        //delete from orders where orders.orderid = 1;
        //delete from reservation where reservation.reservationid = 1;
        String sql;
        try {
            Connection db = DriverManager.getConnection(url, user, password);
            Statement statement_handler = db.createStatement();
             sql = "delete from products_orders where products_orders.orderid = " + reservationModel.getResOrderID();
            System.out.println(sql);
            statement_handler.executeUpdate(sql);
             sql = "delete from orders where orders.orderid = " + reservationModel.getResOrderID();
            System.out.println(sql);
            statement_handler.executeUpdate(sql);
             sql = "delete from reservation where reservation.reservationid = " + reservID;
            System.out.println(sql);
            statement_handler.executeUpdate(sql);
            db.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBconncection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
