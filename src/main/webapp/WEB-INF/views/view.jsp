<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 26/2/2024
  Time: 10:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Thông tin chi tiết</h2>
<p>
  <a href="/customer">Back to product list</a>
</p>
<table border="1px">
  <tr><td>${customer.getId()}</td></tr>
  <tr><td>${customer.getNameCustomer()}</td></tr>
  <tr><td>${customer.getEmail()}</td></tr>
  <tr><td>${customer.getAddress()}</td></tr>
  </table>
</body>
</html>
