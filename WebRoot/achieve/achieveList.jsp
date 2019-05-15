<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- 本页面是显示某一天的所有员工加班记录-->

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>




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
       			<th>员工编号</th>
		        <th>姓名</th>
		        <th>工作完成程度</th>
		        <th>工作合格率</th>
		        <th>出勤率</th>
		        <th>综合评价等级</th>
        	</tr>
        </thead>
        <tbody>
	     <c:forEach items="${achieveList }" var="achieve" varStatus="status">
	        <tr>
		        <td>${status.count }</td>
		        <td>${achieve.sid}</td>
		        <td>${achieve.name}</td>
		        <td>${achieve.achieve}</td>
		        <td>${achieve.efficient}</td>
		        <td>${achieve.absent}</td>
		        <td>${achieve.level}</td>
	        </tr>  
	  		</c:forEach>
        </tbody>
    </table>

</body>

</html>
