<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>欢迎登录后台管理系统</title>
<link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script src="js/cloud.js" type="${pageContext.request.contextPath }/text/javascript"></script>

<script language="javascript">
$(function(){
	$('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
	$(window).resize(function(){  
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
    });  
	
	$("#find").click(function(){
		var account = $("#account").val();
		var password = $("#password").val();
		var url = "${pageContext.request.contextPath}/login/toLogin.action";
		var params = {"account":account,"password":password,"time":new Date()};
		$.post(url,params,function(data){
			var msg = data.msg;
			if(msg==0){
				window.location = "${pageContext.request.contextPath}/mainStaff.jsp";
			}
			if(msg==1){
				if(confirm("是否登录到后台界面？")){					
					window.location = "${pageContext.request.contextPath}/main.jsp";
				}else{
					window.location = "${pageContext.request.contextPath}/mainStaff.jsp";
				}
			}
			if(msg==2){
				alert("账号不存在!");
				$("#account").val("");
				$("#password").val("");
			}
			if(msg==3){
				alert("密码错误!");
				$("#account").val("");
				$("#password").val("");
			}
		},"json");
	});
	
});  
</script> 

</head>

<body style="background-color:#1c77ac; background-image:url(images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">



    <div id="mainBody">
      <div id="cloud1" class="cloud"></div>
      <div id="cloud2" class="cloud"></div>
    </div>  


    
    <div class="loginbody">
    
    <span class="systemlogo"></span> 
       
    <div class="loginbox">
    
    <ul>
    <li><input id="account" name="account" type="text" class="loginuser" value="" /></li>
    <li><input id="password" name="password" type="password" class="loginpwd" value="" /></li>
    <li><input id="find" type="button" class="loginbtn" value="登录" /><label></label>
    </ul>
    
    </div>
    
    </div>
    
    
    
	
    
</body>

</html>