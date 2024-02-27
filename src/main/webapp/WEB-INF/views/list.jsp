<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 26/2/2024
  Time: 4:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table border="1px">
    <tr>
        <td>id</td>
        <td>tên khách hàng</td>
        <td>email</td>
        <td>địa chỉ</td>
        <td>sửa</td>

    </tr>
    <c:forEach items="${customer}" var="c">
        <tr>
            <td>${c.id}</td>
            <td><a href="/customer/${c.id}">${c.nameCustomer}</a></td>
            <td>${c.email}</td>
            <td>${c.address}</td>
            <td><a href="/customer/edit/${c.id}">sửa</a></td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
