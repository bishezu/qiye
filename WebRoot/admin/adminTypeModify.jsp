<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!-- 本页面的功能是修改具体的权限 -->

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>
    
    <div class="formbody">
    
    <div class="formtitle"><span>修改内容</span></div>
    
    <form action="${pageContext.request.contextPath }/admin/modifyStaffAdminType.action" method="post">
	    <label>权限类别：</label>
	    	<input type="hidden" name="id" value="${staff.id }">
	    	<input type="hidden" name="sid" value="${staff.sid }">
	    	<input type="hidden" name="name" value="${staff.name }">
	    	<input type="hidden" name="gender" value="${staff.gender }">
	    	<input type="hidden" name="hiredate" value="${staff.hiredate }">
	    	<input type="hidden" name="seniority" value="${staff.seniority }">
	    	<input type="hidden" name="account" value="${staff.account }">
	    	<input type="hidden" name="password" value="${staff.password }">
	    	<input type="hidden" name="deptId" value="${staff.deptId }">
	    	<input type="hidden" name="titleId" value="${staff.titleId }">
			<select name="admintypeId">
				<option value="1" ${staff.admintypeId==1?"selected='selected'":""}>普通员工</option>
    			<option value="2" ${staff.admintypeId==2?"selected='selected'":""}>员工管理员</option>
    			<option value="3" ${staff.admintypeId==3?"selected='selected'":""}>部门职位管理员</option>
    			<option value="4" ${staff.admintypeId==4?"selected='selected'":""}>薪资管理员</option>
    			<option value="5" ${staff.admintypeId==5?"selected='selected'":""}>超级管理员</option>
			</select>
		    <label>&nbsp;</label><input type="submit" class="btn" value="确认修改" onclick="return confirm('是否修改？');"/>
		    &nbsp;<input type="button" class="btn" value="返回" onclick="javascript :history.back(-1)" />
    </form>
    </div>
</body>
</html>
