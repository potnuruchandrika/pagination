
package com.data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.data.Employee;

public class paginatioDAO {
	
		
		public  List<Employee> getEmployeeList(int pageid,int upto)
		{
			List<Employee> le=new ArrayList<Employee>();
			try {
				 Class.forName("com.mysql.cj.jdbc.Driver");
					 
					 Connection  con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/task","root","root");
					 Statement stmt = con.createStatement();
					String query = "select * from employee limit "+(pageid-1)+","+upto;
					ResultSet rs=stmt.executeQuery(query);
					while(rs.next())
					{
						String employee_Id=rs.getString("employee_Id");
						String employee_name=rs.getString("employee_name");
						String phone_number=rs.getString("phone_number");
						String salary=rs.getString("salary");
						String department=rs.getString("department");
						
						Employee emp=new Employee();
						emp.setEmployee_Id(employee_Id);
						emp.setEmployee_name(employee_name);
						emp.setPhone_number(phone_number);
						emp.setSalary(salary);
						emp.setDepartment(department);
						le.add(emp);
					}
					
					con.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			return le;
			    
		}

	}

