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
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>
    
    <div class="formbody">
    
    <div class="formtitle"><span>修改部门</span></div>
 <form action="${pageContext.request.contextPath}/dept/update.action" method="post">
 <input name="id" style="display:none;" value="${staff.sid }">   
    <ul class="forminfo">
    <li><label>部门</label>
    	<select name="modify" >
    		<option value="0" selected="selected">人事部</option>
    		<option value="1">财务部</option>
    		<option value="2">技术部</option>
    		<option value="3">开发部</option>
    		<option value="4">测试部</option>
    	</select>
    </li>
    
    
    
    <li><label>&nbsp;</label><input name="" type="submit" class="btn" value="确认修改" />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input name="" type="button" class="btn" value="返回" onclick="javascript :history.back(-1)" />
    </li>
    </ul>
    </form>
    
    </div>


</body>
 
</html>
