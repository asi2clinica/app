
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../template/content/head.jsp" />
	
	<c:set var="cnt" value="0" />
	<h3>Tipo Documentos</h3>
	
	<c:url var="action" value="/app/tipodocumento/save" />
	<form:form action="${action}" method="post" modelAttribute="tipodocumento" >

		  Nombre Tipo Documento:<form:input path="documento" cssClass="form-control" minlength="2"  maxlength="20" required="true" /><BR />
		  <form:hidden path="activo" value="S" /><BR />
		  
		  <input type="submit" /> 
		  
	</form:form>		
	
<jsp:include page="../template/content/foot.jsp" />










