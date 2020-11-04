<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>权限管理</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdn.staticfile.org/popper.js/1.15.0/umd/popper.min.js"></script>
  <script src="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
  <script>
function frmSubmit(){
  document.form1.submit();
}
</script>
</head>
<body>
<div class="container">
  </br>
  </br>
  <a href="home" style="font-size:40px;">首页</a></br>
  </br>  
  <form id="form1" name="form1" method="post" action="deleteUser">
   <table class="table table-dark table-hover">
    <thead>
      <tr>
        <th>用户名</th>
        <th>权限级别</th>
      </tr>
    </thead>
    <tbody>
	  <c:forEach items="${users}" var="user">
	    <tr>
		  <td>${user.userId}</td>
		  <td>${user.uname}</td>
	    </tr>
	  </c:forEach>
    </tbody>
  </table>
  <a href="#" style="font-size:30px;" onclick="javascript:frmSubmit();">删除所选</a>
  </form>      
</div>

</body>
</html>