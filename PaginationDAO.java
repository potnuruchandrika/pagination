package com.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PaginationDAO {
	
	public List<Employee> getEmployeelist()
	{
		List<Employee> le=new ArrayList<Employee>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			Statement stmt = con.createStatement();
			String query = "select * from Employee";
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
			{
				int empid=rs.getInt("emp_Id");
				String empname=rs.getString("emp_Name");
				int empphonenumber=rs.getInt("emp_Phonenumber");
				
				Employee ep=new Employee();
				ep.setEmpid(empid);
				ep.setEmpname(empname);
				ep.setEmpphonenumber(empphonenumber);
				le.add(ep);
				
				
			}
			con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return le;
	}

	
}
