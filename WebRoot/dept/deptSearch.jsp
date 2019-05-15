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
<script type="text/javascript"  src="${pageContext.request.contextPath}/js/jquery.js"></script>




</head>


<body>

	<div align=center> 
	<form action="${pageContext.request.contextPath}/dept/searchBySid.action">
        
        <input placeholder="请输入员工ID" id="search"
        maxlength="9"
        required="required"
        onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')" 
        name="sid" type="text" class="dfinput" /> 
        
		<input type="submit" class="btn" value="搜索"  />   
        <input name="" type="button" class="btn" value="返回" onclick="javascript :history.back(-1)" />
    </form>
    </div>
	
    
    <div class="rightinfo">
       
    <table class="tablelist">
    	<thead>
    		<tr>
       			<th>员工ID</th>
		        
		        <th>姓名</th>
		        <th>性别</th>
		        <th>职位</th>
		        
		  		        
        	</tr>
        </thead>
        <tbody>
        	<c:forEach items="${staffList}" var="staff" varStatus="status">
		        <tr>
			        <td>${staff.sid }</td>
			        <td>${staff.name}</td> 
			        <td>${staff.gender}</td>
			        <td>${staff.titleId}</td>
			        
			       
		        </tr> 
	        </c:forEach>          	       	           
        </tbody>
    </table>
    
   
   
</body>
</html>
