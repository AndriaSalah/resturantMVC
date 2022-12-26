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
public interface reservationModelDAO {

    public void getProductIDs(String main, String appetizers, String dessert, String drinks);

    public void startReservation() throws SQLException;

    public void startOrder();
    
}
