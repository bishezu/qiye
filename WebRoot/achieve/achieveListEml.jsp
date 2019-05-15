<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- 本页面是显示某一天的所有员工考勤记录-->

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
		        <th>请假天数</th>
		        <th>请假时间</th>
		        <th>原因</th>
        	</tr>
        </thead>
        <tbody>
	        <c:forEach items="${dayoffList }" var="dayoff" varStatus="status">
	        <tr>
		         <td>${status.count }</td>
		        <td>${dayoff.sid}</td>
		        <td>${dayoff.name}</td>
		        <td>${dayoff.days}</td>
		        <td>${dayoff.time}</td>
		        <td>${dayoff.reason}</td>
	        </tr>  
	  		</c:forEach>
        </tbody>
    </table>
</body>

</html>
