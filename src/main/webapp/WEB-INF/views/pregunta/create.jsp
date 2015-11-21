<%-- 
    Document   : list
    Created on : 15-nov-2015, 4:06:22
    Author     : Heraldo
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../template/content/head.jsp" />

<c:set var="cnt" value="0" />
	<h3>Pregunta</h3>
	<c:url var="action" value="/app/pregunta/save" />
	<form:form action="${action}" method="post" modelAttribute="pregunta" >
            Descripcion de la pregunta: <form:input path="descripcion" cssClass="form-control" minlength="2"  maxlength="20" required="true" /><BR />
            <form:hidden path="id" value="${id}" /><BR />
            <input type="submit" value="Guardar"/> 
	</form:form>
<jsp:include page="../template/content/foot.jsp" />









