<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" media="screen" href="${pageContext.request.contextPath}/css/roomadd_style.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login_reset.css"/>
<title>房间添加</title>
</head>
<body>
	
		<div id="particles-js">
		<div class="reg">
			<div class="login-first">
				<a href="home">回到首页</a></br>
			</div>
			<div class="login-top">
				房间添加
			</div>
			<form name="loginForm" method="post" action="insertRoom" onsubmit="return check()">
			    <div class="login-center clearfix">
					<div class="login-center-img"><img src="${pageContext.request.contextPath}/images/room.jpg"/></div>
					<div class="login-center-input">
						<input type="text" id="roomId" name="roomId" value="" placeholder="请输入房间号" onfocus="this.placeholder=''" onblur="this.placeholder='请输入房间名'"/>
						<div class="login-center-input-text">房间号</div>
					</div>
				</div>
				<div class="login-center clearfix">
					<div class="login-center-img">状态</div>
					<div class="login-center-input" >	
					    <select name="rState" id="rState" style="width:100px;height:38px">
                           <option value="空闲" selected>空闲</option>
                           <option value="已住">已住</option>
                        </select>
      				</div>
				</div>
				<div class="login-center clearfix">
					<div class="login-center-img"><img src="${pageContext.request.contextPath}/images/roomtype.PNG"/></div>
					<div class="login-center-input" >	
					    <select name="rTypeId" id="rTypeId" style="width:100px;height:38px">
                           <option value="1" selected>豪华双人房</option>
                           <option value="2">豪华单人房</option>
                           <option value="3">总统套房</option>
                           <option value="4">豪华大床房</option>
                           <option value="5">标准单人间</option>
                           <option value="6">标准双人间</option>
                           <option value="7">双床房</option>
                        </select>
      				</div>
				</div>
				<div class="login-center clearfix">
					<div class="login-center-img"><img src="${pageContext.request.contextPath}/images/price.png"/></div>
					<div class="login-center-input">
						<input type="text" onkeyup="this.value=this.value.replace(/[^\d\.]/g, '')" id="price" name="price" value="" placeholder="请输入房间价格" onfocus="this.placeholder=''" onblur="this.placeholder='请输入房间价格'"/>
						<div class="login-center-input-text">价格</div>
					</div>
				</div>
				<div class="login-button3">
					<input type="submit" class="login-button" value="添加房间" />
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
		var roomId = document.getElementById("roomId").value;
		var price = document.getElementById("price").value;
		if(roomId==""){
			alert("房间号不能为空！");
			return false;
		}
		if(price==""){
			alert("价格不能为空！");
			return false;
		}
		return true;
	}
</script>
</html>