<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>


</head>
<body>
	<div id="tab1" class="tabson">
	    <ul class="forminfo">
			        <li>
			        	<label>编号：</label>
			        	<input name="" type="text" class="dfinput" value="${advice.adviceId }"  style="width:518px;"/>
			        </li>
			        <li>
			        	<label>员工编号：</label>
			        	<input name="" type="text" class="dfinput" value="${advice.staffId }"  style="width:518px;"/>
			        </li>
			        <li>
			        	<label>标题：</label>
			        	<input name="" type="text" class="dfinput" value="${advice.adviceTitle }"  style="width:518px;"/>
			        </li>
			        <li>
				        <label>意见内容：</label>
				        <input name="" type="longtext" class="dfinput" value="${advice.adviceContent }"  style="width:518px; height: 150px"/>
			        </li>
			        <li>
				        <label>回复内容：</label>
				        <input name="" type="longtext" class="dfinput" value="${advice.replyContent }"  style="width:518px; height: 150px"/>
			        </li>
	   		<li><label>&nbsp;</label></li>
	   		<li><label>&nbsp;</label><input name="" type="button" class="btn" value="返回" onclick="javascript :history.back(-1)" style=""/></li>
	    </ul>
	    
    </div>

</body>

</html>
