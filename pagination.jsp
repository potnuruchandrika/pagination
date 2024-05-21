
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="com.data.paginatioDAO"%>
<%@ page import="com.data.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	   paginatioDAO dao = new paginatioDAO();
	%>
	<%
	String Pageid = request.getParameter("page");
	int pageid = Integer.parseInt(Pageid);
	int upto = 10;
	if (pageid == 1) {
	} else {
		pageid = pageid - 1;
		pageid = pageid * upto + 1;
	}
	%>
	<%
	List<Employee> eplist = (List<Employee>) dao.getEmployeeList(pageid, upto);
	out.print("<h1>page"+Pageid+"</h1>");
	%>

	<table border="">
		<th>EmployeeID</th>
		<th>EmployeeName</th>
		<th>EmployeePhoneNumber</th>
		<th>Department</th>
		<th>Salary</th>
		<%
		for (int i = 0; i < eplist.size(); i++) {
		%>

		<tr>
			<td><%=eplist.get(i).getEmployee_Id()%></td>
			<td><%=eplist.get(i).getEmployee_name()%></td>
			<td><%=eplist.get(i).getPhone_number()%></td>
			<td><%=eplist.get(i).getDepartment()%></td>
			<td><%=eplist.get(i).getSalary()%></td>
		</tr>

		<%
		}
		%>
	</table>
	<a href="pagination.jsp?page=1">First</a>
	<a href="pagination.jsp?page=2">2</a>
	<a href="pagination.jsp?page=3">3</a>
	<a href="pagination.jsp?page=4">4</a>
	<a href="pagination.jsp?page=5">5</a>
	<a href="pagination.jsp?page=6">6</a>
	<a href="pagination.jsp?page=7">7</a>
	<a href="pagination.jsp?page=8">8</a>
	<a href="pagination.jsp?page=9">9</a>
	<a href="pagination.jsp?page=10">Last</a>
</body>
</html>

