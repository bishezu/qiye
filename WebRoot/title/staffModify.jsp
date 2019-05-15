<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>

<script type="text/javascript">

</script>

		<style type="text/css">
		
			.label{
				text-align: right;
				width: 10%;
			}
			
		</style>
			
</head>


<body>

	<div class="formtitle"><span>修改部门职位</span></div>	
	
	<form action="${pageContext.request.contextPath }/title/modifyStaff.action" method="post">
		<input type="hidden" name="id" value="${staff.id }">
	    <input type="hidden" name="sid" value="${staff.sid }">
	    <input type="hidden" name="name" value="${staff.name }">
	    <input type="hidden" name="gender" value="${staff.gender }">
	    <input type="hidden" name="hiredate" value="${staff.hiredate }">
	    <input type="hidden" name="seniority" value="${staff.seniority }">
	    <input type="hidden" name="account" value="${staff.account }">
	    <input type="hidden" name="password" value="${staff.password }">
	    <input type="hidden" name="deptId" value="${staff.deptId }">
	    <ul class="forminfo">
		    <li><label>职位</label>
		    	<select name="titleId" >
					<c:forEach items="${titleList }" var="title" varStatus="status">
			    		<option value="${title.id }" >${title.titleName } </option>
			    	</c:forEach>
				</select>
		    </li>
		    <li><label>&nbsp;</label><input type="submit" class="btn" value="确认修改" onclick="return confirm('是否修改？');"/>
		    &nbsp;<input name="" type="button" class="btn" value="返回" onclick="javascript :history.back(-1)" />
		    </li>
	    </ul>
    </form>

</body>

</html>
