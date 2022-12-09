/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author himaa
 */
public class DBconncection {
    final static String url = "jdbc:derby://localhost:1527/resturants";
    final static String user = "resturant";
    final static String  password = "12345" ;
            
    public int validate(person p){
         try {
            Connection db = DriverManager.getConnection(url,user,password);
            Statement statement_handler = db.createStatement();
            String sql = "select userID  from person where userName ='"+p.getUsername()+"'and userPass ='"+p.getPassword()+"'";
            ResultSet sql_result = null;
            System.out.println(sql);
//            statement_handler.executeQuery(sql);
            sql_result = statement_handler.executeQuery(sql);
            
            while(sql_result.next()){
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
    
    
        public boolean register(person p){
         int id = 0;
         try {
            Connection db = DriverManager.getConnection(url,user,password);
            Statement statement_handler = db.createStatement();
            ResultSet sql_result = null;
            String sql = "select max(userID) from person" ;
            System.out.println(sql);
            sql_result = statement_handler.executeQuery(sql);
            
            if(sql_result.next()){
                id =  sql_result.getInt(1);
                System.out.println(id);
                id ++;
            }
            sql_result = null;
            sql = "INSERT INTO person (userID, userName,userPass,userType) VALUES("+id+",'"+p.getUsername()+"','"+p.getPassword()+"','user')";
            System.out.println(sql);
            statement_handler.executeUpdate(sql);
            return  true;
            
        } catch (SQLException ex) {
            
            Logger.getLogger(DBconncection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean MakeReservation(){
        Connection db;
        try {
            db = DriverManager.getConnection(url,user,password);
            Statement statement_handler = db.createStatement();
            ResultSet sql_result = null;
            String sql = "INSERT INTO RESERVATION (productID, productName,productType,productPrice)\n" +"VALUES(1, 'Pizza','main',52);" ;
            System.out.println(sql);
            sql_result = statement_handler.executeQuery(sql);
            
          }
        catch (SQLException ex) {
            Logger.getLogger(DBconncection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ResultSet getProducts(String type){
        Connection db;
        try{
        db = DriverManager.getConnection(url,user,password);
            Statement statement_handler = db.createStatement();
            ResultSet sql_result = null;
            String sql = "select productName from products where productType ='"+type+"'" ;
            System.out.println(sql);
            sql_result = statement_handler.executeQuery(sql);
            System.out.println(sql_result.getString("productName"));
            return sql_result;
        }
        catch (SQLException ex) {
            Logger.getLogger(DBconncection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
    



