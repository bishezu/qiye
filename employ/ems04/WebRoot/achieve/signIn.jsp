<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- 本页面的功能是实现绩效考评的功能 -->

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>

</head>


<body>
	

	<div class="formtitle"><span>填写绩效列表</span></div>
    <form action="${pageContext.request.contextPath }/Achieve/addAchieve.action" method="post">
    <ul class="forminfo">
    <li><label>员工id</label><input name="sid" type="text" class="dfinput"/></li>
    <li><label>姓名</label><input name="name" type="text" class="dfinput"/></li>
    <li><label>工作完成程度</label><input name="achieve" type="text" class="dfinput"/></li>
    <li><label>工作合格率</label><input name="efficient" type="text" class="dfinput"/></li>
    <li><label>出勤率</label><input name="absent" type="text" class="dfinput"/></li>
    <li><label>综合评价等级</label><input name="level" type="text" class="dfinput"/></li>
    <li><label>&nbsp;</label><input type="submit" class="btn" value="确认提交" />
    </li>
    </ul>
    </form>
</body>

</html>
