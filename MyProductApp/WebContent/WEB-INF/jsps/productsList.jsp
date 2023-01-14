<%@page import="java.util.*"%>
<%@page import="com.product.app.main.model.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Employee List</h3>
	<%
		List<Product> productList = (List<Product>)request.getAttribute("list");
		for (Product e : productList) {
			out.print(e + "<br>");
		}
	%>
</body>
</html>