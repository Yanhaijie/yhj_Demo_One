<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<html>
<head>
	<title>酒店管理系统</title>
	<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
</head>
<body>
<!-- <h2>Hello World!</h2>
	<a href="helloworld">test</a>
	<br><br>
	<a href="emps">List All Employees</a>
	<br><br> -->
	<h2>酒店管理系统</h2>
	<div id="login">
		<form id="loginForm" action="login/userLogin">
			<input type="text" id="userName" placeholder="用户名："><br>
			<input type="text" id="passWord" placeholder="密码："><br>
			<input type="button" id="login" value="login"> 
			<input type="button" id="register" value="register"> 
		</form>
	</div>
</body>
<script type="text/javascript">
	$("#register").click(function(){
		alert("注册");
		location.href="pages/input.jsp";
	});
	$("#login").click(function(){
		$.ajax({
               	async: true,
                type : "post",
                url :  "login/userLogin",
                data : {
						userName : $("#userName").val(),//姓名
						passWord : $("#passWord").val(),//手机号
					},
            	success : function(data) {
					if (data.Code == "200") {
						alert("登录成功");
						location.href="pages/success.jsp";
					} else {
						alert("登录失败");
					}
				},
                
               });
               });
</script>
</html>
