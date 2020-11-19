<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
<body>
      <h1>Danh sach nguoi dung</h1>
      <div>
          <a href="<c:url value='/addUser'/>" style="margin-left: 20px;" class="btn btn-primary">Thêm User</a>
          <table>
              <thead>
                  <tr>
                      <th>Name</th>
                      <th>Phone</th>
                      <th>Email</th>
                      <th>Age</th>
                      <th>Delete</th>
                      <th>Edit</th>
                  </tr>
              </thead>

              <tbody>
              <c:forEach items="${listUser}" var="user">
                  <tr>
                      <td>${user.name}</td>
                      <td>${user.phone}</td>
                      <td>${user.email}</td>
                      <td>${user.age}</td>
                      <td> <a href="<c:url value='/deleteUser/${user.id}'/>">Delete</a> </td>
                      <td><a href="<c:url value='/editUser/${user.id}'/>" classs="btn btn-danger" onclick="return confirm('Bạn thực sự muon xoa user');">Xoa</a> </td>
                  </tr>
              </c:forEach>
              </tbody>
          </table>
      </div>

</body>
</html>