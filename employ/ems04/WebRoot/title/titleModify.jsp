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

	<div class="formtitle"><span>修改职位</span></div>	
	
	<form action="${pageContext.request.contextPath }/title/titleModify.action" method="post">
		<input type="hidden" id="id" name="id" value="${title.id }"/>	
	    <ul class="forminfo">
		    <li><label>部门</label>
		    	<select name="deptId">
		    		<c:forEach items="${deptList }" var="dept" varStatus="status">
			    		<option value="${status.count }" ${title.deptId==1?"selected='selected'":""}>${dept.deptName } </option>
			    	</c:forEach>
		    	</select>
		    </li>
			    <li><label>职位名称</label><input name="titleName" type="text" class="dfinput" value="${title.titleName }"/></li>
			    <li><label>&nbsp;</label><input type="submit" class="btn" value="确认修改" onclick="alert('修改成功');"/>
			    &nbsp;<input name="" type="button" class="btn" value="返回" onclick="javascript :history.back(-1)" />
		    </li>
	    </ul>
    </form>

</body>

</html>
