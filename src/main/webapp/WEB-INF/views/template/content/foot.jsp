

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script src="<spring:url value="/resources/js/jquery.min.js" />"></script>
<script src="<spring:url value="/resources/js/bootstrap.min.js" />"></script>

<!-- BEGIN JAVASCRIPTS -->
   <!-- Load javascripts at bottom, this will reduce page load time -->
   <script src="<spring:url value="/resources/js/jquery-1.8.3.min.js" />"></script>
   <script src="<spring:url value="/resources/js/jquery.nicescroll.js" />" type="text/javascript"></script>
   <script src="<spring:url value="/resources/assets/bootstrap/js/bootstrap.min.js" />"></script>
   <script src="<spring:url value="/resources/js/jquery.blockui.js" />"></script>
   <!-- ie8 fixes -->
   <!--[if lt IE 9]>
   <script src="js/excanvas.js"></script>
   <script src="js/respond.js"></script>
   <![endif]-->
   <script src="<spring:url value="/resources/assets/chosen-bootstrap/chosen/chosen.jquery.min.js" />"></script>
   <script src="<spring:url value="/resources/assets/uniform/jquery.uniform.min.js" />"></script>

   <!--common script for all pages-->
      <script src="<spring:url value="/resources/js/common-scripts.js" />"></script>
   <!-- END JAVASCRIPTS -->
   <script type="text/javascript" src="<spring:url value="/resources/js/script.js" />"></script>
   <script type="text/javascript" src="<spring:url value="/resources/js/jquery.dataTables.min.js" />"></script>
   <script>
       $(document).ready(function() {
            $('.tablelist').DataTable();
        } );
   </script>
   
   
 </body>
</html>