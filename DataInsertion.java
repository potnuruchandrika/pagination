package com.data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataInsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task", "root", "root");
			Statement stmt = con.createStatement();
			for (int i = 0; i < 100; i++) {
				String query = "insert into employee(employee_Id,employee_name,phone_number,salary,department)VALUES('abc18','virat','897453151',34657.00,'hr')";
				stmt.executeUpdate(query);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}