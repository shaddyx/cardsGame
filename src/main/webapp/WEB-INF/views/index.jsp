  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link rel="stylesheet" type="text/css" href="css/style.css" />
    </head>
    <body>
    <script type="text/javascript">
      var path = '<%= request.getContextPath()%>'
      var role = '';
      var revision = '<%=request.getAttribute("revision")%>';
   	  var branch = '<%=request.getAttribute("branch")%>';
    </script>

</body>
</html>