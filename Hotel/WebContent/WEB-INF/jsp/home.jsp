<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">  
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" media="screen" href="${pageContext.request.contextPath}/css/login_style.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login_reset.css"/>
<title>酒店管理系统</title>
</head>
 <style>
 #t1{
	 background-color:#99FF66;}
#t2{
	background-color:#99CCCC;}
 </style>
<body>
<div class="title">酒店客房管理系统</div>
<div class="text">
<div class="text-left">
    <div class="userinfo">
      用户：${user.uname }</br>
    </div>
    <div class="loginout">
       <a href="${pageContext.request.contextPath }/loginout">退出登录</a>
    </div>
   <div class="text-left-nav">
     <ul class="nav nav-pills" role="tablist">
    <li class="nav-item">
      <a class="nav-link active" data-toggle="pill" href="#home">个人信息</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" data-toggle="pill" href="#menu1">前台服务</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" data-toggle="pill" href="#menu2">订单管理</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" data-toggle="pill" href="#menu3">用户管理</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" data-toggle="pill" href="#menu4">房间管理</a>
    </li>
  </ul>
   </div>
</div>

<div class="text-right">
   <div class="tab-content">
    <div id="home" class="container tab-pane active"><br>
    <div class="text-right-next">
        <a style="text-align:left;font-size:50px;" href="myinfo">个人信息</a></br>
        <a style="text-align:left;font-size:50px;" href="myinfoupdate">修改个人信息</a>
    </div>
    </div>
    
    <div id="menu1" class="container tab-pane fade"><br>
      <div class="text-right-next">
        <a style="text-align:left;font-size:50px;" href="roominfo">房间信息</a></br>
        <a style="text-align:left;font-size:50px;" href="roomcheck">客户入住</a></br>
        <a style="text-align:left;font-size:50px;" href="customerdelete">客户退房</a></br>
      </div>
    </div>
    
    <div id="menu2" class="container tab-pane fade"><br>
      <div class="text-right-next">
          <a style="text-align:left;font-size:50px;" href="historyOrder">历史订单</a>
      </div>
    </div>
    
    <div id="menu3" class="container tab-pane fade"><br>
      <div class="text-right-next">
        <a style="text-align:left;font-size:50px;" href="findAllUsers">用户信息</a></br>
        <a style="text-align:left;font-size:50px;" href="powermanager">权限管理</a></br>
      </div>
    </div>
    
    <div id="menu4" class="container tab-pane fade"><br>
      <div class="text-right-next">
        <a style="text-align:left;font-size:50px;" href="roomadd">添加房间</a></br>
        <a style="text-align:left;font-size:50px;" href="roomdelete">删除房间</a></br>
      </div>
    </div>
  </div>
</div>
</div>
<div id="fontsize"  style="width: 400px;text-align: center;height: 20px;line-height: 20px;border-radius: 5px;margin: 0 auto;margin-top: 10px;">
				<font color="red" size="20px">
					<span id="message">${msg }</span>
				</font>
</div>
</body>
</html>