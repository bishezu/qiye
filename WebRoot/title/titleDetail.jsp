<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

		<div class="rightinfo">	
			<div class="tools">
				<ul align="right">
					<input name="" type="button" class="btn" value="返回" onclick="javascript :history.back()" />
				</ul>
	
			</div>
		</div>

		<table class="tablelist">
			<thead>
				<tr>
					<th>员工id</th>
					<th>姓名</th>
					<th>性别</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${staffList }" var="staff" varStatus="status">
				<tr>
					<td>${staff.sid }</td>
					<td>${staff.name }</td>
					<td>${staff.gender?'男':'女' }</td>
					<td>
						<a href="${pageContext.request.contextPath }/title/toStaffModify.action?sid=${staff.sid}" class="staffmodifylink">修改</a>
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>

</body>

</html>
