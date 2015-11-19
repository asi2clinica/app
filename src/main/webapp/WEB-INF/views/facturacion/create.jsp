
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../template/content/head.jsp" />

	<h3>Nueva Factura</h3>
	
	<c:url var="action" value="/app/factura/save" />
	<form:form action="${action}" method="post" modelAttribute="factura" >
     	
     		<form:input path="" />
     
		  <input type="submit" />  
	</form:form>
<jsp:include page="../template/content/foot.jsp" />









