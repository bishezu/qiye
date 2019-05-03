<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>职位页面</title>
<link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js">

</script>

</head>

<body>

	<div class="rightinfo">

		<div align=right>
	        <input name="" type="button" class="btn" value="添加" onclick="javascript:window.location.href='${pageContext.request.contextPath }/title/toTitleAdd.action'" />
		</div>
	</div>


		<table class="tablelist">
			<thead>
				<tr>
					<th>id</th>
					<th>职位</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${titleList }" var="title" varStatus="status">
					<tr>
						<td>${status.count }</td>
						<td>${title.titleName }</td>
						<td>
							<a href="${pageContext.request.contextPath }/title/staff.action?id=${title.id}" class="tablelink">查看 </a>
							<a href="${pageContext.request.contextPath }/title/toTitleModify.action?id=${title.id}" class="modifylink">修改</a>
							<a href="${pageContext.request.contextPath }/title/delete.action?id=${title.id}" onclick="return confirm('确定删除吗?')">删除</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

</body>

</html>
