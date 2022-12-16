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
public class DBconncection {

    final static String url = "jdbc:derby://localhost:1527/resturants";
    final static String user = "resturant";
    final static String password = "12345";

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
               if(sql_result.getString("type").equals("admin")){
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
                if(sql_result.getInt(1)<321||sql_result.getInt(1)>322){
                id = sql_result.getInt(1);
                System.out.println(id);
                id++;
                }
                else {
                    id=323;
                }
            }
            sql_result = null;
            sql = "INSERT INTO person (userID, userName,userPass,userType) VALUES(" + id + ",'" + p.getUsername() + "','" + p.getPassword() + "','user')";
            System.out.println(sql);
            statement_handler.executeUpdate(sql);
            return true;

        } catch (SQLException ex) {

            Logger.getLogger(DBconncection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static ArrayList getProducts(String type) throws SQLException {
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
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBconncection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public void viewReservation(){
    //TODO CODE HERE
    }
    public void addProduct(){
    //TODO CODE HERE
    //for admin
    }
        public void deleteProduct(){
    //TODO CODE HERE
     //for admin
    }
        
      public void searchReservation(int userID){
    //TODO CODE HERE
    }     
      public void removeReservation(int userID){
    //TODO CODE HERE
    }     
        
}
