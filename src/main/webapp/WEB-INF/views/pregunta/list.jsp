<%-- 
    Document   : list
    Created on : 15-nov-2015, 4:06:22
    Author     : Heraldo
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<jsp:include page="../template/content/head.jsp" />
	
	<c:set var="cnt" value="0" />
	<h3>Pregunta</h3>
	<a class='btn btn-primary' href="<c:url value='/app/pregunta/create'  />">
		<i class='ui-icon ui-icon-plus' ></i>
	</a>
	<table class="table-responsive table">
        <thead>
            <tr>
                <td>No</td>
                <td>Descripcion de la pregunta</td>
                <td>...</td>  
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${preguntas}" var="item">
                          <c:set var="cnt" value="${cnt + 1}" />
                          <tr  view='<c:url value="/app/pregunta/view/${item.id}" />' >
                          <td> ${cnt} </td>
                          <td> ${item.descripcion}</td>
                          <td>
                                <a class='btn btn-danger' href='<c:url value="/app/pregunta/delete/" />${item.id}' >
                                        <i class='ui-icon ui-icon-trash' ></i>
                                </a>
                                <a class='btn btn-default'  href='<c:url value="/app/pregunta/update/" />${item.id}' >
                                        <i class='ui-icon ui-icon-pencil' ></i>
                                </a>
                          </td>  
                      </tr>  
            </c:forEach>     
        </tbody>
    </table>
<jsp:include page="../template/content/foot.jsp" />