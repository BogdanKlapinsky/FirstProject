<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/admin/countryName" method = "post">
		<table>
			<tr><td><input type = ""></td></tr>
			<tr><td><input type = "submit"></td></tr>
		</table>
	</form>
	<table>
			<tr><th>Country name</th></tr>
			<c:forEach items="${countries}" var="name">
			<tr><td>${name.name}</td></tr>
			<td><a href="/admin/countryName/delete/${name.id}">delete</a></td>
			<td><a href="/admin/countryName/update/${name.id}">update</a></td>
			</c:forEach>
	</table>
</body>
</html>