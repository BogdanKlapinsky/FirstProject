<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
		<form action="/admin/addItemName" method="post">
		<table>
			<tr><td><input name="name"></td></tr>
			<tr><td><input type="submit"></td></tr>
		</table>
	</form>
	<form:form action="/admin/addItemName" method="post" modelAttribute="item">
		<form:hidden path="id" />
		<table>
			<tr>
				<td><form:errors path="name" /></td>
			</tr>
			<tr>
				<td><form:input path="name" placeholder="Item name" /></td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form:form>
	<table>
		<tr>
			<th>Item name</th>
		</tr>
		<c:forEach items="${item.content}" var="item">
			<tr>
				<td>${item.quantity}</td>
				<td>
					<a href="/admin/addItemName/delete/${item.id}">delete</a>
				</td>
				<td>
					<a href="/admin/addItemName/update/${item.id}">update</a>
				</td>
				</tr>
		</c:forEach>
		<tr>
			<td><c:if test="${item.number ne 0}">
					<a href="/admin/addItemName?page=${item.number}&size=
					${item.size}&name=${param.name}">previous</a>
				</c:if></td>
			<td><c:if
					test="${item.number ne item.totalPages-1}">
					<a href="/admin/addItemName?page=${item.number+2}&size=
					${item.size}&name=${param.name}">next</a>
				</c:if></td>
		</tr>
	</table>
	<table>
		<tr>
			<td><a href="/admin/item?page=1&size=1&name=${param.name}">1</a></td>
			<td><a href="/admin/item?page=1&size=5&name=${param.name}">5</a></td>
			<td><a href="/admin/item?page=1&size=10&name=${param.name}">10</a></td>
		</tr>
	</table>
</body>
</html>