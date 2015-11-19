
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
	<c:url var="action" value="/app/usuario/create" />
	<form:form method="post" modelAttribute="usuario" action="${action}">
	
		<form:input 	path="usuario" 			type="text" 		/><BR />
		<form:input 	path="clave" 			type="text" 		/><BR />
		
		
		<form:select path="roles_user" items="roles" itemLabel="descripcion" itemValue="id" />
		<form:hidden 	path="id" />
		
		<input 			type="submit" value="Guardar" /> 
	</form:form>
</body>
</html>