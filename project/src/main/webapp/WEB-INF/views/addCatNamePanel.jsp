<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category name</title>
</head>
<body>
<form action="/admin/addCatName" method = "post">
		<table>
			<tr><td><input name="name"></td></tr>
			<tr><td><input type = "submit"></td></tr>
		</table>
	</form>
	<table>
		<tr>
			<th>Category name</th>
		</tr><c:forEach items="${items}" var="name"><tr>
				<td>${name.name}</td>
				<td><a href="/admin/addCatName/delete/${name.id}">delete</a></td>
				<td><a href="/admin/addCatName/update/${name.id}">update</a></td>
				</tr>
		</c:forEach>
	</table>
</body>
</html> 