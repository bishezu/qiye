<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!-- 本页面的功能是添加新的权限类别及拥有那些权限，没有为0，有为1 -->

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>
    
    <div class="formbody">
    
    <div class="formtitle"><span>修改</span></div>
       
    	<form action="${pageContext.request.contextPath}/salary/updateStaffSalaryLevel.action" method="post">
    		<input type="hidden" name="sid" class="dfinput" value="${staff.sid} ">
			<label>薪资等级：</label><input type="int" name="salarylevel" class="dfinput" value="${staff.salarylevel}"><br><br>
			<label>&nbsp;&nbsp;</label><input name="" type="submit" class="btn" value="确认修改" onclick="alert('修改成功');"/>
    		&nbsp;<input name="" type="button" class="btn" value="返回" onclick="javascript :history.back(-1)" />
   		</form>   
    </div>


</body>

</html>
