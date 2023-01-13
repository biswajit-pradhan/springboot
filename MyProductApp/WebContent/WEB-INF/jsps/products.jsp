<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Enter Product Details</h3>
	<fieldset style="width: 30% center">
		<legend> Product Details </legend>
		<form action="${pageContext.request.contextPath }/add-products"
			method="POST">
			<label>Id:</label> <input type="number" name="pid"><br />
			<label>Title:</label> <input type="text" name="ptitle"><br />
			<br /> <label>Price:</label> <input type="number" name="pprice"><br />
			<br /> <label>Rating:</label> <input type="number" name="prating"><br>
			<br> <input type="submit" value="Add Product"><br>
			<br>
		</form>
	</fieldset>
</body>
</html>