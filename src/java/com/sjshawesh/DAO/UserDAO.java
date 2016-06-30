/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjshawesh.DAO;

import com.sjshawesh.dbconnect.DbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abu shawesh
 */
public class UserDAO {

    public static boolean login(String username, String password) {
        Connection conn = DbConnect.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("select count(*) from users where `username`= ? and  `password` =?");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                if (rs.getInt(1) == 1) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public static boolean regester(String username, String password) {
        Connection conn = DbConnect.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO `blog`.`users`(`username`,`password`)VALUES(?,?)");
            ps.setString(1, username);
            ps.setString(2, password);
            int change = ps.executeUpdate();
            if (change == 1) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
