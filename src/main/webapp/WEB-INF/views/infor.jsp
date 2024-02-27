<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27/2/2024
  Time: 5:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<fieldset style="width: 500px">
  <legend>Customer Information</legend>
  <form action="/customer" method="post">
    <table>
      <tr>
        <td>Id</td>
        <td><input type="text" name="id" value="${customer.getId()}" readonly>${requestScope["customer"].getId()}</td>
      </tr>
      <tr>
        <td>Name</td>
        <td><input type="text" name="nameCustomer" value="${customer.getNameCustomer()}"></td>
      </tr>
      <tr>
        <td>Email</td>
        <td><input type="text" name="email" value="${customer.getEmail()}"></td>
      </tr>
      <tr>
        <td>Address</td>
        <td><input type="text" name="address" value="${customer.getAddress()}"></td>
      </tr>
      <tr>
        <td>
          <button type="submit">Update</button>
        </td>
      </tr>
    </table>
  </form>
</fieldset>
</body>
</html>
