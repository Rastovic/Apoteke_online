package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;



public class TestJDBC {

	public static void main(String[] args) {
		
		String jdbcURL = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false&serverTimezone=UTC";
		String user = "hbstudent";
		String pass = "hbstudent";
		
		try {
			System.out.println("Connecting to database" + jdbcURL);
			Connection myCon = DriverManager.getConnection(jdbcURL,user,pass);
			System.out.println("Uspjesno");
		}
		catch (Exception exc){
			exc.printStackTrace();
		}
		

	}

}
