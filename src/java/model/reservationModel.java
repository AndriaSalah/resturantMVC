/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author andria
 */
public class reservationModel {
   static ArrayList<String> main = new ArrayList<>();
   static ArrayList<String> appetizer = new ArrayList<>();
   static ArrayList<String> drinks = new ArrayList<>();
   static ArrayList<String> dessert = new ArrayList<>();

    public reservationModel() throws SQLException {
         DBconncection db = new DBconncection();
         ResultSet set = db.getProducts("main");
         for (int i = 0; i < main.size(); i++) {
          main.add(set.getString("productName"));
            
        }
    }

  
   
    public static ArrayList<String> getMain() {
        return main;
    }

    public static void setMain(ArrayList<String> main) {
        reservationModel.main = main;
    }

    public static ArrayList<String> getAppetizer() {
        return appetizer;
    }

    public static void setAppetizer(ArrayList<String> appetizer) {
        reservationModel.appetizer = appetizer;
    }

    public static ArrayList<String> getDrinks() {
        return drinks;
    }

    public static void setDrinks(ArrayList<String> drinks) {
        reservationModel.drinks = drinks;
    }

    public static ArrayList<String> getDessert() {
        return dessert;
    }

    public static void setDessert(ArrayList<String> dessert) {
        reservationModel.dessert = dessert;
    }
}

