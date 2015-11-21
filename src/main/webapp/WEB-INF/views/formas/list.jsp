

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../template/content/head.jsp" />
	
	<c:set var="cnt" value="0" />
	<h3>Formas de Pago</h3>
		<c:url var="action" value="/app/forma/create" />
	<form:form method="post" modelAttribute="forma" action="${action}">
		Descripci�n<form:input 	path="descipcion" 			type="text" 		cssClass="form-control"/>
		<form:hidden 	path="activo"  			value="S"   />
		<form:hidden 	path="id" />
		<input 			type="submit" value="Guardar" /> 
	</form:form>
	<table class="table-responsive table">
        <thead>
            <tr>
              	<td>No. </td>
                <td>Descripcion</td>              
                <td>...</td>  
            </tr>
        </thead>
        <tbody>
    		  <c:forEach items="${formas}" var="item">
    		  		<c:set var="cnt" value="${cnt + 1}" />
    				<tr  view='<c:url value="/app/formas/view/${item.id}" />' >
		                <td> ${cnt} </td>
		                <td> ${item.descipcion}</td>		              
		                <td>
		                	<a class='btn btn-danger' href='<c:url value="/app/forma/delete/" />${item.id}' >
		                		<i class='ui-icon ui-icon-trash' ></i>
		                	</a>
		                	<a class='btn btn-default'  href='<c:url value="/app/forma/update/" />${item.id}' >
		                		<i class='ui-icon ui-icon-pencil' ></i>
		                	</a>
		                </td>  
		            </tr>  
    		  </c:forEach>     
        </tbody>
    </table>
<jsp:include page="../template/content/foot.jsp" />
    
            
            
            
            
            
          
