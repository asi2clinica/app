<%@ taglib prefix="spring" 	uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" 	uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" 		uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8" />
    	<title>Sistema Clinico Dental</title>
    	<meta content="width=device-width, initial-scale=1.0" 						name="viewport" />
		<link href='<spring:url value="/resources/css/bootstrap.min.css" />' 		rel="stylesheet" />		
		<link href='<spring:url value="/resources/css/style.css" />' 				rel="stylesheet" />	
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
                        <img alt="logo" src='<spring:url value="/resources/img/logo.png" />'>
                    </a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right top-op">
	                    <c:if test="${pageContext.request.userPrincipal.name != null}">
							Bienvenido: <b>${pageContext.request.userPrincipal.name} </b>
						</c:if>
						
                    	<sec:authorize access="hasRole('USER')">
	                        <li><a href="#" >Perfil</a></li>
	                      	<li><a href="<c:url value='/logout' />" >Salir</a></li>
	                     </sec:authorize>
                    </ul>
                </div>
            </div>
        </nav>
