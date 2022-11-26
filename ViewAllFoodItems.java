package com.java.foodorderapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewAllFoodItems {
	static final String DB_url = "jdbc:mysql://localhost:3306/foodorder";
    static final String user = "root";
    static final String pass = "pass@word1";
    static final String Query = "select food_name,price from items";
    
    public static void viewAllFoodItems() {
        try (Connection conn = DriverManager.getConnection(DB_url, user, pass);
             PreparedStatement ps = conn.prepareStatement(Query)) {
            ResultSet rs=ps.executeQuery();
            while(rs.next()) {
            	System.out.println( rs.getString("food_name")+ " "+rs.getInt("price"));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
