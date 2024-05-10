package com.data;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataInsertion {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			Statement stmt = con.createStatement();
			for (int i=0; i<100; i++) {
				String query = "insert into Employee(emp_Id,emp_Name,emp_Phonenumber) values(1,'virat','9999988888')";
				stmt.executeUpdate(query);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
