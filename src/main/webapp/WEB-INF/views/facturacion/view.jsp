
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../template/content/head.jsp" />
		
		<div class="row">
			<h3>Factura</h3>
			<div class="col-sm-5">
				Cliente:
				<label>${factura.cliente}</label> 
			</div>
			<div class="col-sm-5">
				Fecha: 
				<label>${factura.fecha}</label>
			</div>	
		</div>	
		<div class="row">
		<h3>Detalle</h3>
			<table class="table-responsive table">
        <thead>
            <tr>
                <td>No</td>
                <td>Producto/Servicio</td>
                <td>Monto</td>
                <td>...</td>  
            </tr>
        </thead>
        <tbody>
    		  <c:forEach items="${factura.detalleFactuas}" var="item">
    		  		<c:set var="cnt" value="${cnt + 1}" />
    				<tr >
		                <td> ${cnt} </td>
		                <td> ${item.servicio}</td>
		                <td> ${item.precio}</td>
		                <td></td>  
		            </tr>  
    		  </c:forEach>     
        </tbody>
    </table>
		</div>
<jsp:include page="../template/content/foot.jsp" />
