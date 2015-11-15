
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<c:url var="action" value="/app/servicio/create" />
	<form:form method="post" modelAttribute="servicio" action="${action}">
		<form:input 	path="nombre" 			type  ="text" 	cssClass="required"	maxlength="50" />
		<form:input 	path="precio" 			type  ="email"	cssClass="required decimal number email"  maxlength="10"		/>
		<form:hidden 	path="estado" 			value ="S" 		/>
		<form:hidden 	path="id" />
		<input 			type="submit" value="Guardar" /> 
	</form:form>
	
	
	
	<BR />
	
	<table>
	<thead>
		<tr>
			<td>Nombre</td>
		</tr>
		<tr>
			<td>Precio</td>
		</tr>
		<tr>
			<td>...</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${servicios}" var="item" > 
			 <tr>
				<td>${item.nombre}</td>
			</tr>
			<tr>
				<td>${item.precio}</td>
			</tr>
			<tr>
				<td><a href='<c:url value="/app/servicio/delete/" /> ${item.id}' >eliminar</a></td>
				<td><a href='<c:url value="/app/servicio/update/" /> ${item.id}' >editar</a></td>
			</tr>			
		</c:forEach>
	</tbody>
</table>
</body>
</html>