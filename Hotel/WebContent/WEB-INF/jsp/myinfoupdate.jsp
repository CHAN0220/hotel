<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" media="screen" href="${pageContext.request.contextPath}/css/login_style.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login_reset.css"/>
<title>修改个人信息</title>
</head>
<body>
		<div id="particles-js">
		<div class="reg">
			<div class="login-first">
				<a href="home">回到首页</a></br>
			</div>
			<div class="login-top">
				修改个人信息
			</div>
			<form name="loginForm" method="post" action="updateUser" onsubmit="return check()">
				<div class="login-center clearfix">
					<div class="login-center-img"><img src="${pageContext.request.contextPath}/images/id.png"/></div>
					<div class="login-center-input">
						<input type="text" id="userId" name="userId" value="${user.userId}"/>
						<div class="login-center-input-text">请输入新用户名</div>
					</div>
				</div>
				<div class="login-center clearfix">
					<div class="login-center-img"><img src="${pageContext.request.contextPath}/images/password.png"/></div>
					<div class="login-center-input">
						<input type="password" id="password" name="password" value="" placeholder="请输入新密码" onfocus="this.placeholder=''" onblur="this.placeholder='请输入新密码'"/>
						<div class="login-center-input-text">新密码</div>
					</div>
				</div>
				<div class="login-center clearfix">
					<div class="login-center-img"><img src="${pageContext.request.contextPath}/images/password.png"/></div>
					<div class="login-center-input">
						<input type="password" id="ispassword" name="ispassword" value="" placeholder="重新输入新密码" onfocus="this.placeholder=''" onblur="this.placeholder='重新输入新密码'"/>
						<div class="login-center-input-text">确认新密码</div>
					</div>
				</div>
				<div class="login-center clearfix">
					<div class="login-center-img"><img src="${pageContext.request.contextPath}/images/name.jpg"/></div>
					<div class="login-center-input">
						<input type="text" id="uname" name="uname" value="${user.uname }"/>
						<div class="login-center-input-text">请输入新姓名</div>
					</div>
				</div>
				<div class="login-center clearfix">
					<div class="login-center-img"><img src="${pageContext.request.contextPath}/images/phone.jpg"/></div>
					<div class="login-center-input">
						<input type="text" id="uTel" name="uTel" value="${user.uTel}"/>
						<div class="login-center-input-text">请输入新电话号码</div>
					</div>
				</div>
				<div class="login-center clearfix">
					<div class="login-center-img"><img src="${pageContext.request.contextPath}/images/sex.png"/></div>
					<div class="login-center-input" >
          				<input type="radio" name="uSex" value="男" id="uSex" style="width: 20px;height: 20px;margin-top:5px;"/> <font size="3px">&nbsp;男</font>
      					<input type="radio" name="uSex" value="女" id="uSex" style="width: 20px;height: 20px;margin-top:5px;margin-left:10px;"/> <font size="3px">&nbsp;女</font>
      					<div class="login-center-input-text">性别</div>
      				</div>
				</div>
				<div class="login-center clearfix">
					<div class="login-center-img"><img src="${pageContext.request.contextPath}/images/age.png"/></div>
					<div class="login-center-input">
						<input type="text" id="age" name="age" value="${user.age}"/>
						<div class="login-center-input-text">请输入新年龄</div>
					</div>
				</div>
				<div class="login-button3">
					<input type="submit" class="login-button" value="确认修改" />
				</div>
				<div id="fontsize"  style="width: 100px;text-align: center;height: 20px;line-height: 10px;border-radius: 5px;margin: 0 auto;margin-top: 10px;">
					<font color="red" >
						<span id="message">${msg }</span>
					</font>
				</div>
			</form>
		</div>
		<div class="sk-rotating-plane"></div>
		</div>
	
	
	
</body>
<script src="js/particles.min.js"></script>
<script src="js/app.js"></script>
<script type = "text/javascript">
	//判断登录账号或密码是否为空
	function check(){
		var userid = document.getElementById("userId").value;
		var password = document.getElementById("password").value;
		var ispassword = document.getElementById("ispassword").value;
		var name = document.getElementById("uname").value;
		var phoneNum = document.getElementById("uTel").value;
		var age = document.getElementById("age").value;
		var sex = document.getElementById("uSex").value;
		if(userid==""){
			alert("账号不能为空！");
			return false;
		}
		if(password==""){
			alert("密码不能为空！");
			return false;
		}
		if(ispassword != password){
			alert("两次密码不一样！");
			return false;
		}
		if(name==""){
			alert("姓名不能为空！");
			return false;
		}
		if(phoneNum==""){
			alert("电话号码不能为空！");
			return false;
		}
		if(age==""){
			alert("年龄不能为空！");
			return false;
		}
		if(sex==""){
			alert("性别不能为空！");
			return false;
		}
		return true;
	}
</script>
</body>
</html>