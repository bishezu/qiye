<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!-- 本页面是用来查看拥有的具体的权限 -->

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>




</head>


<body>

	<div align="right">  
        <input name="" type="button" class="btn" value="返回" onclick="javascript :history.back(-1)" />
    </div>
	
    
    <div class="rightinfo">
       
    <label>添加部门权限：</label>
    	<input disabled="disabled" type="radio" name="addDept" value="true" ${admin.addDept?"checked='checked'":"" }/>有权限
		<input disabled="disabled" type="radio"  name="addDept" value="false" ${admin.addDept?"":"checked='checked'" }/>无权限<br><br>
    <label>根据部门id查询员工权限：</label>
    	<input disabled="disabled" type="radio"  name="findStaffByDeptId" value="true" ${admin.findStaffByDeptId?"checked='checked'":"" }/>有权限
		<input disabled="disabled" type="radio"  name="findStaffByDeptId" value="false" ${admin.findStaffByDeptId?"":"checked='checked'" }/>无权限<br><br>
    <label>根据部门id删除部门权限：</label>
    	<input disabled="disabled" type="radio"  name="deleteDeptById" value="true" ${admin.deleteDeptById?"checked='checked'":"" }/>有权限
		<input disabled="disabled" type="radio"  name="deleteDeptById" value="false" ${admin.deleteDeptById?"":"checked='checked'" }/>无权限<br><br>
    <label>根据员工id修改部门权限：</label>
    	<input disabled="disabled" type="radio"  name="modifyDeptByStaffId" value="true" ${admin.modifyDeptByStaffId?"checked='checked'":"" }/>有权限
		<input disabled="disabled" type="radio"  name="modifyDeptByStaffId" value="false" ${admin.modifyDeptByStaffId?"":"checked='checked'" }/>无权限<br><br>
    <label>添加职位权限：</label>
    	<input disabled="disabled" type="radio"  name="addTitle" value="true" ${admin.addTitle?"checked='checked'":"" }/>有权限
		<input disabled="disabled" type="radio"  name="addTitle" value="false" ${admin.addTitle?"":"checked='checked'" }/>无权限<br><br>
    <label>根据职位id查询员工的权限</label>
    	<input disabled="disabled" type="radio"  name="findStaffByTitleId" value="true" ${admin.findStaffByTitleId?"checked='checked'":"" }/>有权限
		<input disabled="disabled" type="radio"  name="findStaffByTitleId" value="false" ${admin.findStaffByTitleId?"":"checked='checked'" }/>无权限<br><br>
    <label>根据职位id删除职位权限：</label>
    	<input disabled="disabled" type="radio"  name="deleteTitleById" value="true" ${admin.deleteTitleById?"checked='checked'":"" }/>有权限
		<input disabled="disabled" type="radio"  name="deleteTitleById" value="false" ${admin.deleteTitleById?"":"checked='checked'" }/>无权限<br><br>
    <label>根据员工id修改职位权限：</label>
    	<input disabled="disabled" type="radio"  name="modifyTitleByStaffId" value="true" ${admin.modifyTitleByStaffId?"checked='checked'":"" }/>有权限
		<input disabled="disabled" type="radio"  name="modifyTitleByStaffId" value="false" ${admin.modifyTitleByStaffId?"":"checked='checked'" }/>无权限<br><br>
    <label>根据意见id查询意见及回复权限：</label>
    	<input disabled="disabled" type="radio"  name="findAdviceByAdviceId" value="true" ${admin.findAdviceByAdviceId?"checked='checked'":"" }/>有权限
		<input disabled="disabled" type="radio"  name="findAdviceByAdviceId" value="false" ${admin.findAdviceByAdviceId?"":"checked='checked'" }/>无权限<br><br>
    <label>根据意见id删除意见及回复权限：</label>
    	<input disabled="disabled" type="radio"  name="deleteAdviceById" value="true" ${admin.deleteAdviceById?"checked='checked'":"" }/>有权限
		<input disabled="disabled" type="radio"  name="deleteAdviceById" value="false" ${admin.deleteAdviceById?"":"checked='checked'" }/>无权限<br><br>
    <label>根据意见id进行回复权限：</label>
    	<input disabled="disabled" type="radio"  name="modifyReplayByAdviceId" value="true" ${admin.modifyReplayByAdviceId?"checked='checked'":"" }/>有权限
		<input disabled="disabled" type="radio"  name="modifyReplayByAdviceId" value="false" ${admin.modifyReplayByAdviceId?"":"checked='checked'" }/>无权限<br><br>
    <label>根据薪资等级id修改基本工资权限：</label>
    	<input disabled="disabled" type="radio"  name="modifySalaryBySalaryLevelId" value="true" ${admin.modifySalaryBySalaryLevelId?"checked='checked'":"" }/>有权限
		<input disabled="disabled" type="radio"  name="modifySalaryBySalaryLevelId" value="false" ${admin.modifySalaryBySalaryLevelId?"":"checked='checked'" }/>无权限<br><br>
    <label>添加员工权限：</label>
    	<input disabled="disabled" type="radio"  name="addStaff" value="true" ${admin.addStaff?"checked='checked'":"" }/>有权限
		<input disabled="disabled" type="radio"  name="addStaff" value="false" ${admin.addStaff?"":"checked='checked'" }/>无权限<br><br>
    <label>根据员工id修改员工信息权限：</label>
    	<input disabled="disabled" type="radio"  name="modifyStaffByStaffId" value="true" ${admin.modifyStaffByStaffId?"checked='checked'":"" }/>有权限
		<input disabled="disabled" type="radio"  name="modifyStaffByStaffId" value="false" ${admin.modifyStaffByStaffId?"":"checked='checked'" }/>无权限<br><br>
    <label>根据员工id删除员工权限：</label>
    	<input disabled="disabled" type="radio"  name="deleteStaffByStaffId" value="true" ${admin.deleteStaffByStaffId?"checked='checked'":"" }/>有权限
		<input disabled="disabled" type="radio"  name="deleteStaffByStaffId" value="false" ${admin.deleteStaffByStaffId?"":"checked='checked'" }/>无权限<br><br>
	<label>增加管理员类型权限：</label>
    	<input disabled="disabled" type="radio"  name="addAdminType" value="true" ${admin.deleteStaffByStaffId?"checked='checked'":"" }/>有权限
		<input disabled="disabled" type="radio"  name="addAdminType" value="false" ${admin.deleteStaffByStaffId?"":"checked='checked'" }/>无权限<br><br>
	<label>修改管理员权限的权限：</label>
    	<input disabled="disabled" type="radio"  name="modifyAdmin" value="true" ${admin.deleteStaffByStaffId?"checked='checked'":"" }/>有权限
		<input disabled="disabled" type="radio"  name="modifyAdmin" value="false" ${admin.deleteStaffByStaffId?"":"checked='checked'" }/>无权限<br><br>
	<label>删除管理员类型的权限：</label>
    	<input disabled="disabled" type="radio"  name="deleteAdminType" value="true" ${admin.deleteStaffByStaffId?"checked='checked'":"" }/>有权限
		<input disabled="disabled" type="radio"  name="deleteAdminType" value="false" ${admin.deleteStaffByStaffId?"":"checked='checked'" }/>无权限<br><br>
	<label>修改管理员类型的权限：</label>
    	<input disabled="disabled" type="radio"  name="modifyAdminType" value="true" ${admin.deleteStaffByStaffId?"checked='checked'":"" }/>有权限
		<input disabled="disabled" type="radio"  name="modifyAdminType" value="false" ${admin.deleteStaffByStaffId?"":"checked='checked'" }/>无权限<br><br>
   </div>

</body>

</html>
