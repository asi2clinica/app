
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../template/content/head.jsp" />

	<c:url var="action" value="/app/facturacion/create" />
	
	<form:form method="post" modelAttribute="factura" action="${action}" >
		<h3>Nueva Factura</h3>
		<div class="row" >
            Forma de Pago: <label id="forma"></label>
            <form:select path="formaId" cssClass="form-control">
            	<c:forEach items="${formas}" var="item">
            			 <form:option value="${item.id}">${item.descipcion}</form:option> 	
		         </c:forEach>  
            </form:select> 
		</div>
		<div class="row" >
			Cliente: 	
         	<form:input path="cliente" cssClass="form-control"   />
         	Cita:
         	<form:select path="citaId" cssClass="form-control">
            	 <c:forEach items="${citas}" var="item">
            			<form:option value="${item.id}">${item.paciente.persona.nombre}</form:option>
		         </c:forEach>  
            </form:select>  	         
		</div>
		<BR />
		<input type="submit" value="Guardar" class="btn" >
	</form:form>
	

<jsp:include page="../template/content/foot.jsp" />















