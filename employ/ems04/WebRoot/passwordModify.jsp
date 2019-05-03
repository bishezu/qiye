<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>

</head>


<body>
    <div class="formtitle"><span>修改密码</span></div>
	    <form action="${pageContext.request.contextPath }/login/modifyPassword.action" method="post">
	    	<%-- <input type="hidden" name="id" value="${staff.id }">
    		<input type="hidden" name="sid" value="${staff.sid }">
    		<input type="hidden" name="gender" value="${staff.gender }">
    		<input type="hidden" name="hiredate" value="${staff.hiredate }">
    		<input type="hidden" name="account" value="${staff.account }">
   			<input type="hidden" name="deptId" value="${staff.deptId }">
    		<input type="hidden" name="titleId" value="${staff.titleId }">
    		<input type="hidden" name="admintypeId" value="${staff.admintypeId }">
    		<input type="hidden" name="nation" value="${staff.nation }">
    		<input type="hidden" name="birthday" value="${staff.birthday }">
    		<input type="hidden" name="phone" value="${staff.phone }">
    		<input type="hidden" name="email" value="${staff.email }">
    		<input type="hidden" name="homeaddress" value="${staff.homeaddress }">
    		<input type="hidden" name="edubackground" value="${staff.edubackground }">
    		<input type="hidden" name="school" value="${staff.school }">
    		<input type="hidden" name="profession" value="${staff.profession }">
    		<input type="hidden" name="salarylevel" value="${staff.salarylevel }"> --%>
		    &nbsp;&nbsp;&nbsp;<label>姓名：</label>&nbsp;&nbsp;<input name="name" type="text" class="dfinput" readonly="readonly" value="${staff.name }"/>
		    <br><br>
		    <br><br>
		    &nbsp;&nbsp;<label>新密码：</label><input name="password" type="password" class="dfinput" value="${staff.password }"/>
		    <br><br>
		    &nbsp;&nbsp;&nbsp;<label>&nbsp;</label><input type="submit" class="btn" value="确认修改" onclick="return confirm('确认修改？')"/>
	    </form>
    
</body>

</html>
