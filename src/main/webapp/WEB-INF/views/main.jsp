<%--
  Created by IntelliJ IDEA.
  User: zhkw
  Date: 2020/5/17
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>accountId</th>
        <th>balanceAmount</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${todos}" var="todo">
        <tr>
            <td>${todo.accountId}</td>
            <td>${todo.balanceAmount}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
