/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author TUNGND
 */
public class DAO {

    public static Connection connect;

    public DAO() {
        if (connect == null) {
            final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            final String server = "jdbc:sqlserver://localhost:1433;databaseName=CarGara";
            final String user = "sa";
            final String pass = "Strong.Pwd-123";
            try {
                Class.forName(driver);
                connect = DriverManager.getConnection(server, user, pass);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
