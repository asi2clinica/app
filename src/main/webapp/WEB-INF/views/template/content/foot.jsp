

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


				</div>
			</div>
		</div>
		<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
		<script src="<c:url value='/resources/js/ie10-viewport-bug-workaround.js' />" 	type="text/javascript"></script>
		<script src="<c:url value='/resources/js/jquery.dataTables.min.js' />" 			type="text/javascript"></script>
		<script src="<c:url value='/resources/js/dataTables.bootstrap.min.js' />" 		type="text/javascript"></script>
		<script src="<c:url value='/resources/js/default.js' />" 						type="text/javascript"></script>
	</body>
	<div id="cf" class="modal fade" role="dialog" >
		<div class="modal-dialog">
    		<div class="modal-content">
      			<div class="modal-header">
      				<button type="button" class="close" data-dismiss="modal">
      						<span aria-hidden="true">&times;</span>
      						<span class="sr-only">Close</span>
      				</button>
        			<h4 class="modal-title" id="myModalLabel">Confirmaci&oacute;</h4>
      			</div>
      			<div class="modal-body">
      					Esta completamente seguro?
      			</div>
      			  <div class="modal-footer">
        					<button type="button" class="btn btn-default" data-dismiss="modal">No</button>
        					<button type="button"  id="ok"class="btn btn-primary">Si</button>
      			  </div>
      		</div>
      	</div>
	</div>
	<div id="er" class="modal fade" role="dialog" >
		<div class="modal-dialog">
    		<div class="modal-content">
      			<div class="modal-header">
      				<button type="button" class="close" data-dismiss="modal">
      						<span aria-hidden="true">&times;</span>
      						<span class="sr-only">Close</span>
      				</button>
        			<h4 class="modal-title" id="myModalLabel">Error</h4>
      			</div>
      			<div class="modal-body">
      					<p id="error-msj"></p>
      			</div>
      			  <div class="modal-footer">
        					<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
      			  </div>
      		</div>
      	</div>
	</div>
	
	<style>
		.dataTables_wrapper .dataTables_paginate .paginate_button{
			padding: 0 !important;
		}
	</style>
</html>