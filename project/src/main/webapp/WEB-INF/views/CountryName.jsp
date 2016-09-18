<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/WEB-INF/custom.tld" prefix="custom"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<div class="row">
		<div class="col-md-12">
			<nav class="navbar navbar-default">
				<div class="container-fluid">
					<div class="collapse navbar-collapse" id="">
						<ul class="nav navbar-nav">
							<li class="active"><a href="/admin/countryName">Country</a><span class="sr-only">(current)</span></li>
							<li><a href="/admin/addCatName">Category name</a></li>
							<li><a href="/admin/addClientName">Client name</a></li>
							<li><a href="/admin/addItemName">Item</a></li>
							<li><a href="/admin">Admin handle</a></li>
						</ul>
					</div>
				</div>
			</nav>
		</div>
	</div>
	<div class="row-fluid">
		<div class="col-md-3">
			<form:form action="/admin/countryName" class="form-inline" method="get" modelAttribute="filter">
			<custom:hiddenInputs excludeParams="search"/>
				<div class="form-group">
					<form:input path="search" placeholder="search" class="form-control" />
					<button type="submit" class="btn btn-primary">Ok</button>
				</div>
			</form:form>
		</div>
		<div class="col-md-7">
			<form:form action="/admin/countryName" method="post" class="form-inline" 
				modelAttribute="countryName">
				<form:hidden path="id" />
				<custom:hiddenInputs excludeParams="name, id"/>
				<div class="form-group">
					<label for="name"><form:errors path="name" /></label>
					<form:input id="name" path="name" placeholder="country name" class="form-control" />
					<button type="submit" class="btn btn-primary">Create country</button>
				</div>
			</form:form>
			<div class="col-md-4"><h4>Country name</h4></div>
			<div class="col-md-4"><h4>Delete</h4></div>
			<div class="col-md-4"><h4>Update</h4></div>
			<c:forEach items="${page.content}" var="country">
				<div class="col-md-4 col-xs-4">${country.name}</div>
					<div class="col-md-4 col-xs-4">
						<a href="/admin/countryName/delete/${country.id}<custom:allParams/>">delete</a>
					</div>
					<div class="col-md-4 col-xs-4">
						<a href="/admin/countryName/update/${country.id}<custom:allParams/>">update</a>
					</div>
			</c:forEach>
			<div class="col-md-12 text-center">
				<custom:pageable page="${page}" cell="<li></li>" container="<ul class='pagination'></ul>" />
			</div>
		</div>
		<div class="col-md-2">
			<div class="col-md-6">
				<div class="dropdown">
				<button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Sort <span class="caret"></span>
					</button>
					<ul class="dropdown-menu">
						<custom:sort innerHtml="Name asc" paramValue="name"/>
						<custom:sort innerHtml="Name desc" paramValue="name,desc"/>
					</ul>
				</div>
			</div>
			<div class="col-md-6">
				<custom:size posibleSizes="1,2,5,10" size="${page.size}" title="Page size"/>
			</div>
			
		</div>
	</div>









<!--	<form action="/admin/countryName" method="post">
		<table>
			<tr><td><input name="name"></td></tr>
			<tr><td><input type="submit"></td></tr>
		</table>
	</form>
	<table>
			<tr><th>Country name</th></tr>
			<tr>
			<c:forEach items="${countries}" var="name">
			<tr><td>${name.name}</td></tr>
			<td><a href="/admin/countryName/delete/${name.id}">delete</a></td>
			<td><a href="/admin/countryName/update/${name.id}">update</a></td>
			</tr>
			</c:forEach>
	</table>
</body>
</html>-->