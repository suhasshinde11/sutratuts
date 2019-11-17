<%--
  Created by IntelliJ IDEA.
  User: Suhas
  Date: 30-09-2019
  Time: 13:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    for (int i = 5; i > 0; i--) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
            System.out.println();
        }
    }
%>z
</body>
</html>
