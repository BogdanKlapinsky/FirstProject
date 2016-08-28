<%@ page language="java" contentType="text/html; charset=ISO-8859-1"pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Country</title>
</head>
<body>
	<form:form action="/adminPanel/countryName" method = "post" modelAttribute="countryName">
		<form:hidden path="id"/>
		<table>
			<tr>
				<td><form:errors path="name"/></td>
			</tr>
			<tr>
				<td><form:input path="name"/></td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form:form>
	<table>
			<tr><th>Country name</th></tr>
			<c:forEach items="${countries.content}" var="name">
			<tr><td>${name.name}</td></tr>
			<td><a href="/admin/countryName/delete/${name.id}">delete</a></td>
			<td><a href="/admin/countryName/update/${name.id}">update</a></td>
			</c:forEach>
			<tr>
			<td>
				<c:if test="${countries.number ne 0}">
					<a href="/admin/countryName?page=${countries.number}&size=${countries.size}">previous</a>
				</c:if>
			</td>
			<td>
				<c:if test="${countries.number ne countries.totalPages-1}">
					<a href="/admin/countryName 	?page=${countries.number+2}&size=${countries.size}">next</a>
				</c:if>
			</td>
		</tr>
	</table>
</body>
</html>