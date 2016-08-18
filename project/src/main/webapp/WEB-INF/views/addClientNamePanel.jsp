<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/admin/addClientName" method="post">
		<table>
			<tr><td><input name="name"></td></tr>
			<tr><td><input type="submit"></td></tr>
		</table>
	</form>
	<table>
		<tr>
			<th>Client name</th>
		</tr><c:forEach items="${clients.content}" var="name"><tr>
				<td>${name.name}</td>
				<td>
					<a href="/admin/addClientName/delete/${name.id}">delete</a>
				</td>
				<td>
					<a href="/admin/addClientName/update/${name.id}">update</a>
				</td>
				</tr>
		</c:forEach>
		<tr><td>
		<c:if test="${clients.number ne 0}">
		<a href="/admin/addClientName?page=${clients.number}&size=${clients.number}">previous</a>
		</c:if>
		</td></tr>
		<tr><td>
		<c:if test="${clients.number ne clients.totalPages-1}">
		<a href="/admin/addClientName?page=${clients.number+2}&size=${clients.size}">next</a>
		</c:if>
		</td></tr>
	</table>
</body>
</html>