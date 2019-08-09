<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:teal;">
	<a href="">Go Back</a>
	
	
	<hr color="black" size="1">
	<form action="Create" >
		<table align="center" border="1">
			<tr>
				<td><i>Name</i></td>
				<td><input type="text" name="name" required="required"></td>
			</tr>
			<tr>
				<td><i>Age</i></td>
				<td><input type="number" name="age" required="required"></td>
			</tr>
			<tr>
				<td><i>Initial Balance</i></td>
				<td><input type="number" name="initBal" required="required"></td>
			</tr>
			<tr>
				<td><i>City</i></td>
				<td><input type="text" name="address" required="required"></td>
			</tr>
			<tr>
				<td><input type="submit" style="background-color:green; value="Create Account"></td>
			</tr>
		</table>
		<hr color="black">
		<div style="color: red; text-align: center">${msg }</div>
		<hr color="black">
	</form>
</body>
</html>