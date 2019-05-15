<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!-- 本页面是用来查看员工详细信息 -->

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>

<script type="text/javascript">
$("#birth").val(formatDate(new Date(), "yyyy-MM-dd"));
</script>
</head>

<body>

	<div align="right">
		<input name="" type="button" class="btn" value="返回"
			onclick="javascript :history.back(-1)" />
	</div>

	<div class="formtitle">
		<span>员工个人信息</span>
	</div>
	<ul class="forminfo">
		<li><label>员工ID*</label><label>${staff.sid}</label><%-- <input type="text" name="sid" class="dfinput" value="${staff.sid}" readonly="readonly"/> --%></li>
	    <li><label>员工姓名*</label><label>${staff.name}</label><%-- <input type="text" name="name" class="dfinput" value="${staff.name}" readonly="readonly"/> --%></li>
	    <li><label>性别</label><label>${staff.gender}</label><%-- <input type="text" name="gender" class="dfinput" value="${staff.gender}" readonly="readonly"/> --%></li>
	    <li><label>账号*</label><label>${staff.account}</label><%-- <input type="text" name="account" class="dfinput" value="${staff.account}" readonly="readonly"/> --%></li>
	    <li><label>密码*</label><label>${staff.password}</label><%-- <input type="text" name="password" class="dfinput" value="${staff.password}" readonly="readonly"/> --%></li>
	    <li><label>部门id</label><label>${staff.deptId}</label><%-- <input type="text" name="deptId" class="dfinput" value="${staff.deptId}" readonly="readonly"/> --%></li>
	    <li><label>职位id</label><label>${staff.titleId}</label><%-- <input type="text" name="titleId" class="dfinput" value="${staff.titleId}" readonly="readonly"/> --%></li>
	    <li><label>账号权限类别</label><label>${staff.admintypeId}</label><%-- <input type="text" name="admintypeId" class="dfinput" value="${staff.admintypeId}" readonly="readonly"/> --%></li>
	    <li><label>出生日期</label><label><fmt:formatDate value="${staff.birthday }"
								pattern="yyyy-MM-dd" /></label><%-- <input type="text" name="birthday" class="dfinput" value="${staff.birthday }" readonly="readonly" id="birth"/> --%></li>
	    <li><label>电话号码*</label><label>${staff.phone}</label><%-- <input type="text" name="phone" class="dfinput" value="${staff.phone}" readonly="readonly"/> --%></li>
	    <li><label>个人邮箱*</label><label>${staff.email}</label><%-- <input type="text" name=email class="dfinput" value="${staff.email}" readonly="readonly"/> --%></li>
	    <li><label>学历</label><label>${staff.edubackground}</label><%-- <input type="text" name="edubackground" class="dfinput" value="${staff.edubackground}" readonly="readonly"/> --%></li>
	    <li><label>薪资等级</label><label>${staff.salarylevel}</label><%-- <input type="text" name="salarylevel" class="dfinput" value="${staff.salarylevel}" readonly="readonly"/> --%>
	    </li>    
	</ul>

</body>

</html>