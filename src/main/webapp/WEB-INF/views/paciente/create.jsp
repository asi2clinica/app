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

	<c:set var="action" value="/app/paciente/create" />
	<form:form action="${action}" method="post" modelAttribute="paciente" >
		  Nombre:<form:input path="persona.nombre" /><BR />
		  Apellido:<form:input path="persona.apellido" /><BR />
		  Genero
		  <form:select path="persona.genero" >
		  	<form:option value="F" label="F" />
		  	<form:option value="M" label="M" />
		  </form:select><BR />
		  
		  Direccion<form:input path="persona.direccion" /><BR />
		  Fecha Nac<form:input path="persona.fnacimiento" /><BR />
		  mail<form:input path="persona.email" /><BR />
		  
		  mail
		  	<form:select path="tipoPaciente"  >
		  		<form:options items="${tipoPacientes}" />
		  	</form:select>
		  	${tipoPacientes}
		  	<BR />
		  
		  <input type="submit" /> 
		  
	</form:form>	
</body>
</html>










