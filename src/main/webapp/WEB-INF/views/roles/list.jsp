

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../template/content/head.jsp" />
	
	<c:set var="cnt" value="0" />
	<h3>Roles</h3>
		<c:url var="action" value="/app/roles/create" />
	<form:form method="post" modelAttribute="rol" action="${action}">
		Descripcion<form:input 	path="descripción" 			type="text" 		cssClass="form-control"/>
		<form:hidden 	path="activo"  			value="S"   />
		<form:hidden 	path="id" />
		<input 			type="submit" value="Guardar" /> 
	</form:form>
	<table class="table-responsive table">
        <thead>
            <tr>
              	<td> No. </td>
                <td>Descripcion</td>              
                <td>...</td>  
            </tr>
        </thead>
        <tbody>
    		  <c:forEach items="${roles}" var="item">
    		  		<c:set var="cnt" value="${cnt + 1}" />
    				<tr  view='<c:url value="/app/roles/view/${item.id}" />' >
		                <td> ${cnt} </td>
		                <td> ${item.descripcion}</td>		              
		                <td>
		                	<a class='btn btn-danger' href='<c:url value="/app/roles/delete/" />${item.id}' >
		                		<i class='ui-icon ui-icon-trash' ></i>
		                	</a>
		                	<a class='btn btn-default'  href='<c:url value="/app/roles/update/" />${item.id}' >
		                		<i class='ui-icon ui-icon-pencil' ></i>
		                	</a>
		                </td>  
		            </tr>  
    		  </c:forEach>     
        </tbody>
    </table>
<jsp:include page="../template/content/foot.jsp" />
    
            
            
            
            
            
          
