<%@page import="java.util.*"%>
<%@page import="com.spring.app.main.model.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>All Employees</h1>
	<%
		int x = 5;
		int y = 10;
	%>
	<%=x + y%>
	<hr>
	<%
		String value = (String) request.getAttribute("msg");
		double priceValue = (double) request.getAttribute("price");
		out.println(value);
		out.println(priceValue);
	%>
	<%=value%>
	<%=priceValue%>
	<h3>Array Iteration</h3>
	<%
		Integer iarry[] = (Integer[]) request.getAttribute("iarry");
		for (Integer i : iarry) {
			out.print(i + "--");
		}
	%>
	<h3>Employee List</h3>
	<%
		List<Employee> list = (List<Employee>) request.getAttribute("list");
		for (Employee e : list) {
			out.print(e + "<br>");
		}
	%>
	<h3>Enter Employee Details</h3>
	<fieldset style="width: 30%">
		<legend> Employee Details </legend>
		<form action="${pageContext.request.contextPath }/add-employee"
			method="POST">
			<label>Name:</label> <input type="text" name="ename"><br />
			<br /> <label>City:</label> <input type="text" name="ecity"><br />
			<br /> <label>Salary:</label> <input type="number" name="esalary"><br>
			<br> <input type="submit" value="Add Employee"><br>
			<br>
		</form>
	</fieldset>
</body>
</html>