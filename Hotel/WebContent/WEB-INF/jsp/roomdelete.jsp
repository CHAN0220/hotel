<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdn.staticfile.org/popper.js/1.15.0/umd/popper.min.js"></script>
  <script src="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
  	<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<link rel="stylesheet" media="screen" href="${pageContext.request.contextPath}/css/login_style.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login_reset.css"/>
<title>房间信息</title>
</head>
<body>
<div class="container">
  <h2><a href="home" style="font-size:40px;">首页</a></h2> </br></br>
  <p style="font-size:20px;"> 搜索：</p></br>
  <form id="form1" name="form1" method="post" action="selectRoomByInfo1">    
					    类型：<select name="rTypeId" id="rTypeId" style="width:100px;height:38px">
					       <option value="0" selected>所有</option>
                           <option value="1">豪华双人房</option>
                           <option value="2">豪华单人房</option>
                           <option value="3">总统套房</option>
                           <option value="4">豪华大床房</option>
                           <option value="5">标准单人间</option>
                           <option value="6">标准双人间</option>
                           <option value="7">双床房</option>
                        </select>

					    状态：<select name="rState" id="rState" style="width:100px;height:38px">
					       <option value="0" selected>所有</option>
                           <option value="空闲">空闲</option>
                           <option value="已住">已住</option>
                        </select>
    <input type="submit" style="cursor: pointer;width: 250px;text-align: center;height: 40px;line-height: 40px;background-color: dodgerblue;border-radius: 5px;margin: 0 auto;margin-top: 0px;color: white;" value="查询" />
  </form>
</div></br></br>

<div class="container">
<form id="form1" name="form1" method="post" action="deleteRoom">
  <input type="submit" style="cursor: pointer;width: 250px;text-align: center;height: 40px;line-height: 40px;background-color: dodgerblue;border-radius: 5px;margin: 0 auto;margin-top: 0px;color: white;" value="删除所选房间" />
  <table class="table table-hover">
    <thead>
      <tr style="text-align:center;font-size:25px;">
      <th>选择</th>
	  <th>房间号</th>
	  <th>房间类型</th>
	  <th>价格</th>
	  <th>房间状态</th>
	</tr>
    </thead>
    <tbody>
      <c:forEach items="${roomlist}" var="room">
	    <tr style="font-size:15px;">
	      <td><input type="checkbox" name="roomArray" value="${room.roomId}"></td>
		  <td>${room.roomId}</td>
		  <td>
		    <c:choose>
		      <c:when test="${room.rTypeId=='1' }">
		      <div>
               <p style="font-size:20px;">豪华双人房</p>
		       <div class="login-center-img1"><img src="<%=request.getContextPath()%>/images/1.jpg"/></div>
		       </div>
		      </c:when>
		      <c:when test="${room.rTypeId=='2' }">
		      <div>
               <p style="font-size:20px;">豪华单人房</p>
		       <div class="login-center-img1"><img src="<%=request.getContextPath()%>/images/2.jpg"/></div>
		       </div>
		      </c:when>
		      <c:when test="${room.rTypeId=='3' }">
		      <div>
               <p style="font-size:20px;">总统套房</p>
		       <div class="login-center-img1"><img src="<%=request.getContextPath()%>/images/3.jpg"/></div>
		       </div>
		      </c:when>
		      <c:when test="${room.rTypeId=='4' }">
		      <div>
               <p style="font-size:20px;">豪华大床房</p>
		       <div class="login-center-img1"><img src="<%=request.getContextPath()%>/images/4.jpg"/></div>
		       </div>
		      </c:when>
		      <c:when test="${room.rTypeId=='5' }">
		      <div>
               <p style="font-size:20px;">标准单人间</p>
		       <div class="login-center-img1"><img src="<%=request.getContextPath()%>/images/5.jpg"/></div>
		       </div>
		      </c:when>
		      <c:when test="${room.rTypeId=='6' }">
		      <div>
               <p style="font-size:20px;">标准双人房</p>
		       <div class="login-center-img1"><img src="<%=request.getContextPath()%>/images/6.jpg"/></div>
		       </div>
		      </c:when>
		      <c:when test="${room.rTypeId=='7' }">
		      <div>
               <p style="font-size:20px;">双床房</p>
		       <div class="login-center-img1"><img src="<%=request.getContextPath()%>/images/7.jpg"/></div>
		       </div>
		      </c:when>
		    </c:choose>

		  </td>
		  <td>${room.price}</td>
		  <td>${room.rState}</td>
	    </tr>
	  </c:forEach>
    </tbody>
  </table>
  </form>
  </div>

</body>
</html>