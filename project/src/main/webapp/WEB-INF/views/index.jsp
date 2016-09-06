<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello</h1>
<form:form action="/" method="post" modelAttribute="user">
<form:errors path="*"/>
	<input name="login" placeholder="логін">
	<input name="password" type="password" placeholder="пароль">
	<input type="submit" value="Register">
</form:form>
<c:if test="${param.fail eq true}">
	<p>Fail to authorize</p>
</c:if>
<security:authorize access="isAuthenticated() and hasRole('ROLE_ADMIN')">
<button id="asdfr">Hi</button>
<button onclick="generator()">Generate</button>
<input id="asdf" onblur="asdf(event)">
<a href="/admin">Admin panel</a>
<script>
	$(document).ready(function () {
		$('#asdfr').click(function() {
			$('#asdf').val('Hello');
		});
	});
	var trigger = true;
	function show(){
		if(trigger){
			trigger = false;
			alert("Hi");
		}
		focus();
	}
	
// 	function focus() {
// 		var input = document.getElementById("asdf");
// 		input.value = "Hello";
// 	}
	
	function asdf(event) {
		var input = event.target;
		console.log(event);
		input.value = "";
	}
	
	function myArray() {
		var a = [];
		a[0] = 'asdf';
		a[1] = true;
		a[2] = 1;
		alert(a);
		alert(a[2]=='1');
	}
	
	function generator(){
		var response = prompt("Enter element");
		var parentId = prompt("Enter parent id");
		var element = document.createElement(response);
		var id = prompt("Enter id");
		element.id=id;
		if(parentId){
			document.getElementById(parentId).appendChild(element);
		}else{
			document.body.appendChild(element);
		}
	}
	
</script>
 
<a href = "/admin"><h1>Admin panel</h1></a>
<a href = "/admin/addCountry"><h1>Admin add country</h1></a>
<a href = "/admin/addCatName"><h1>Admin add category name</h1></a>
<a href = "/admin/addClientName"><h1>Admin add client name</h1></a>
<a href = "/admin/addItemName"><h1>Admin add item name</h1></a>
</security:authorize>
</body>
</html>