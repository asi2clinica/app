
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="../template/content/head.jsp" />
	
	<c:set var="cnt" value="0" />
	<h3>Paciente</h3>
	
	<c:url var="action" value="/app/paciente/view/" />
	<form:form action="${action}" method="post" modelAttribute="paciente" >
            
            <!-- Formateadores de fecha -->
            <fmt:formatDate var="dateReg" value="${paciente.persona.fregistro}" pattern="dd/MM/yyyy"/>
            <fmt:formatDate var="dateNac" value="${paciente.persona.fregistro}" pattern="dd/MM/yyyy"/>
     
            Nombre:  ${persona.nombre} <BR /><BR />
            Apellido:  <form:input path="persona.apellido" cssClass="" readonly="true" /><BR /><BR />
            Genero:  
               <form:select path="persona.genero" cssClass="form-c ontrol" >
                    <form:option value="F" label="F" />
                    <form:option value="M" label="M" />
              </form:select><BR /><BR />

              Direccion:  <form:input path="persona.direccion" cssClass="" readonly="true" /><BR /><BR />
              Fecha Nac:  <form:input path="persona.fnacimiento" value="${dateNac}" cssClass="" readonly="true" /><BR /><BR />
              mail:  <form:input path="persona.email" cssClass="" readonly="true" /><BR /><BR />
              tipo:  
                    <form:select path="tipo" cssClass="disabled"  >
                            <c:forEach items="${tipoPacientes}" var="item">
                                    <form:option value="${item.id}"> ${item.tipo} </form:option>
                            </c:forEach>
                    </form:select><BR /><BR />
               <form:hidden path="id" value="${id}" /><BR />
            <form:hidden path="persona.id" value="${paciente.persona.id}" /><BR />
            <form:hidden path="persona.fregistro" value="${dateReg}" /><BR />

	</form:form>		
	
<jsp:include page="../template/content/foot.jsp" />