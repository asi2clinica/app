
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../template/content/head.jsp" />
	
	<c:set var="cnt" value="0" />
	<h3>Citas</h3>
	<a class='btn btn-primary' href="<c:url value='/app/cita/create'  />">
		<i class='ui-icon ui-icon-plus' ></i>
	</a>
	<table class="table-responsive table">
        <thead>
            <tr>
                <td>No</td>
                <td>Secretaria</td>
                <td>Paciente</td>
                <td>Doctor</td>   
                <td>Sucursal</td>   
                <td>Horario</td>   
                <td>Estado Cita</td>   
                <td>Fecha Registro</td>   
                <td>Fecha Programacion Cita</td>   
                <td>...</td>  
            </tr>
        </thead>
        <tbody>
    		  <c:forEach items="${citas}" var="item">
    		  		<c:set var="cnt" value="${cnt + 1}" />
    				<tr  view='<c:url value="/app/cita/view/${item.id}" />' >
		                <td> ${cnt} </td>
		                <td> ${item.secretaria.nombre}</td>
		                <td> ${item.paciente.nombre}</td>
		                <td> ${item.doctor.nombre}</td>
		                <td> ${item.sucursal.nombre}</td>
		                <td> ${item.horario.nombre}</td>
		                <td> ${item.estadoCita.nombre}</td>
		                <td> ${item.fechaRegistro}</td>
		                <td> ${item.fechaProgramacionCita}</td>
		                <td>
		                	<a class='btn btn-danger' href='<c:url value="/app/cita/delete/" /> ${item.id}' >
		                		<i class='ui-icon ui-icon-trash' ></i>
		                	</a>
		                	<a class='btn btn-default'  href='<c:url value="/app/cita/update/" /> ${item.id}' >
		                		<i class='ui-icon ui-icon-pencil' ></i>
		                	</a>
		                </td>  
		            </tr>  
    		  </c:forEach>     
        </tbody>
    </table>
<jsp:include page="../template/content/foot.jsp" />
