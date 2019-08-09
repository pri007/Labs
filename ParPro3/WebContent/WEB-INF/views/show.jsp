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
	<form action="Show">
		<table align="center">
			<tr>
				<td><i>Account No:</i></td>
				<td><input type="text" name="t1" required="required"></td>
			</tr>
			<tr>
				<td><input type="submit" style="background-color:green; value="Show"></td>
			</tr>
		</table>
	</form>
	<hr color="black">
	<div style="color: red; text-align: center"><b>${msg }</b></div>
	<hr color="black">

</body>
</html>