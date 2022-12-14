/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andria
 */
public class productModel implements productModelDAO {

    static ArrayList<String> main = new ArrayList<>();
    static ArrayList<String> appetizer = new ArrayList<>();
    static ArrayList<String> drinks = new ArrayList<>();
    static ArrayList<String> dessert = new ArrayList<>();
    DBconncection db = DBconncection.getInstance();
    public productModel()  {
        initProducts();
    }

    public static ArrayList<String> getMain() {
        return main;
    }
    public static String getPrice(String item){
    
        
        return "";
    }
    @Override
    public void initProducts(){
        try {
            ArrayList<String> set;
            set = db.getProducts("appetizer");
            appetizer = set;
            set = db.getProducts("main");
            main = set;
            set = db.getProducts("drinks");
            drinks = set;
            set = db.getProducts("dessert");
            dessert = set;
        } catch (SQLException ex) {
            Logger.getLogger(productModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      @Override
    public String getTypeAtIndex(String type, int index) {
        switch (type) {
            case "main":
                return main.get(index);

            case "drinks":
                return drinks.get(index);

            case "dessert":

                return dessert.get(index);
            case "appetizer":

                return appetizer.get(index);
            default:
                throw new AssertionError();
        }

    }

    public static void setMain(ArrayList<String> main) {
        productModel.main = main;
    }

    public static ArrayList<String> getAppetizer() {
        return appetizer;
    }

    public static void setAppetizer(ArrayList<String> appetizer) {
        productModel.appetizer = appetizer;
    }

    public static ArrayList<String> getDrinks() {
        return drinks;
    }

    public static void setDrinks(ArrayList<String> drinks) {
        productModel.drinks = drinks;
    }

    public static ArrayList<String> getDessert() {
        return dessert;
    }

    public static void setDessert(ArrayList<String> dessert) {
        productModel.dessert = dessert;
    }
}
