
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../template/content/head.jsp" />
	
	<c:set var="cnt" value="0" />
	<h3>Paciente</h3>
	
	<c:set var="action" value="/app/paciente/save" />
	<form:form action="${action}" method="post" modelAttribute="paciente" >
		  Nombre:<form:input path="persona.nombre" cssClass="form-control" /><BR />
		  Apellido:<form:input path="persona.apellido" cssClass="form-control" /><BR />
		  Genero
		  <form:select path="persona.genero" cssClass="form-c ontrol" >
		  	<form:option value="F" label="F" />
		  	<form:option value="M" label="M" />
		  </form:select><BR />
		  
		  Direccion<form:input path="persona.direccion" cssClass="form-control"  /><BR />
		  Fecha Nac<form:input path="persona.fnacimiento" cssClass="form-control" /><BR />
		  mail<form:input path="persona.email" cssClass="form-control" 	/><BR />
		  
		  mail
		  	<form:select path="tipoPaciente" cssClass="form-control"  >
		  		<form:options items="${tipoPacientes}" />
		  	</form:select>
		  	${tipoPacientes}
		  	<BR />
		  
		  <input type="submit" /> 
		  
	</form:form>		
	
<jsp:include page="../template/content/foot.jsp" />









