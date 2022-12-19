/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andria
 */
public class DBconncectionTest {
    
    public DBconncectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of validate method, of class DBconncection.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        person p = null;
        DBconncection instance = new DBconncection();
        int expResult = 0;
        int result = instance.validate(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of register method, of class DBconncection.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        person p = null;
        DBconncection instance = new DBconncection();
        boolean expResult = false;
        boolean result = instance.register(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProducts method, of class DBconncection.
     */
    @Test
    public void testGetProducts() throws Exception {
        System.out.println("getProducts");
        String type = "";
        ArrayList expResult = null;
        ArrayList result = DBconncection.getProducts(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeReservation method, of class DBconncection.
     */
    @Test
    public void testMakeReservation() {
        System.out.println("makeReservation");
        int mainID = 0;
        int appetizerID = 0;
        int dessertID = 0;
        int drinksID = 0;
        DBconncection instance = new DBconncection();
        boolean expResult = false;
        boolean result = instance.makeReservation(mainID, appetizerID, dessertID, drinksID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class DBconncection.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        String item = "";
        DBconncection instance = new DBconncection();
        String expResult = "";
        String result = instance.getPrice(item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewReservation method, of class DBconncection.
     */
    @Test
    public void testViewReservation() {
        System.out.println("viewReservation");
        DBconncection instance = new DBconncection();
        instance.viewReservation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProduct method, of class DBconncection.
     */
    @Test
    public void testAddProduct() {
        System.out.println("addProduct");
        String dishName = "";
        String dishType = "";
        int price = 0;
        DBconncection instance = new DBconncection();
        boolean expResult = false;
        boolean result = instance.addProduct(dishName, dishType, price);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteProduct method, of class DBconncection.
     */
    @Test
    public void testDeleteProduct() {
        System.out.println("deleteProduct");
        int id = 0;
        String itemName = "";
        DBconncection instance = new DBconncection();
        boolean expResult = false;
        boolean result = instance.deleteProduct(id, itemName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchReservation method, of class DBconncection.
     */
    @Test
    public void testSearchReservation() {
        System.out.println("searchReservation");
        int userID = 0;
        DBconncection instance = new DBconncection();
        instance.searchReservation(userID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeReservation method, of class DBconncection.
     */
    @Test
    public void testRemoveReservation() {
        System.out.println("removeReservation");
        int userID = 0;
        DBconncection instance = new DBconncection();
        instance.removeReservation(userID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
