
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../template/content/head.jsp" />

<c:set var="cnt" value="0" />
<h3>Cita</h3>

<c:set var="action" value="/app/cita/save" />
<form:form action="${action}" method="post" modelAttribute="cita" >
    
   
    Secretaria:
    <form:select path="secretaria" cssClass="form-control"  required="true" >
        <c:forEach items="${secretarias}" var="item">
            <form:option value="${item.id}" >${item.nombre}</form:option>
        </c:forEach>
        
    </form:select>
    <BR />
    Paciente:
    <form:select path="paciente" cssClass="form-control"  required="true" >
        <c:forEach items="${pacientes}" var="item">
            <form:option value="${item.id}" >${item.persona.nombre}</form:option>
        </c:forEach>
        
    </form:select>
    <BR />
    Doctor:
    <form:select path="doctor" cssClass="form-control" required="true"  >
        <c:forEach items="${doctores}" var="item">
            <form:option value="${item.id}" >${item.nombre}</form:option>
        </c:forEach>
    </form:select>
    <BR />
    Sucursal:
    <form:select path="sucursal" cssClass="form-control"  required="true" >
        <c:forEach items="${sucursales}" var="item">
            <form:option value="${item.id}" >${item.nombre}</form:option>
        </c:forEach>
    </form:select>
    <BR />
    Horario:
    <form:select path="horario" cssClass="form-control" required="true"  >
        
        <c:forEach  items="${horarios}" var="item">
            <form:option value="${item.id}">${item.nombre}</form:option>
        </c:forEach>
    </form:select>
    <BR />
    Estado Cita:
    <form:select path="estadosCita" cssClass="form-control" required="true"  >
        
        <forEach items="${estadosCita}" var="item">
            <form:option value="${item.id}">${item.nombre}</form:option>
        </forEach>
    </form:select>
    <BR />
    Fecha Registro:
    <form:input path="fechaRegistro" cssClass="form-control" required="true" /><BR />
    Fecha Programacion Cita:
    <form:input path="fechaProgramacionCita" cssClass="form-control" required="true" /><BR />
    <form:hidden path="id" value="${id}" /><BR />
    <input type="submit" /> 

</form:form>		

<jsp:include page="../template/content/foot.jsp" />









