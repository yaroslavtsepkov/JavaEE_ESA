<%--
  Created by IntelliJ IDEA.
  User: essea
  Date: 1/16/2021
  Time: 5:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Cars</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>id</td>
        <td>username</td>
        <td>password</td>
    </tr>
    </thead>
    <tbody>
    <jsp:useBean id="usersList" scope="session" type="java.util.List"/>
    <c:forEach items="${usersList}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>