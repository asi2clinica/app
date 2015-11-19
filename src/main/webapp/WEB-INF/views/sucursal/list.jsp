
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
	<c:url var="action" value="/app/sucursal/create" />
	<form:form method="post" modelAttribute="sucursal" action="${action}">
		<form:input 	path="nombre" 			type="text" 		/>
		<form:input 	path="direccion" 		type="text" 		/>
		<form:input 	path="email" 			type="text" 		/>
		<form:input 	path="telefono" 		type="text" 		/>
		<form:hidden 	path="estado"  			value="S"   />
		<form:hidden 	path="id" />
		<input 			type="submit" value="Guardar" /> 
	</form:form>
</body>
</html>