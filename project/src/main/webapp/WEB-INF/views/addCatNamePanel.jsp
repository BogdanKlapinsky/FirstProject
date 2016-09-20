<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/WEB-INF/custom.tld" prefix="custom"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="row">
				<div class="col-md-12">
					<nav class="navbar navbar-default">
						<div class="container-fluid">
							<div class="collapse navbar-collapse" id="">
									<ul class="nav navbar-nav">
										<li class="active"><a href="/admin/countryName">Country</a></li>
										<li><a href="/admin/addCatName">Category name</a><span class="sr-only">(current)</span></li>
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
			<form:form action="/admin/addCatName" class="form-inline" method="get" modelAttribute="filter">
			<custom:hiddenInputs excludeParams="search"/>
				<div class="form-group">
				<!-- 	<form:input path="search" placeholder="search" class="form-control" /> -->
					<button type="submit" class="btn btn-danger">Ok</button>
				</div>
			</form:form>
		</div>
		
	
	<div class="col-md-7">
			<form:form action="/admin/addCatName" method="post" class="form-inline"   enctype="multipart/form-data"
				modelAttribute="item">
				<form:errors path="*"/>
				<form:hidden path="id" />
				<form:hidden path="path" />
				<form:hidden path="version" />
				<custom:hiddenInputs excludeParams="name, id, path, version, country"/>
				<div class="form-group">
					<form:select path="country" items="${countries}" itemLabel="name" itemValue="id">
					<option value="0">Country</option>
					</form:select>	
					<label for="name"><form:errors path="name" /></label>
					<form:input  path="name" id="name" placeholder="category name" class="form-control" />
					<label class="btn btn-default btn-file">
					Browse <input type="file" name="file" style="display: none;">
    				</label>
					<button type="submit" class="btn btn-primary">Create category</button>
				</div>
			</form:form>
			<div class="row">
				<div class="col-md-3"><h4>Image</h4></div>
				<div class="col-md-3"><h4>Recipe name</h4></div>
				<div class="col-md-3"><h4>Delete</h4></div>
				<div class="col-md-3"><h4>Update</h4></div>
			</div>
			
			<div class="col-md-12 text-center">
				<custom:pageable page="${page}" cell="<li></li>" container="<ul class='pagination'></ul>" />
			</div>
			</div>
			
			<c:forEach items="${page.content}" var="country">
					<div class="col-md-4">${country.name}</div>
					<div class="col-md-4"><a href="/admin/addCatName/delete/${country.id}<custom:allParams/>">delete</a></div>
					<div class="col-md-4"><a href="/admin/addCatName/update/${country.id}<custom:allParams/>">update</a></div>
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
						<custom:sort innerHtml="Time asc" paramValue="time"/>
						<custom:sort innerHtml="Time desc" paramValue="time,desc"/>
						<custom:sort innerHtml="Category name asc" paramValue="country.name"/>
						<custom:sort innerHtml="Category name desc" paramValue="country.name,desc"/>
					</ul>
				</div>
			</div>
			<div class="col-md-6">
				<custom:size posibleSizes="1,2,5,10" size="${page.size}" title="Page size"/>
			</div>
		</div>
		
	







<!-- <html>
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
 -->