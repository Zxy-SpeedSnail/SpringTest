<%--
  Created by IntelliJ IDEA.
  User: zhouxueyuan
  Date: 2017/2/10
  Time: 上午10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<a href="rest/methodstest/1">GET Request</a>

<form action="rest/methodstest" method="post">
    <input type="submit" value="POST Request" />
</form>

<form action="rest/methodstest/1" method="post">
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="PUT Request" />
</form>

<form action="rest/methodstest/1" method="post">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="DELETE Request" />
</form>
</body>
</html>
