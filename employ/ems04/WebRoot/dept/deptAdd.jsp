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
    
    <div class="formtitle"><span>添加内容</span></div>
  
<form action="${pageContext.request.contextPath}/dept/deptAdd.action" method="post">
    <ul class="forminfo">
    
    <li><label>部门ID&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label>
    <input onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')"
           placeholder="请输入数字ID"
     name="deptId" type="text" class="dfinput" required="required" /></li>
       
    <li><label>部门名称&nbsp&nbsp&nbsp&nbsp</label>
    <input onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5]/g,'')"
    	   placeholder="请输入部门名称（中文）"
     name="deptName" type="text" class="dfinput" required="required" /></li>
    
    
    <div></br></br></br></div>
    <li><label>&nbsp;</label>
    
    
    
    <input name="addbutton" type="submit" class="btn" value="确认添加" />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input name="backbutton" type="reset" class="btn" value="重置" />
    </li>
    </ul>
</form>     
   
    </div>


</body>

</html>
