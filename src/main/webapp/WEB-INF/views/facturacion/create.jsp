
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../template/content/head.jsp" />

	<h3>Nueva Factura</h3>
	<div>
	
	</div>
	<div>
		
	</div>	
	
	<ul class="nav nav-tabs">
  		<li class="active"><a data-toggle="tab" href="#home">Detalles</a></li>
  		<li><a data-toggle="tab" href="#menu1">Formas de Pago</a></li>
  		<li><a data-toggle="tab" href="#menu2">Cita</a></li>
  		<li><a data-toggle="tab" href="#menu3">Pagos</a></li>
	</ul>

	<div class="tab-content">
	  <div id="home" class="tab-pane fade in active">
	    <h3>Detalles</h3>
	    
	  </div>
	  <div id="menu1" class="tab-pane fade">
	    <h3>Formas de Pago</h3>
	    <p>Some content in menu 1.</p>
	  </div>
	  <div id="menu2" class="tab-pane fade">
	    <h3>Cita</h3>
	    <p></p>
	  </div>
	  <div id="menu3" class="tab-pane fade">
	    <h3>Pagos</h3>
	    <p></p>
	  </div>
	</div>
	
	
	
	
	
	<!-- 
	FILTRAR LAS CITAS
	 -->
	 <jsp:include page="citaFiltro.jsp" />
	 
	 
		
<jsp:include page="../template/content/foot.jsp" />









