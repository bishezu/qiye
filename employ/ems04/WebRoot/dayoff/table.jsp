<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>

</head>


<body>
    <div class="formtitle"><span>填写请假信息</span></div>
    <form action="${pageContext.request.contextPath }/Dayoff/checkIn.action" method="post">
    <ul class="forminfo">
   <%--  <li><label>姓名</label><input name="name" type="text" class="dfinput" value="${dayoff.name }" readonly="readonly"/></li> --%>
    <li><label>请假天数</label><input name="days" type="text" class="dfinput" value="${dayoff.days }" /></li>
    <li><label>请假时间</label><input name="time" type="date" class="dfinput" value="${dayoff.time }" /></li>
    <li><label>请假原因</label><input name="reason" type="text" class="dfinput" value="${dayoff.reason }" /></li>
    <li><label>&nbsp;</label><input type="submit" class="btn" value="提交" onclick="javascript:window.location.href='${pageContext.request.contextPath }/Dayoff/checkIn.action'"/>
    </li>
    </ul>
    </form>
    
</body>

</html>
