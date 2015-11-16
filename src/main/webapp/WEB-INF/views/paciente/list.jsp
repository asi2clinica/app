
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../template/content/head.jsp" />
	
	<c:set var="cnt" value="0" />
	<h3>Pacientes</h3>
	<a class='btn btn-primary' href="<c:url value='/app/paciente/create'  />">
		<i class='ui-icon ui-icon-plus' ></i>
	</a>
	<table class="table-responsive table">
        <thead>
            <tr>
                <td>No</td>
                <td>Nombre</td>
                <td>Apellido</td>
                <td>E-mail</td>   
                <td>...</td>  
            </tr>
        </thead>
        <tbody>
    		  <c:forEach items="${pacientes}" var="item">
    		  		<c:set var="cnt" value="${cnt + 1}" />
    				<tr  view='<c:url value="/app/paciente/view/${item.id}" />' >
		                <td> ${cnt} </td>
		                <td> ${item.persona.nombre}</td>
		                <td> ${item.persona.apellido}</td>
		                <td> ${item.persona.email}</td>
		                <td>
		                	<a class='btn btn-danger' href='<c:url value="/app/paciente/delete/" /> ${item.id}' >
		                		<i class='ui-icon ui-icon-trash' ></i>
		                	</a>
		                	<a class='btn btn-default'  href='<c:url value="/app/paciente/update/" /> ${item.id}' >
		                		<i class='ui-icon ui-icon-pencil' ></i>
		                	</a>
		                </td>  
		            </tr>  
    		  </c:forEach>     
        </tbody>
    </table>
<jsp:include page="../template/content/foot.jsp" />
