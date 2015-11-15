
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="template/content/head.jsp" />
	
	
	 <!-- BEGIN CONTAINER -->
   <div id="container" class="row-fluid" style="margin-top: 155px;">
      <!-- BEGIN PAGE -->
      <div id="main-content">
         <!-- BEGIN PAGE CONTAINER-->
         <div class="container-fluid">
            <!-- BEGIN PAGE CONTENT-->
            <div class="row-fluid">
                    <!-- BEGIN SAMPLE FORMPORTLET-->
                    <div class="widget green">
                        <div class="widget-title">
                            <h4><i class="icon-reorder"></i>Registro de Cita</h4>
                            <span class="tools">
                            <a href="javascript:;" class="icon-chevron-down"></a>
                            <a href="javascript:;" class="icon-remove"></a>
                            </span>
                        </div>
                        <div class="widget-body">
                            <!-- BEGIN FORM-->
                            <form action="PacienteCtrl" method="post" class="form-horizontal">
                            
                                <div class="control-group">
                                    <label class="control-label">Nombre del Paciente</label>
                                    <div class="controls"><input class="span6 " id="nombre" name="nombre" type="text" required="required"></div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Fecha</label>
                                    <div class="controls"><input class="span6  tooltips" id="apellido" name="apellido"  type="date" required="required"></div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Correo electronico</label>
                                    <div class="controls">
                                        <div class="input-icon left"><i class="icon-envelope"></i><input class=" " id="correo" name="correo"  type="text" required="required"></div>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Medico</label>
                                    <div class="controls"><input class="span6 " id="nombre" name="nombre" type="text"></div>
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
	
<jsp:include page="template/content/foot.jsp" />
