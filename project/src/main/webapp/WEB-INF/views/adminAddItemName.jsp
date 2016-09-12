<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<table>
		<tr>
			<th>Item name</th>
			 </tr><c:forEach items="${items}" var="name"><tr>
				<td>${name.name}</td>
				<td><a href="/admin/addItemName/delete/${name.id}">delete</a></td>
				<td><a href="/admin/addItemName/update/${name.id}">update</a></td>
				</tr>
		</c:forEach>
		<!-- 
		</tr>
		<c:forEach items="${item}" var="item">
			<tr>
				<td>${item.name}</td>
				<td>
					<a href="/admin/addItemName/delete/${item.id}">delete</a>
				</td>
				<td>
					<a href="/admin/addItemName/update/${item.id}">update</a>
				</td>
				</tr>
		</c:forEach>
		 -->
	</table>
</body>
</html>