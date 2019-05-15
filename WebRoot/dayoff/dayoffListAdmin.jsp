<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- 管理员查询页面 -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>


<script type="text/javascript">
function check(){
	var text1=document.getElementById("sid").value;

	if(text1==""){
		$("#check").html("<font color='red'>所搜内容不能为空！</font>");
		var event = event || window.event;
		event.preventDefault();
	}else{
		return ture;
	}
}

		  
</script>



</head>

  
<body>
	<form action="${pageContext.request.contextPath}/Dayoff/AdminFindBySid.action" method="get">
		<div align="left">  
	        <input id="sid" name="sid" input type="number" class="dfinput" value=""/>
			<input name="" type="submit" class="btn" value="按员工编号查询" onclick="check()"/>
			<span id="check"/>
	    </div>
    </form>
    
    <form action="${pageContext.request.contextPath}/Dayoff/AdminFindByDate.action" method="get">
    <div align="left">  
        <input id= "presentDate" name="time" type="date" class="dfinput" value=""/>
		<input name="" type="submit" class="btn" value="按日期查询"/>  
    </div>
	</form>
    
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
       	    <c:forEach items="${dayoff}" var="dayoff" varStatus="status">
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
    
    <!-- 分页功能 start -->  
    <div align="center">  
        <font size="15">共 ${page.totalPageCount} 页</font> <font size="15">第  
            ${page.pageNow} 页</font> <a href="${pageContext.request.contextPath}/Dayoff/dayoffListAdmin.action?pageNow=1">首页</a>  
        <c:choose>  
            <c:when test="${page.pageNow - 1 > 0}">  
                <a href="${pageContext.request.contextPath}/Dayoff/dayoffListAdmin.action?pageNow=${page.pageNow - 1}">上一页</a>  
            </c:when>  
            <c:when test="${page.pageNow - 1 <= 0}">  
                <a href="${pageContext.request.contextPath}/Dayoff/dayoffListAdmin.action?pageNow=1">上一页</a>  
            </c:when>  
        </c:choose>  
        <c:choose>  
            <c:when test="${page.totalPageCount==0}">  
                <a href="${pageContext.request.contextPath}/Dayoff/dayoffListAdmin.action?pageNow=${page.pageNow}">下一页</a>  
            </c:when>  
            <c:when test="${page.pageNow + 1 < page.totalPageCount}">  
                <a href="${pageContext.request.contextPath}/Dayoff/dayoffListAdmin.action?pageNow=${page.pageNow + 1}">下一页</a>  
            </c:when>  
            <c:when test="${page.pageNow + 1 >= page.totalPageCount}">  
                <a href="${pageContext.request.contextPath}/Dayoff/dayoffListAdmin.action?pageNow=${page.totalPageCount}">下一页</a>  
            </c:when>  
        </c:choose>  
        <c:choose>  
            <c:when test="${page.totalPageCount==0}">  
                <a href="${pageContext.request.contextPath}/Dayoff/dayoffListAdmin.action?pageNow=${page.pageNow}">尾页</a>  
            </c:when>  
            <c:otherwise>  
                <a href="${pageContext.request.contextPath}/Dayoff/dayoffListAdmin.action?pageNow=${page.totalPageCount}">尾页</a>  
            </c:otherwise>  
        </c:choose>  
    </div>  
    <!-- 分页功能 End -->  
    
    
</body>

</html>
