<%--
  Created by IntelliJ IDEA.
  User: zhouxueyuan
  Date: 2017/2/9
  Time: 下午5:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<%--通配符测试--%>
1  rq3/**/ or  rq3/**/hhh<br/>
<a href="c3/rq3/aaa/bbb/hhh">c3/rq3/aaa/bbb/hhh</a><br/>
<br/>
2  rq4/*/bbb or rq4/**/bbb    rq5/**/bbb<br/>
<a href="c3/rq4/aaa/bbb">c3/rq4/aaa/bbb</a><br/>
<a href="c3/rq4/aaa/ccc/bbb">c3/rq4/aaa/ccc/bbb</a><br/>
<a href="c3/rq5/aaa/bbb">c3/rq5/aaa/bbb</a><br/>
<br/>
3  rq6/qqq*  or  rq6/qqq?     rq7/qqq*<br/>
<a href="c3/rq6/qqqw">c3/rq6/qqqw</a><br/>
<a href="c3/rq6/qqqww">c3/rq6/qqqww</a><br/>
<a href="c3/rq7/qqqw">c3/rq7/qqqw</a><br/>
<br/>
4<br/>
rq8/**/kkk or  rq8/aaa/**<br/>
<a href="c3/rq8/aaa/kkk">c3/rq8/aaa/kkk</a><br/>
rq8_bm/bbb/**   rq8_bm/**/mmm<br/>
<a href="c3/rq8_bm/bbb/mmm">c3/rq8_bm/bbb/mmm</a><br/>
<br/>
5<br/>
rq9/*/kkk/nnn  or rq9/aaa/*/*<br/>
<a href="c3/rq9/aaa/kkk/nnn">c3/rq9/aaa/kkk/nnn</a><br/>
rq10/aaa/*/*  or rq10/*/kkk/nnn<br/>
<a href="c3/rq10/aaa/kkk/nnn">c3/rq10/aaa/kkk/nnn</a><br/>
</body>
</html>
