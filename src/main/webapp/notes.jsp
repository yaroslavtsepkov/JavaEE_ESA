<%--
  Created by IntelliJ IDEA.
  User: essea
  Date: 1/17/2021
  Time: 3:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Notes</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>id</td>
        <td>id_user</td>
        <td>content</td>
    </tr>
    </thead>
    <tbody>
    <jsp:useBean id="notesList" scope="session" type="java.util.List"/>
    <c:forEach items="${notesList}" var="notes">
        <tr>
            <td>${notes.id_note}</td>
            <td>${notes.id_user}</td>
            <td>${notes.content}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
