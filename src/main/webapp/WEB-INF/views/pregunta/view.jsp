
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../template/content/head.jsp" />
	
    <c:set var="cnt" value="0" />
    <a class='btn btn-primary' href="<c:url value='/app/paciente/'  />">Volve al listado general</a>
    <h3>Paciente</h3>
	
    <c:url var="action" value="/app/paciente/view/" />
    <form:form action="${action}" method="post" modelAttribute="paciente" >
            
    <!-- Formateadores de fecha -->
        <fmt:formatDate var="dateReg" value="${paciente.persona.fregistro}" pattern="dd/MM/yyyy"/>
        <fmt:formatDate var="dateNac" value="${paciente.persona.fnacimiento}" pattern="dd/MM/yyyy"/>
     
        <b>Nombre:</b>  ${paciente.persona.nombre} <BR /><BR />
        <b>Apellido:</b>  ${paciente.persona.apellido} <BR /><BR />
        <b>Genero:</b>  ${paciente.persona.genero} <BR /><BR/>

        <b>Direccion:</b>  ${paciente.persona.direccion} <BR /><BR />
        <b>Fecha Nacimiento:</b>  ${paciente.persona.fnacimiento} <BR /><BR />
        <b>mail:</b>  ${paciente.persona.email} <BR /><BR />
        <b>tipo paciente:</b>  ${paciente.tipoPaciente.tipo} <BR /><BR />
        <form:hidden path="id" value="${id}" /><BR />
        <form:hidden path="persona.id" value="${paciente.persona.id}" /><BR />
        <form:hidden path="persona.fregistro" value="${dateReg}" /><BR />
            
    </form:form>
	
<jsp:include page="../template/content/foot.jsp" />