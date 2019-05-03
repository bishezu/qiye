/<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!-- 本页面的功能是添加新的权限类别及拥有那些权限，没有为0，有为1 -->

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>
    
    <div class="formbody">
    
    <div class="formtitle"><span>添加内容</span></div>
    <form action="${pageContext.request.contextPath }/admin/adminAddType.action" method="post">
    <label>权限类别名称：</label><input name="adminType" type="text" class="dfinput" /><br><br>
    <label>添加部门权限：</label>
    	<input type="radio"  name="addDept" value="true" />有权限
		<input type="radio"  name="addDept" value="false" checked="checked"/>无权限<br><br>
    <label>根据部门id查询员工权限：</label>
    	<input type="radio"  name="findStaffByDeptId" value="true" />有权限
		<input type="radio"  name="findStaffByDeptId" value="false" checked="checked"/>无权限<br><br>
    <label>根据部门id删除部门权限：</label>
    	<input type="radio"  name="deleteDeptById" value="true" />有权限
		<input type="radio"  name="deleteDeptById" value="false" checked="checked"/>无权限<br><br>
    <label>根据员工id修改部门权限：</label>
    	<input type="radio"  name="modifyDeptByStaffId" value="true" />有权限
		<input type="radio"  name="modifyDeptByStaffId" value="false" checked="checked"/>无权限<br><br>
    <label>添加职位权限：</label>
    	<input type="radio"  name="addTitle" value="true" />有权限
		<input type="radio"  name="addTitle" value="false" checked="checked"/>无权限<br><br>
    <label>根据职位id查询员工的权限</label>
    	<input type="radio"  name="findStaffByTitleId" value="true" />有权限
		<input type="radio"  name="findStaffByTitleId" value="false" checked="checked"/>无权限<br><br>
    <label>根据职位id删除职位权限：</label>
    	<input type="radio"  name="deleteTitleById" value="true" />有权限
		<input type="radio"  name="deleteTitleById" value="false" checked="checked"/>无权限<br><br>
    <label>根据员工id修改职位权限：</label>
    	<input type="radio"  name="modifyTitleByStaffId" value="true" />有权限
		<input type="radio"  name="modifyTitleByStaffId" value="false" checked="checked"/>无权限<br><br>
    <label>根据意见id查询意见及回复权限：</label>
    	<input type="radio"  name="findAdviceByAdviceId" value="true" />有权限
		<input type="radio"  name="findAdviceByAdviceId" value="false" checked="checked"/>无权限<br><br>
    <label>根据意见id删除意见及回复权限：</label>
    	<input type="radio"  name="deleteAdviceById" value="true" />有权限
		<input type="radio"  name="deleteAdviceById" value="false" checked="checked"/>无权限<br><br>
    <label>根据意见id进行回复权限：</label>
    	<input type="radio"  name="modifyReplayByAdviceId" value="true" />有权限
		<input type="radio"  name="modifyReplayByAdviceId" value="false" checked="checked"/>无权限<br><br>
    <label>根据薪资等级id修改基本工资权限：</label>
    	<input type="radio"  name="modifySalaryBySalaryLevelId" value="true" />有权限
		<input type="radio"  name="modifySalaryBySalaryLevelId" value="false" checked="checked"/>无权限<br><br>
    <label>添加员工权限：</label>
    	<input type="radio"  name="addStaff" value="true" />有权限
		<input type="radio"  name="addStaff" value="false" checked="checked"/>无权限<br><br>
    <label>根据员工id修改员工信息权限：</label>
    	<input type="radio"  name="modifyStaffByStaffId" value="true" />有权限
		<input type="radio"  name="modifyStaffByStaffId" value="false" checked="checked"/>无权限<br><br>
    <label>根据员工id删除员工权限：</label>
    	<input type="radio"  name="deleteStaffByStaffId" value="true" />有权限
		<input type="radio"  name="deleteStaffByStaffId" value="false" checked="checked"/>无权限<br><br>
	<label>增加管理员类型权限：</label>
    	<input type="radio"  name="addAdminType" value="true" />有权限
		<input type="radio"  name="addAdminType" value="false" checked="checked"/>无权限<br><br>
	<label>修改管理员权限的权限：</label>
    	<input type="radio"  name="modifyAdmin" value="true" />有权限
		<input type="radio"  name="modifyAdmin" value="false" checked="checked"/>无权限<br><br>
	<label>删除管理员类型的权限：</label>
    	<input type="radio"  name="deleteAdminType" value="true" />有权限
		<input type="radio"  name="deleteAdminType" value="false" checked="checked"/>无权限<br><br>
	<label>修改管理员类型的权限：</label>
    	<input type="radio"  name="modifyAdminType" value="true" />有权限
		<input type="radio"  name="modifyAdminType" value="false" checked="checked"/>无权限<br><br>
   <label>&nbsp;</label><input type="submit" class="btn" value="确认添加" onclick="return confirm('是否修改？');"/>
    &nbsp;<input name="" type="button" class="btn" value="返回" onclick="javascript :history.back(-1)" />
    </form>
    
    </div>


</body>

</html>
