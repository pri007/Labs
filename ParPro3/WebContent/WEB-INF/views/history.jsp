<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:teal;">

<a href="">Go Back</a>
<hr color="black" size="1">
	<form action="History">
		<table align="center">
			<tr>
				<td><i>Account No:</i></td>
				<td><input type="text" name="t1" required="required"></td>
			</tr>
			<tr>
				<td><input type="submit" style="background-color:green; value="All Transaction"></td>
			</tr>
		</table>
		<table>
		<c:forEach var="t" items="${msg }">
			<tr>
				<td>${t}</td>
			</tr>
			</c:forEach>
		</table>
		
		
	</form>


</body>
</html>