<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" media="screen" href="${pageContext.request.contextPath}/css/login_style.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login_reset.css"/>
<title>酒店管理系统</title>
</head>
<body>
	
		<div id="particles-js">
		<div class="login">
			<div class="login-first">
				欢迎您！
			</div>
			<div class="login-top">
				登录
			</div>
			<form name="loginForm" method="post" action="loginaction" onsubmit="return check()">
				<div class="login-center clearfix">
					<div class="login-center-img"><img src="<%=request.getContextPath()%>/images/id.png"/></div>
					<div class="login-center-input">
						<input type="text" id="userId" name="userId" value="" placeholder="请输入您的用户名" onfocus="this.placeholder=''" onblur="this.placeholder='请输入您的用户名'"/>
						<div class="login-center-input-text">用户名</div>
					</div>
				</div>
				<div class="login-center clearfix">
					<div class="login-center-img"><img src="<%=request.getContextPath()%>/images/password.png"/></div>
					<div class="login-center-input">
						<input type="password" id="password" name="password" value="" placeholder="请输入您的密码" onfocus="this.placeholder=''" onblur="this.placeholder='请输入您的密码'"/>
						<div class="login-center-input-text">密码</div>
					</div>
				</div>
				<div class="login-button3">
					<input type="submit" class="login-button" value="登录" />
				</div>
			</form>
			<a href="${pageContext.request.contextPath}/reg">
				<div class="login-button2">
					<input type="submit" class="login-button" value="注册"/>
				</div>
			</a>
			<div id="fontsize"  style="width: 100px;text-align: center;height: 20px;line-height: 20px;border-radius: 5px;margin: 0 auto;margin-top: 10px;">
				<font color="red" >
					<span id="message">${msg }</span>
				</font>
			</div>
			
		</div>
		<div class="sk-rotating-plane"></div>
		</div>
		
	
	
</body>
<script src="<%=request.getContextPath()%>/js/particles.min.js"></script>
<script src="<%=request.getContextPath()%>/js/app.js"></script>
<script type = "text/javascript">
	//判断登录账号或密码是否为空
	function check(){
		var userid = document.getElementById("userId").value;
		var password = document.getElementById("password").value;
		if(userid=="" || password==""){
			alert("账号或密码不能为空！");
			return false;
		}
		return true;
	}
</script>
</html>