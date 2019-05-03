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
	<form action="${pageContext.request.contextPath}/Overwork/EmlFindByDate.action" method="post">
		<div align="left">  
	        <input id="presentDate" name="presentDate" type="date" class="dfinput" value=""/>
			<input name="" type="submit" class="btn" value="按日期查询" />
	    </div>
    </form>
    
	<div class="tools" align="right">
		<input type="button" class="btn" value="签到" onclick="javascript:window.location.href='${pageContext.request.contextPath }/Overwork/checkIn.action'"/>
		<input type="button" class="btn" value="签出" onclick="javascript:window.location.href='${pageContext.request.contextPath }/Overwork/checkOut.action'"/>
	</div>

	<div class="rightinfo">

		<table class="tablelist">
    	<thead>
    		<tr>
       			<th>id</th>
       			<th>员工编号</th>
		        <th>姓名</th>
		        <th>日期</th>
		        <th>加班签到时间</th>
		        <th>加班签退时间</th>
        	</tr>
        </thead>
        <tbody>
       	    <c:forEach items="${overworkList }" var="overwork" varStatus="status">
	        <tr>
		         <td>${status.count }</td>
		        <td>${overwork.sid}</td>
		        <td>${overwork.name}</td>
		        <td>${overwork.presentDate}</td>
		        <td>${overwork.checkIn}</td>
		        <td>${overwork.checkOut}</td>
	        </tr>  
	  		</c:forEach>
        </tbody>
    </table>

	</div>

</body>

</html>
