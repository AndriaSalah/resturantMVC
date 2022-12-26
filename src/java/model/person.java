/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author himaa
 */

public class person {
    static String username;
    static String password;
    static int userID ;
 static String type;

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        person.type = type;
    }

    public static int getUserID() {
        return userID;
    }

    public static void setUserID(int userID) {
       person.userID = userID;
    }

    public person(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public  static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static void setPassword(String password) {
        person.password = password;
    }

}
