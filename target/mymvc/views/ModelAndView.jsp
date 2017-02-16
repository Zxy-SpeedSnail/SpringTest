<%--
  Created by IntelliJ IDEA.
  User: zhouxueyuan
  Date: 2017/2/10
  Time: 下午2:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
time: ${ requestScope.time }
<br/>
location: ${ requestScope.local.city },${ requestScope.local.province }
</body>
</html>
