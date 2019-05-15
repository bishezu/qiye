<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!-- 本页面是用来查看某一种权限下有哪些员工及其相关操作 -->

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>




</head>


<body>

	<div align=right>  
        <input name="" type="button" class="btn" value="返回" onclick="javascript :history.back(-1)" />
    </div>
	
    
    <div class="rightinfo">
       
    <table class="tablelist">
    	<thead>
    		<tr>
       			<th>id</th>
		        <th>姓名</th>
		        <th>权限类别id</th>
		        <th>部门id</th>
		        <th>职位id</th>
		        <th>操作</th>
        	</tr>
        </thead>
        <tbody>
        	<c:forEach items="${staffList}" var="staff" varStatus="status">
		        <tr>
			        <td>${staff.id }</td>
			        <td>${staff.name }</td>
			        <td>${staff.admintypeId }</td>
			        <td>${staff.deptId }</td>
			        <td>${staff.titleId }</td>
			        <td>
			        	<a href="${pageContext.request.contextPath }/admin/findStaffAdminById.action?admintypeId=${staff.admintypeId}" class="tablelink" target="rightFrame">查看权限</a>
			        	<a href="${pageContext.request.contextPath }/admin/toModifyStaffAdminType.action?id=${staff.id}" class="tablelink" target="rightFrame">修改管理员类型</a> 
			        </td>
		        </tr> 
	        </c:forEach>
        
       		
        </tbody>
    </table>
    
    </div>


</body>

</html>
