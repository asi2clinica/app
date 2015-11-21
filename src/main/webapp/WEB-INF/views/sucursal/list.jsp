<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../template/content/head.jsp" />
	
	<c:set var="cnt" value="0" />
	<h3>Sucursal</h3>
	<a class='btn btn-primary' href="<c:url value='/app/sucursal/create'  />">
		<i class='ui-icon ui-icon-plus' ></i>
	</a>
	<table class="table-responsive table">
        <thead>
            <tr>
              <td>No</td>
                <td>Nombre</td>
                <td>E-mail</td>
                <td>Direccion</td>
                <td>Telefono</td>  
                <td>...</td>  
            </tr>
        </thead>
        <tbody>
    		  <c:forEach items="${sucursale}" var="item">
    		  		<c:set var="cnt" value="${cnt + 1}" />
    				<tr  view='<c:url value="/app/sucursal/view/${item.id}" />' >
		                <td> ${cnt} </td>
		                <td> ${item.nombre}</td>
		                <td> ${item.email}</td>
		                <td> ${item.direccion}</td>
                      <td> ${item.telefono}</td>
		                <td>
		                	<a class='btn btn-danger' href='<c:url value="/app/sucursal/delete/" />${item.id}' >
		                		<i class='ui-icon ui-icon-trash' ></i>
		                	</a>
		                	<a class='btn btn-default'  href='<c:url value="/app/sucursal/update/" />${item.id}' >
		                		<i class='ui-icon ui-icon-pencil' ></i>
		                	</a>
		                </td>  
		            </tr>  
    		  </c:forEach>     
        </tbody>
    </table>
<jsp:include page="../template/content/foot.jsp" />

