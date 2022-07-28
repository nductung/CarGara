/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.connect;

import com.ptit.dao.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TUNGND
 */
public class DatabaseConnectTest {

    public DatabaseConnectTest() {
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
     * Test of getConnection method, of class DatabaseConnect.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        DAO instance = new DAO();
        boolean expResult = true;
        Connection connection = instance.getConnection();
        boolean result = false;
        if (connection != null) {
            result = true;
        }
        assertEquals(expResult, result);
    }

    /**
     * Test of getInstance method, of class DatabaseConnect.
     */
    @Test
    public void testGetInstance() throws Exception {
        System.out.println("getInstance");
        boolean expResult = true;
        DAO databaseConnect = DAO.getInstance();
        boolean result = false;
        if (databaseConnect != null) {
            result = true;
        }
        assertEquals(expResult, result);
    }

}
