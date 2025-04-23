package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployShow {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/infinitepractice", 
						"root", "root");
			System.out.println("Database Connected...");
			String cmd = "select * from Employ";
			PreparedStatement pst = conn.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println("Employ No  " +rs.getInt("empno"));
				System.out.println("Employ Name  " +rs.getString("name"));
				System.out.println("Gender " +rs.getString("gender")); 
				System.out.println("Department  " +rs.getString("dept"));
				System.out.println("Designation  " +rs.getString("desig"));
				System.out.println("Basic  " +rs.getDouble("basic"));
				System.out.println("-------------------------------------------");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
