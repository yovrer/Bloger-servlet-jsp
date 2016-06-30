/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjshawesh.DAO;

import com.sjshawesh.map.Post;
import com.sjshawesh.dbconnect.DbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abu shawesh
 */
public class PostDAO {

    public static ArrayList<Post> getAllPost() {
        ArrayList<Post> allpost = new ArrayList<>();
        Connection conn = DbConnect.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT id,title, content FROM posts");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Post p = new Post();
                p.setId(rs.getInt(1));
                p.setTitle(rs.getString(2));
                p.setContent(rs.getString(3));
                allpost.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return allpost;

    }

    public static Post getPost(int id) {
        Post p = new Post();
        Connection conn = DbConnect.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM blog.posts where id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                p.setId(rs.getInt(1));
                p.setTitle(rs.getString(2));
                p.setContent(rs.getString(3));
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return p;
    }

    public static boolean addPost(Post p) {

        Connection conn = DbConnect.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO `posts` (`title`,`content`) VALUES (?,?)");
            ps.setString(1, p.getTitle());
            ps.setString(2, p.getContent());
            int change = ps.executeUpdate();
            if (change == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(PostDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean delete(int id) {
          
        Connection conn = DbConnect.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM `blog`.`posts` WHERE id=?");
            ps.setInt(1, id);
            int  change = ps.executeUpdate();
            if (change ==1) {
               
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
   
        return false;
    }
}
