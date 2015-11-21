
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../template/content/head.jsp" />

	<form:form action='<c:url value="/app/facturacion/create"  />' method="post" modelAttribute="factura" >
		<h3>Nueva Factura</h3>
		<div class="row" >
         <div class="col-sm-5">
            Fecha: <form:input type="text" path="fecha" disabled="" cssClass="form-control" />
         </div>
         <div class="col-sm-5">
            Forma de Pago: <form:input type="text" path="forma" cssClass="form-control" />
            <form:hidden type="text" path="formaId"  />
          </div>
         	Cliente: 	
         	<form:hidden type="text" path="cliente" cssClass="form-control"   />
         	Cita: 	
         	<form:input type="text" path="cliente"  cssClass="form-cotrol"  disabled="" /><input type="button" value="cita" >
         	<form:hidden type="text" path="citaId"  />
		</div>
	</form:form>
		
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
	    <!-- tabla -->
	    
	    
	    
	  </div>
	  <!-- 
	  <div id="menu1" class="tab-pane fade">
	    <h3>Formas de Pago</h3>
	    
	  </div>
	  -->
	  <!-- 	  
	  <div id="menu3" class="tab-pane fade">
	    <h3>Pagos</h3>
	    <p>
         
       </p>
	  </div>
	  -->
	</div>
	</div>
	
	
	
	
	<!-- 
	FILTRAR LAS CITAS
	 -->
	 <jsp:include page="citaFiltro.jsp" />
	 <jsp:include page="formaFiltro.jsp" />
	 
	 
		
<jsp:include page="../template/content/foot.jsp" />















