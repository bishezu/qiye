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
	<form action="${pageContext.request.contextPath}/Dayoff/EmlFindByDate.action" method="post">
		<div align="left">  
	        <input id="time" name="time" type="date" class="dfinput" value=""/>
			<input name="" type="submit" class="btn" value="按日期查询" />
	    </div>
    </form>
    
	<div class="tools" align="right">
		<input type="button" class="btn" value="请假" onclick="javascript:window.location.href='${pageContext.request.contextPath }/Dayoff/goTable.action'"/>
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

	</div>

</body>

</html>
