
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<jsp:include page="../template/content/head.jsp" />

   <!-- BEGIN CONTAINER -->
   <div id="container" class="row-fluid" style="margin-top: 155px;">
      <!-- BEGIN SIDEBAR --><jsp:include page="../template/content/In_SecSidebar.jsp" /><!-- END SIDEBAR -->
      <!-- BEGIN PAGE -->
      <div id="main-content">
         <!-- BEGIN PAGE CONTAINER-->
         <div class="container-fluid">
            <!-- BEGIN PAGE HEADER--><jsp:include page="../template/content/In_SecPageHeader.jsp" /><!-- END PAGE HEADER-->
            <!-- BEGIN PAGE CONTENT-->
            <div class="row-fluid">
                    <!-- BEGIN SAMPLE FORMPORTLET-->
                    <div class="widget green">
                        <div class="widget-title">
                            <h4><i class="icon-reorder"></i> Mantenimiento de Tipos de Rol</h4>
                            <span class="tools">
                            <a href="javascript:;" class="icon-chevron-down"></a>
                            <a href="javascript:;" class="icon-remove"></a>
                            </span>
                        </div>
                        <div class="widget-body">
                            <!-- BEGIN FORM-->
                            <form action="PacienteCtrl" method="post" class="form-horizontal">
                                <div class="control-group">
                                    <label class="control-label">Nombres</label>
                                    <div class="controls"><input class="span6 " id="nombre" name="nombre" type="text"></div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Apellidos</label>
                                    <div class="controls"><input class="span6  tooltips" id="apellido" name="apellido"  type="text"></div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Genero</label>
                                    <div class="controls">
                                        <select id="genero" name="genero">
                                            <option value="F">Femenino</option>
                                            <option value="M">Masculino</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Correo electronico</label>
                                    <div class="controls">
                                        <div class="input-icon left"><i class="icon-envelope"></i><input class=" " id="correo" name="correo"  type="text"></div>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Fecha de nacimiento</label>
                                    <div class="controls"><input class="span2  tooltips" id="fechana" name="fechana" type="date"></div>
                                </div>                                
                                <div class="control-group">
                                    <label class="control-label">Municipio</label>
                                    <div class="controls"><input class="span6  tooltips" id="municipio" name="municipio" type="text"></div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Direccion</label>
                                    <div class="controls"><textarea class="span6 " id="direccion" name="direccion" rows="3"></textarea></div>
                                </div>
                                <div class="form-actions">
                                    <button type="submit" class="btn blue"><i class="icon-ok"></i> Guardar</button>
                                    <button type="button" class="btn"><i class=" icon-remove"></i> Cancelar</button>
                                </div>
                            </form>
                            <!-- END FORM-->
                        </div>
                    </div>
                    <!-- END SAMPLE FORM PORTLET-->
                </div>
                <!-- END BEGIN PAGE CONTENT-->
            </div>
            <!-- END PAGE CONTENT-->    
         </div>
         <!-- END PAGE CONTAINER-->
      </div>

            
        <table id="tablelist" class="display tablelist" cellspacing="0" width="100%">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Rol</th>
                    <th colspan="2">Opciones</th>
                </tr>
            </thead>
            <tfoot>
                <tr>
                    <th>ID</th>
                    <th>Rol</th>
                    <th colspan="2">Opciones</th>
                </tr>
            </tfoot>
            <tbody>
                <c:forEach items="${roles}" var="item" > 
			<tr>
                            <td>${item.id}</td>
                            <td>${item.descripcion}</td>
                            <td><a href='<c:url value="/app/roles/delete/" /> ${item.id}' >eliminar</a></td>
                            <td><a href='<c:url value="/app/roles/update/" /> ${item.id}' >editar</a></td>
			</tr>		
		</c:forEach>
            </tbody>
        </table>        
            
            
            
            
            
            <div class="container">
	<div class="col-sm-12 ">
		<div class="panel panel-primary" >
			<div  class="panel-body">
					<div class="col-sm-4 col-md-4" >
						
					</div>
<br><br><br><br><br><br><br><br>
    
    <c:url var="action" value="/app/roles/create" />
	<c:if test="${action}">
		<c:url var="action" value="/app/roles/save" />
	</c:if>

	
	<form:form method="post" modelAttribute="rol" action="${action}">
		<form:input 	path="descripcion" 	type="text" 	 cssClass="required"  	/>
		<form:input 	path="activo" type="hidden" value="S"   />
		<form:hidden 	path="id" />
		<input 			type="submit" value="Guardar" /> 
	</form:form>

<table>
	<thead>
		<tr>
			<td>Descripción</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${roles}" var="item" > 
			 <tr>
				<td>${item.descripcion}</td>
			</tr>
			<tr>
				<td><a href='<c:url value="/app/roles/delete/" /> ${item.id}' >eliminar</a></td>
				<td><a href='<c:url value="/app/roles/update/" /> ${item.id}' >editar</a></td>
			</tr>			
		</c:forEach>
	</tbody>
</table>
<div class="col-sm-4 col-md-4" >
						
					</div>
			</div>
		</div>
	</div>
</div>
            
            
            
            
<jsp:include page="../template/content/foot.jsp" />
