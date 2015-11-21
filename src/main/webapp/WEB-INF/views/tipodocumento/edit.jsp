
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="../template/content/head.jsp" />
	
	<c:set var="cnt" value="0" />
	<h3>Documento</h3>
	
	<c:url var="action" value="/app/tipodocumento/save/update" />
	<form:form action="${action}" method="post" modelAttribute="tipodocumento" >
     
		  Nombre Tipo Documento:<form:input path="documento" value="${documento}" cssClass="form-control" /><BR />
		  
                <form:hidden path="id" value="${id}" /><BR />
                <form:hidden path="activo" value="${activo}" /><BR />
     		  <input type="submit" /> 
		  
	</form:form>		
	
<jsp:include page="../template/content/foot.jsp" />









