<%--
  Created by IntelliJ IDEA.
  User: TranHuy
  Date: 11/17/2020
  Time: 4:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Giao dien them nguoi dung</h1>
    <div>
        <form:form  servletRelativeAction="/addUser" modelAttribute="user" method="POST">
            <form:hidden path="id"/>
            <p>Ten San Pham: </p>
            <form:input path="name" placeholder="Nhap ten nguoi dung" /><br>
            <p>So Dien Thoai</p>
            <form:input path="phone" placeholder="Nhap so dien thoai " /><br>
            <p>Email</p>
            <form:input path="email" placeholder="Nhap dia chi email" /><br>
            <p>Tuoi</p>
            <form:input path="age" placeholder="Nhap tuoi"/>
            <button type="submit">Submit</button>
        </form:form>
    </div>

</body>
</html>
