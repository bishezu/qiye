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
	
    
	<div class="tools" align="right">
		<input type="button" class="btn" value="签到" onclick="javascript:window.location.href='${pageContext.request.contextPath }/train/checkIn.action'"/>
	</div>

	<div class="rightinfo">

		<table class="tablelist">
    	<thead>
    		<tr>
       			<th>id</th>
       			<th>培训期数</th>
		        <th>培训时间</th>
		        <th>培训内容</th>
        	</tr>
        </thead>
        <tbody>
       	   <c:forEach items="${train}" var="train" varStatus="status">
	        <tr>
		        <td>${status.count }</td>
		        <td>${train.num}</td>
		        <td>${train.date}</td>
		        <td>${train.info}</td>
	        </tr>  
	  		</c:forEach>
        </tbody>
    </table>

	</div>

</body>

</html>
