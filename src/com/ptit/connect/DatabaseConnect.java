/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author TUNGND
 */
public class DatabaseConnect {

    private static DatabaseConnect instance;
    private Connection connection;

    DatabaseConnect() {
        try {
            final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            final String server = "jdbc:sqlserver://localhost:1433;databaseName=CarGara";
            final String user = "sa";
            final String pass = "Strong.Pwd-123";
            Class.forName(driver);
            connection = DriverManager.getConnection(server, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static DatabaseConnect getInstance() throws SQLException {
        if (instance == null) {
            instance = new DatabaseConnect();
        } else if (instance.getConnection().isClosed()) {
            instance = new DatabaseConnect();
        }
        return instance;
    }

//    public static void main(String[] args) {
//        DatabaseConnect connect = new DatabaseConnect();
//        System.out.println(connect.getConnection());
//    }
}
