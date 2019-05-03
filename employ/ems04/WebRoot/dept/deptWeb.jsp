<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
 
<script type="text/javascript">
$(document).ready(function(){
  $(".click").click(function(){
  $(".tip").fadeIn(200);
  });
  
  $(".tiptop a").click(function(){
  $(".tip").fadeOut(200);
});

  $(".sure").click(function(){
  $(".tip").fadeOut(100);
});

  $(".cancel").click(function(){
  $(".tip").fadeOut(100);
});

});
</script>


</head>


<body>

    <div class="tools">
    
    	<div align=right>
        <input name="" type="button" class="btn" value="添加" onclick="javascript:window.location.href='${pageContext.request.contextPath}/dept/deptAdd.jsp'" />
    </div>
    
    <table class="tablelist">
    	<thead>
    	<tr>
        
        <th>ID</th>
        <th>部门名称</th>
        <th>操作</th>
        </tr>
        </thead>
        <tbody>
        	<c:forEach items="${deptList}" var="dept" varStatus="status">
		        <tr>
			        <td>${dept.deptId }</td>
			        <td>${dept.deptName}</td> 
			        <td>
			        	<a href="${pageContext.request.contextPath}/dept/detail.action?id=${dept.deptId}" class="tablelink">查看</a>
			        	
			        	<a
							href="${pageContext.request.contextPath}/dept/deptDelete.action?deptId=${dept.deptId}"
							class="tablelink">删除</a>
						</td>
		        </tr> 
	        </c:forEach>	
        </tbody>
    </table>
    
   
   
</body>

</html>