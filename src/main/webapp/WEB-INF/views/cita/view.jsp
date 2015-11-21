
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../template/content/head.jsp" />
	
	<c:set var="cnt" value="0" />
        <a class='btn btn-primary' href="<c:url value='/app/cita/'  />">Volve al listado general</a>
	<h3>Cita</h3>
	
        <c:set var="action" value="/app/cita/view/" />
<form:form action="${action}" method="post" modelAttribute="cita" >
    
    <b>Secretaria:</b> ${cita.secretaria.nombre}  <BR /><BR />
    <b>Paciente:</b>${cita.paciente.persona.nombre} <BR /><BR />
    <b>Doctor:</b>${cita.doctor.nombre} <BR /><BR />
    <b>Sucursal:</b>${cita.sucursal.nombre} <BR /><BR />
    <b>Horario:</b>${cita.horario.nombre} <BR /><BR />
    <b>Estado Cita:</b>${cita.estadosCita.nombre}<BR /><BR />
    <b>Fecha Registro:</b>${cita.fechaRegistro}<BR /><BR />
    <b>Fecha Programacion Cita:</b>${cita.fechaProgramacionCita}<BR /><BR />
    <form:hidden path="id" value="${id}" /><BR />
    <input type="submit" /> 

</form:form>	
	
	
<jsp:include page="../template/content/foot.jsp" />
