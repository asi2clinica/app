<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../template/content/head.jsp" />
	
	<c:set var="cnt" value="0" />
	<h3>Sucursal</h3>

	<c:url var="action" value="/app/sucursal/create" />
	<form:form method="post" modelAttribute="sucursal" action="${action}">
	  Nombre<form:input 	path="nombre" 			type="text" 		cssClass="form-control"/>
     email<form:input 	path="email" 			type="text" 		cssClass="form-control"/>
     Direccion<form:input 	path="direccion" 			type="text" 		cssClass="form-control"/>
      <form:hidden 	path="estado" 		value="S"	type="text" 		cssClass="form-control"/>
      Telefono<form:input 	path="telefono" 			type="text" 		cssClass="form-control"/>
     
	<form:hidden 	path="id" />         
	<input 			type="submit" value="Guardar" /> 
	</form:form>
	
<jsp:include page="../template/content/foot.jsp" />
    
            
            
            
            
            
          
	


		
