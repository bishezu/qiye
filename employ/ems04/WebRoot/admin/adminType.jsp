<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!-- 本页面的功能是显示权限的种类及其相关信息和操作 -->

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
		<table class="tablelist">
			<thead>
				<tr>
					<th>id</th>
					<th>管理员类别id</th>
					<th>创建时间</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${adminTypeList}" var="admin" varStatus="status">
					<tr>
						<td>${admin.adminTypeId }</td>
						<td>${admin.adminType }</td>
						<td><fmt:formatDate value="${admin.createTime }"
								pattern="yyyy-MM-dd" /></td>
						<td><a href="${pageContext.request.contextPath }/admin/findAddTypeStaff.action?adminTypeId=${admin.adminTypeId}" class="tablelink"
							target="rightFrame">查看</a> 
							<a href="${pageContext.request.contextPath }/admin/toAdminModifyType.action?adminTypeId=${admin.adminTypeId}"
							class="tablelink" target="rightFrame">修改权限</a>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>

</html>
