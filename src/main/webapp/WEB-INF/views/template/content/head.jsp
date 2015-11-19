<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="description" content="Proyeto para ASI2-UFG">
		<meta name="author" content="">			
        <title>Clinica Dental</title>
        <!--  Estilos -->
        <link 	href="<c:url value='/resources/css/jquery-ui.min.css' />" 				rel="stylesheet">
		<link 	href="<c:url value='/resources/css/bootstrap.min.css' />" 		 		rel="stylesheet">
        <link 	href="<c:url value='/resources/css/dashboard.css' />" 					rel="stylesheet">
        <link	href="<c:url value='/resources/css/dataTables.bootstrap.min.css' />" 	rel="stylesheet">
        <script src="<c:url value='/resources/js/jquery.min.js' />" ></script>
        <script src="<c:url value='/resources/js/bootstrap.min.js' />" ></script>
         <script src="<c:url value='/resources/js/jquery-ui.min.js' />" ></script>
     		<script src="<c:url value='/resources/js/jquery.validation.js' />" ></script>
    </head>
	<body>
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed"
                            data-toggle="collapse" data-target="#navbar"
                            aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Deslice</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">
                        <img src='<c:url value="/resources/img/logo.png" />' width="100" heigth="100" /> 
                    </a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#">Perfil</a></li>
                        <li><a href="<c:url value='/login?logout' />" >Salir</a></li>
                    </ul>
                </div>
            </div>
        </nav>

    <div class="container-fluid">
        <div class="row">
            <div class="col-sm-3 col-md-2 sidebar">
                <ul class="nav nav-sidebar">
                    <li><a href="<c:url value='/home' />"			>Inicio</a></li>
                    <li><a href="<c:url value='/app/paciente' />"	>Expedientes</a></li>
                    <li><a href="<c:url value='/app/cita' />"		>Citas</a></li>
                    <li><a href="<c:url value='/app/facturacion' />">Facturaci&oacute;n</a></li>
                    <li><a href="<c:url value='/app/inventario' />"	>Inventario</a></li>
                </ul>
            </div>
            <div class="col-sm-10 col-sm-offset-3 col-md-10 col-md-offset-2 main">

            