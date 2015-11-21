
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../template/content/head.jsp" />
	
    <c:set var="cnt" value="0" />
    <a class='btn btn-primary' href="<c:url value='/app/pregunta/'  />">Volve al listado general</a>
    <h3>Pregunta</h3>
	
    <c:url var="action" value="/app/pregunta/view/" />
    <form:form action="${action}" method="post" modelAttribute="pregunta" >
     
        <b>Descripcion de la pregunta:</b>  ${descripcion} <BR /><BR />
        <form:hidden path="id" value="${id}" /><BR />
            
    </form:form>
	
<jsp:include page="../template/content/foot.jsp" />