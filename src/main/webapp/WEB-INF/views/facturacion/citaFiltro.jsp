<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Trigger the modal with a button -->


<!-- Modal -->
<div id="citaModal" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Citas</h4>
      </div>
      <div class="modal-body">
        <p>
        	<c:set var="cnt1" value="0" />
        	<table class="table-responsive table">
        		<thead>
          		<tr>
              	 <td>No</td>
                 <td>Forma</td>
              </tr>
          	</thead>  
        		<tbody>		
		          <c:forEach items="${citas}" var="item">
		                 <c:set var="cnt1" value="${cnt1 + 1}"  />
		                 <tr class="cita"  pk="${item.id}" name="${item.paciente.persona.nombre}" >
		                        <td style="min-width: 70px"> ${cnt1} </td>
		                        <td style="min-width: 400px"> ${item.paciente.persona.nombre}</td>
		                    </tr>  
		             </c:forEach>
		    	</tbody>
        	</table>         
        </p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>

  </div>
</div>