<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- 本页面的功能是实现签到的功能 -->

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>

</head>


<body>
	<form action="${pageContext.request.contextPath}/Attendance/EmlFindByDate.action" method="post">
		<div align="left">  
	        <input id="presentDate" name="presentDate" type="date" class="dfinput" value=""/>
			<input name="" type="submit" class="btn" value="按日期查询" />
	    </div>
    </form>
    
	<div class="tools" align="right">
		<input type="button" class="btn" value="签到" onclick="javascript:window.location.href='${pageContext.request.contextPath }/Attendance/checkIn.action'"/>
		<input type="button" class="btn" value="签出" onclick="javascript:window.location.href='${pageContext.request.contextPath }/Attendance/checkOut.action'"/>
	</div>

	<div class="rightinfo">

		<table class="tablelist">
    	<thead>
    		<tr>
       			<th>id</th>
       			<th>员工编号</th>
		        <th>姓名</th>
		        <th>日期</th>
		        <th>上班签到时间</th>
		        <th>下班签到时间</th>
		        <th>迟到</th>
		        <th>早退</th>
		        <th>旷工半天</th>
		        <th>旷工一天</th>
        	</tr>
        </thead>
        <tbody>
       	    <c:forEach items="${attendanceList }" var="attendance" varStatus="status">
	        <tr>
		        <td>${status.count }</td>
		        <td>${attendance.sid}</td>
		        <td>${attendance.name}</td>
		        <td>${attendance.presentDate}</td>
		        <td>${attendance.checkIn}</td>
		        <td>${attendance.checkOut}</td>
		        <td>${attendance.arriveLate?'是':'否'}</td>
		        <td>${attendance.leaveEarly?'是':'否'}</td>
		        <td>${attendance.halfAbsenteeism?'是':'否'}</td>
		        <td>${attendance.absenteeism?'是':'否'}</td>
	        </tr>  
	  		</c:forEach>
        </tbody>
    </table>

	</div>

</body>

</html>
