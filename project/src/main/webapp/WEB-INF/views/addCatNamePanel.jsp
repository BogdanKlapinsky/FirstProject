<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
	<form:form action="/admin/addCatName" method = "post" modelAttribute="item">
	<form:hidden path="id" /> 
	<table>
			<tr>
				<td><form:errors path="name" /></td>
			</tr>
			<tr>
				<td><form:input path="name" placeholder="Ingredient name" /></td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>
		<table>
			<tr><td><input name="name"></td></tr>
			<tr><td><input type = "submit"></td></tr>
		</table>
	</form:form>
	<form:form action="/admin/addCatName" method="get"
		modelAttribute="filter">
		<table>
			<tr>
				<td><form:input path="name"/></td>
			</tr>
			<tr><td><input type="submit" value="Filter"></td></tr>
		</table>
	</form:form>
	<table>
		<tr>
			<th>Category name</th>
		</tr><c:forEach items="${items.content}" var="name"><tr>
				<td>${name.quantity}</td>
				<td><a href="/admin/addCatName/delete/${name.id}">delete</a></td>
				<td><a href="/admin/addCatName/update/${name.id}">update</a></td>
				</tr>
		</c:forEach>
		<tr>
			<td><c:if test="${items.number ne 0}">
					<a href="/admin/addCatName?page=${items.number}&size=
					${items.size}&name=${param.name}">previous</a>
				</c:if></td>
			<td><c:if
					test="${items.number ne items.totalPages-1}">
					<a href="/admin/addCatName?page=${items.number+2}&size=
					${items.size}&name=${param.name}">next</a>
				</c:if></td>
		</tr>
	</table>
</body>
</html> 