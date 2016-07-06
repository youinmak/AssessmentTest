package com.makarand.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDerby {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        String dbURL1 = "jdbc:derby:codejava/webdb1;create=true";
        
		try {
			Connection conn1 = DriverManager.getConnection(dbURL1);
			if (conn1 != null) {
	            System.out.println("Connected to database #1");
	        }
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
        

	}

}
