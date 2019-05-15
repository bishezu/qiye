<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!-- 本页面的功能是显示员工信息及其相关操作 -->

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath }/css/style.css"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery.js"></script>


</head>

<body>

	<div align="right">
		<input type="button" class="btn" value="添加员工"
			onclick="javascript:window.location.href='${pageContext.request.contextPath }/staff/staffAdd.jsp'" />
	</div>

	<div class="rightinfo">



		<table class="tablelist">
			<thead>
				<tr>
					<th>员工ID</th>
					<th>员工姓名</th>
					<th>职务</th>
					<th>性别</th>
					<th>入职时间</th>
					<th>账号</th>
					<th>员工类别</th>
					<th>操作</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${staffList}" var="staff" varStatus="status">
					<tr>
						<td>${staff.sid }</td>
						<td>${staff.name }</td>
						<td>${staff.title}</td>
						<td>${staff.gender}</td>
						<td><fmt:formatDate value="${staff.hiredate }"
								pattern="yyyy-MM-dd" /></td>
						<td>${staff.account }</td>
						<c:if test="${staff.admintypeId==5 }">
						<td>管理员</td>
						</c:if>
						<c:if test="${staff.admintypeId==1 }">
						<td>普通员工</td>
						</c:if>
						<td>
						    <a href="${pageContext.request.contextPath }/staff/detail.action?sid=${staff.sid}" class="tablelink">明细</a>
							<a href="${pageContext.request.contextPath }/staff/toModify.action?sid=${staff.sid}" class="tablelink">修改</a> 
							<a href="${pageContext.request.contextPath }/staff/remove.action?sid=${staff.sid}" class="tablelink" onclick="return confirm('是否删除？')"> 删除</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>


</body>

</html>
