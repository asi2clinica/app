
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../template/content/head.jsp" />
	
	<c:set var="cnt" value="0" />
	<h3>Paciente</h3>
	
	<c:url var="action" value="/app/paciente/save" />
	<form:form action="${action}" method="post" modelAttribute="paciente" >
     
     		
     
     
		  Nombre:<form:input path="persona.nombre" cssClass="form-control" minlength="2"  maxlength="20" required="true" /><BR />
		  Apellido:<form:input path="persona.apellido" cssClass="form-control" minlength="2"  maxlength="20" required="true" /><BR />
		  Genero
		  <form:select path="persona.genero" cssClass="form-c ontrol" >
		  	<form:option value="F" label="F" />
		  	<form:option value="M" label="M" />
		  </form:select><BR />
		  
		  Direccion<form:input path="persona.direccion" cssClass="form-control"  required="true" /><BR />
		  Fecha Nac<form:input path="persona.fnacimiento" cssClass="form-control" required="true" /><BR />
		  mail<form:input path="persona.email" cssClass="form-control" type="email" required="true"	/><BR />
		  
		  tipo
		  	<form:select path="tipo" cssClass="form-control" required="true"  >
		  		<c:forEach items="${tipoPacientes}" var="item">
		  			<form:option value="${item.id}"> ${item.tipo} </form:option>
		  		</c:forEach>
		  	</form:select>
		  	<BR />
		  <form:hidden path="id" value="${id}" /><BR />
		  <input type="submit" /> 
		  
	</form:form>		
	
<jsp:include page="../template/content/foot.jsp" />









