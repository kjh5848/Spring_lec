
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String hi = "안녕하세요. 이제 돈내놔";
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>메인 페이지</h1>
<%
    for (int i = 0; i < 4; i++) {
%>
<h1><%=hi%></h1>
    <%}%>
<hr>
</body>
</html>
