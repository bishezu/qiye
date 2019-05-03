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
        <input name="" type="button" class="btn" value="返回" onclick="window.location.href='${pageContext.request.contextPath}/Overwork/overworkListAdmin.action'" />
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
	       <c:forEach items="${overwork}" var="overwork" varStatus="status">
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
    
    <!-- 分页功能 start -->  
    <div align="center">  
        <font size="2">共 ${page.totalPageCount} 页</font> <font size="2">第  
            ${page.pageNow} 页</font> <a href="${pageContext.request.contextPath}/Overwork/AdminFindBySidPage.action?pageNow=1">首页</a>  
        <c:choose>  
            <c:when test="${page.pageNow - 1 > 0}">  
                <a href="${pageContext.request.contextPath}/Overwork/AdminFindBySidPage.action?pageNow=${page.pageNow - 1}">上一页</a>  
            </c:when>  
            <c:when test="${page.pageNow - 1 <= 0}">  
                <a href="${pageContext.request.contextPath}/Overwork/AdminFindBySidPage.action?pageNow=1">上一页</a>  
            </c:when>  
        </c:choose>  
        <c:choose>  
            <c:when test="${page.totalPageCount==0}">  
                <a href="${pageContext.request.contextPath}/Overwork/AdminFindBySidPage.action?pageNow=${page.pageNow}">下一页</a>  
            </c:when>  
            <c:when test="${page.pageNow + 1 < page.totalPageCount}">  
                <a href="${pageContext.request.contextPath}/Overwork/AdminFindBySidPage.action?pageNow=${page.pageNow + 1}">下一页</a>  
            </c:when>  
            <c:when test="${page.pageNow + 1 >= page.totalPageCount}">  
                <a href="${pageContext.request.contextPath}/Overwork/AdminFindBySidPage.action?pageNow=${page.totalPageCount}">下一页</a>  
            </c:when>  
        </c:choose>  
        <c:choose>  
            <c:when test="${page.totalPageCount==0}">  
                <a href="${pageContext.request.contextPath}/Overwork/AdminFindBySidPage.action?pageNow=${page.pageNow}">尾页</a>  
            </c:when>  
            <c:otherwise>  
                <a href="${pageContext.request.contextPath}/Overwork/AdminFindBySidPage.action?pageNow=${page.totalPageCount}">尾页</a>  
            </c:otherwise>  
        </c:choose>  
    </div>  
    <!-- 分页功能 End -->  
    

</body>

</html>
