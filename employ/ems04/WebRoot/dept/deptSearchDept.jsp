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
<script type="text/javascript" src="js/jquery.js"></script>




</head>


<body>

	
    
    <div class="rightinfo">
       
    <table class="tablelist">
    	<thead>
    		<tr>
       			<th>员工ID<i class="sort"><img src="${pageContext.request.contextPath}/images/px.gif" /></i></th>
		        
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
