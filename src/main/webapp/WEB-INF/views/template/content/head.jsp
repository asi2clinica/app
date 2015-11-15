<%@ taglib prefix="spring" 	uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" 	uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" 		uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
    <head>
	<meta charset="utf-8" />
    	<title>Sistema Clinico Dental</title>
    	<meta content="width=device-width, initial-scale=1.0" name="viewport" />
        
	<link href='<spring:url value="/resources/assets/bootstrap/css/bootstrap.min.css" />' rel="stylesheet" />		
	<link href="<spring:url value="/resources/assets/bootstrap/css/bootstrap-responsive.min.css" />" rel="stylesheet" />
        <link href="<spring:url value="/resources/assets/bootstrap/css/bootstrap-fileupload.css" />" rel="stylesheet" />
        <link href="<spring:url value="/resources/assets/font-awesome/css/font-awesome.css" />" rel="stylesheet" />
        <link href='<spring:url value="/resources/css/style.css" />' rel="stylesheet" />
        <link href='<spring:url value="/resources/css/style-responsive.css" />' rel="stylesheet" />
        <link href='<spring:url value="/resources/css/style-default.css" />' rel="stylesheet" />
        <link href='<spring:url value="/resources/css/jquery.dataTables.min.css" />' rel="stylesheet" />
        <link href="<spring:url value="/resources/assets/fancybox/jquery.fancybox.css" />" rel="stylesheet" />
        <link href="<spring:url value="/resources/assets/uniform/css/uniform.default.css" />" rel="stylesheet" />
        <link href="<spring:url value="/resources/assets/chosen-bootstrap/chosen/chosen.css" />" rel="stylesheet" />
        <link href="<spring:url value="/resources/assets/jquery-tags-input/jquery.tagsinput.css" />" rel="stylesheet" />
        <link href="<spring:url value="/resources/assets/clockface/css/clockface.css" />" rel="stylesheet" />
        <link href="<spring:url value="/resources/assets/bootstrap-wysihtml5/bootstrap-wysihtml5.css" />" rel="stylesheet" />
        <link href="<spring:url value="/resources/assets/bootstrap-datepicker/css/datepicker.css" />" rel="stylesheet" />
        <link href="<spring:url value="/resources/assets/bootstrap-timepicker/compiled/timepicker.css" />" rel="stylesheet" />
        <link href="<spring:url value="/resources/assets/bootstrap-colorpicker/css/colorpicker.css" />" rel="stylesheet" />
        <link href="<spring:url value="/resources/assets/bootstrap-toggle-buttons/static/stylesheets/bootstrap-toggle-buttons.css" />" rel="stylesheet" />
        <link href="<spring:url value="/resources/assets/bootstrap-daterangepicker/daterangepicker.css" />" rel="stylesheet" />
    </head>
	<body>
        <div id="header" class="navbar navbar-inverse navbar-fixed-top">
            <!-- BEGIN TOP NAVIGATION BAR -->
            <div class="navbar-inner">
               <div class="container-fluid">
                   <!-- BEGIN LOGO -->
                   <a class="brand" href="index.html">
                       <img src="<spring:url value="/resources/img/logo.png" />" alt="sistema Odontol&oacute;gico" width="200" height="" />
                   </a>
                   <!-- END LOGO -->
                   <!-- BEGIN RESPONSIVE MENU TOGGLER -->
                   <a class="btn btn-navbar collapsed" id="main_menu_trigger" data-toggle="collapse" data-target=".nav-collapse">
                       <span class="icon-bar"></span>
                       <span class="icon-bar"></span>
                       <span class="icon-bar"></span>
                       <span class="arrow"></span>
                   </a>
                   <!-- END RESPONSIVE MENU TOGGLER -->
                   <div id="top_menu" class="nav notify-row">
                       <!-- BEGIN NOTIFICATION -->
                   </div>
                   <!-- END  NOTIFICATION -->
                   <div class="top-nav ">
                       <ul class="nav pull-right top-menu" >
                           <!-- BEGIN USER LOGIN DROPDOWN -->
                           <li class="dropdown">
                               <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                  <sec:authorize access="hasRole('USER')">
                                   		<c:if test="${pageContext.request.userPrincipal.name != null}">
											<span class="username">${pageContext.request.userPrincipal.name}</span>
										</c:if>
                                  </sec:authorize>
                                   <b class="caret"></b>
                               </a>
                               <ul class="dropdown-menu extended logout">
                               <sec:authorize access="hasRole('USER')">
                                   <li><a href="#">Mi perfil</a></li>
                                   <li><a href="#">Mi configuracion</a></li>
                                   <li><a href="<c:url value='/logout' />">cerrar sesion</a></li>
                                </sec:authorize>
                               </ul>
                               
                           </li>
                           <!-- END USER LOGIN DROPDOWN -->
                       </ul>
                       <!-- END TOP NAVIGATION MENU -->
                   </div>
               </div>
           </div>
           <!-- END TOP NAVIGATION BAR -->
               <div style="clear:both;"></div>
               <!-- BEGIN SIDEBAR MENU -->
                    <div id="navslider" style="width:100%; background: #fff;">
                            <div id='cssmenu'>
                            <sec:authorize access="hasRole('USER')">
                                    <ul>
                                            <li><a href='index.html'>Inicio</a></li>
                                            <li class='active has-sub'><a href='#'>Registro</a>
                                                    <ul>
                                                            <li class='has-sub'><a href='#'>Paciente</a>
                                                                    <ul>
                                                                       <li><a href='formulario_medico.html'>Registro de Paciente</a></li>
                                                                       <li><a href='preclinico.html'>Pre Clinico</a></li>
                                                                       <li><a href='mantenimientopre.html'>Mantenimiento preclinico</a></li>
                                                                    </ul>
                                                            </li>
                                                            <li class='has-sub'><a href='#'>Medicos</a>
                                                                    <ul>
                                                                       <li><a href='formulario_medico.html'>Registro Medico</a></li>
                                                                       <li><a href='controlDeMedicos.html'>Agregar Medico</a></li>
                                                                       <li><a href='administracionDeMedicos.html'>Administracion de Medicos</a></li>
                                                                       <li><a href='Especialidades.html'>Especialidades</a></li>
                                                                       <li><a href='Lista Especialidades.html'>Lista Especialidades</a></li>
                                                                    </ul>
                                                            </li>
                                                            <li class='has-sub'><a href='#'>Citas</a>
                                                                    <ul>
                                                                       <li><a href='consulhor.html'>Consulta Horarios</a></li>
                                                                            <li class='has-sub'><a href='#'>Agenda</a>
                                                                                    <ul>
                                                                                       <li><a href='agenda.html'>Agenda</a></li>
                                                                                       <li><a href='agendarcita.html'>Agendar Cita</a></li>
                                                                                       <li><a href='cambiohorario.html'>Cambio de Horarios</a></li>
                                                                                       <li><a href='ultimaCita.html'>Ultima Cita</a></li>
                                                                                    </ul>
                                                                            </li>
                                                                    </ul>
                                                            </li>
                                                    </ul>
                                            </li>
                                            <li><a href='#'>Expedientes paciente</a>
                                                    <ul>
                                                            <li ><a href='consultadatos.html'>Consulta Datos</a></li>
                                                            <li ><a href='consultahistico.html'>Consulta Historial</a></li>
                                                            <li ><a href='odontograma.html'>Odontograma</a></li>
                                                            <li class='has-sub'><a href='#'>Trabajos Realizados</a>
                                                                    <ul>
                                                                       <li><a href='Mantenimiento catalogos.html'>Listado</a></li>
                                                                       <li><a href='Catalogo Trabajos.html'>Registrar Trabajo</a></li>
                                                                    </ul>
                                                            </li>
                                                            <li class='has-sub'><a href='#'>Catalogo Enfermedad</a>
                                                                    <ul>
                                                                       <li><a href='Enfermedades.html'>Enfermedades</a></li>
                                                                       <li><a href='Lista Enfermedades.html'>Lista Enfermedades</a></li>
                                                                    </ul>
                                                            </li>
                                                    </ul>
                                            </li>
                                            <li><a href='#'>Facturacion</a>
                                                    <ul>
                                                            <li ><a href='generafact.html'>Generacion factura</a></li>
                                                            <li ><a href='histpago.html'>Historial de Pagos</a></li>
                                                            <li ><a href='cuentasporcobrar.html'>Cuentas Por Cobrar</a></li>

                                                    </ul>
                                            </li>
                                            <li><a href='#'>Almacen</a>
                                                    <ul>
                                                            <li ><a href='inventario.html'>Inventario</a></li>
                                                            <li ><a href='stock.html'>Stock</a></li>
                                                            <li ><a href='proveedor.html'>Proveedores</a></li>
                                                            <li ><a href='movimientoprod.html'>Movimientos productos</a></li>
                                                    </ul>
                                            </li>
                                            <li><a href='#'>Reportes</a>
                                                    <ul>
                                                            <li ><a href='repfact.html'>Reporte de Facturas</a></li>
                                                            <li ><a href='repcita.html'>Reporte Citas</a></li>
                                                            <li ><a href='repinv.html'>Reporte de Inventario</a></li>
                                                            <li ><a href='repmovi.html'>Reporte de Movimientos</a></li>
                                                            <li ><a href='repcli.html'>Reporte Clinico</a></li>
                                                            <li ><a href='reptrans.html'>Reporte Transaccional</a></li>
                                                    </ul>
                                            </li>
                                            <li><a href='#'>Gestion Usuarios</a>
                                                    <ul>
                                                            <li ><a href='gestionuser.html'>Administracion de Usuarios</a></li>
                                                            <li ><a href='rolesuser.html'>Roles</a></li>
                                                            <li ><a href='rolesusertipe.html'>Tipo de Roles</a></li>
                                                            <li ><a href='asignacionpermiso.html'>Asignacion de permisos</a></li>
                                                    </ul>
                                            </li>
                                            <li><a href='#'>Configuraciones</a>
                                                    <ul>
                                                            <li ><a href='gestionuser.html'>Configuraciones Generales</a></li>
                                                            <li ><a href='sucursales.html'>Sucursales</a></li>
                                                    </ul>
                                            </li>
                                    </ul>
                                    </sec:authorize>
                            </div>
                    </div>
            <!-- END SIDEBAR MENU -->
        </div>
            
            
        