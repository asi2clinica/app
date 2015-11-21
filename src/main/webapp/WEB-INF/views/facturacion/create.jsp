
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../template/content/head.jsp" />

	<form:form action='<c:url value="/app/facturacion/create"  />' method="post" modelAttribute="factura" >
		<h3>Nueva Factura</h3>
		<div class="row" >
            Forma de Pago: <label id="forma"></label>
            <input type="button" value="Forma de Pago" data-toggle="modal" data-target="#formPagoDlg" >
            <form:hidden path="formaId"  />
		</div>
		<div class="row" >
			Cliente: 	
         	<form:hidden path="cliente" cssClass="form-control"   />
         	<BR />
         	Cita:<label id="cita"></label> 	
         	<input type="button" value="cita" data-toggle="modal" data-target="#myModal" >
         	<form:hidden  path="citaId"  />
		</div>
		<input type="submit" value="Guardar" >
	</form:form>
		
	<!-- 		
		
	<div class="clear">
	</div>
	
	<div class="row">
	<ul class="nav nav-tabs">
  		<li class="active"><a data-toggle="tab" href="#home">Detalles</a></li>
  		<li><a data-toggle="tab" href="#menu3">Pagos</a></li>
	</ul>

	<div class="tab-content">
	  <div id="home" class="tab-pane fade in active">
	    <h3>Detalles</h3>
	   
	    
	    
	    
	  </div>
	   
	  <div id="menu1" class="tab-pane fade">
	    <h3>Formas de Pago</h3>
	    
	  </div>
	  
	   	  
	  <div id="menu3" class="tab-pane fade">
	    <h3>Pagos</h3>
	    <p>
         
       </p>
	  </div>
	  
	</div>
	</div>
	-->
	
	
	
	<!-- 
	FILTRAR LAS CITAS
	 -->
	 
	 <!-- 
	 	<jsp:include page="citaFiltro.jsp" />
	 	<jsp:include page="formaFiltro.jsp" />
	  -->
	 
		
<jsp:include page="../template/content/foot.jsp" />















