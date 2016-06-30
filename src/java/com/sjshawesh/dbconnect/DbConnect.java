/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjshawesh.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abu shawesh
 */
public class DbConnect {

    private static Connection conn;

    static {
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DbConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blog", "root", "123456789");
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(DbConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConnection() {
        return conn;
    }

}
