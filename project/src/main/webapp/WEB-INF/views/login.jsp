<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="row">
	<form:form action="/login" method="post">
		<div class="col-md-12">
			<input name="username">
		</div>
		<div class="col-md-12">
			<input name="password" type="password">
		</div>
		<div class="col-md-12">
			<input type="submit" value="login">
		</div>
	</form:form>
</div>