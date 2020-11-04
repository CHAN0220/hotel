<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>历史订单</title>
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
    <table class="table table-striped">
    <thead>
      <tr>
        <th>订单号</th>
        <th>房间号</th>
        <th>入住时间</th>
        <th>退房时间</th>
        <th>消费金额</th>
        <th>实际付款</th>
      </tr>
    </thead>
    <tbody>
	  <c:forEach items="${orderlist}" var="order">
	    <tr>
		  <td>${order.orderId}</td>
		  <td>${order.roomId}</td>
		  <td>${order.orderIn}</td>
		  <td>${order.orderOut}</td>
		  <td>${order.orderCost}</td>
		  <td>${order.orderRealCost }</td>
	    </tr>
	  </c:forEach>
    </tbody>
  </table>
   <table class="table table-dark table-hover">
    
  </table>    
</div>

</body>
</html>