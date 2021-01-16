<%@ page import="com.ssau.JavaEE_ESA.entities.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: essea
  Date: 1/14/2021
  Time: 3:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User information</title>
</head>
<body>
<c:forEach items="${usersList}" var="user">
    <tr>
        <td>${user.id}</td>
        <td>${user.name}</td>
        <td>${user.username}</td>
    </tr>
</c:forEach>
</body>
</html>
