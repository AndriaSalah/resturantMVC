/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author andria
 */
public interface DBconnectionDAO {

    public String validate(person p);

    public boolean register(person p);

    public ArrayList getProducts(String type) throws SQLException;

    public boolean makeReservation(int mainID, int appetizerID, int dessertID, int drinksID);

    public String getPrice(String item);

    public boolean addProduct(String dishName, String dishType, int price);

    public boolean deleteProduct(int id, String itemName);

    public ArrayList<String> viewReservation(int reservID);

    public void removeReservation(int reservID);
}
