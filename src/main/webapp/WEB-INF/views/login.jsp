     
<%@ taglib prefix="spring"  uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" 		uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true"  %>

<jsp:include page="template/login/head.jsp" />
	
<div class="container">
	<div class="col-sm-12 ">
		<div class="panel panel-primary" >
			<div  class="panel-body">
					<div class="col-sm-4 col-md-4" >
						
					</div>
					
					<form id="loginform" class="col-sm-4 col-md-4"  role="form" name='loginForm' 
							action="<c:url value='/login' />"  method="post">
							
							
							<c:if test="${not empty error}">
								<div class="error">${error}</div>
							</c:if>
							<c:if test="${not empty msg}">
								<div class="msg">${msg}</div>
							</c:if>
							
							
							
							<img src='<spring:url value="/resources/img/logo.png" />' width="200"  />
							<div class="clear">
									<input id="login-username"   type="text"
								    class="form-control"  		 name="username" 
								    placeholder="Usuario"  />
							</div>	
							<div class="clear" style="margin-bottom:10px;">
								   <input id="login-password" 	  	type="password" 
								   class="form-control"   			name="password" 
								   placeholder="Clave"  />
							</div>
							<div class="clear">
								<button class="btn btn-primary" 	type="submit" >
									<span>Entrar</span>
								</button>		   
							</div>
					</form>
					<div class="col-sm-4 col-md-4" >
						
					</div>
			</div>
		</div>
	</div>
</div>
	
<jsp:include page="template/login/foot.jsp" />
            