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

<script type="text/javascript">


	function check(){
		var text1=document.getElementById("staffId").value;

		if(text1==""){
			$("#check").html("<font color='red'>所搜内容不能为空！</font>");
			var event = event || window.event;
			event.preventDefault();
		}else{
			return ture;
		}
	}
	
</script>

</head>
<body>

	
    
    <div class="rightinfo">
    
    <div class="tools">
    <form name="" id="" action="${pageContext.request.contextPath }/advice/queryByStaffId.action" method="post">
    	<ul class="toolbar">
    	<input id="staffId" name="staffId" type="text" class="dfinput" />
		<input onclick="check();" type="submit" class="btn" value="员工编号查询" /> 
		<span id="check"/>
        </ul>
    </form>
    
    </div>
    
    
    <table class="tablelist">
    	<thead>
	    	<tr>
		        <th style="width: 70px; ">编号</th>
		        <th style="width: 150px; " align="center">标题</th>
		        <th style="width: 70px; ">员工编号</th>
		        <th style="width: 150px; ">创建时间</th>
		        <th>回复内容</th>
		        <th style="width: 80px; ">回复人编号</th>
		        <th style="width: 150px; ">回复时间</th>
		        <th style="width: 80px; ">操作</th>
	        </tr>
        </thead>
        <tbody>
       		<c:forEach items="${adviceList }" var="advice" varStatus="status">
		        <tr id="data_${status.index }" onMouseOver="move(this);" onMouseOver="out(this);">
			        <td>${advice.adviceId }</td>
			        <td>${advice.adviceTitle }</td>
			        <td>${advice.staffId }</td>
			        <td>
			        <fmt:formatDate value="${advice.adviceTime }" pattern="yyyy-MM-dd HH:mm:ss"/>  
			        </td>
			        <td>${advice.replyContent }</td>
			        <td>${advice.adminId }</td>
			        <td>
			        	<fmt:formatDate value="${advice.replyTime }" pattern="yyyy-MM-dd HH:mm:ss"/>
			        </td>
			        <td>
			        	<a href="${pageContext.request.contextPath }/advice/queryByAdviceId.action?adviceId=${advice.adviceId}" class="tablelink" target="rightFrame">查看</a>
			        	<a href="${pageContext.request.contextPath }/advice/toModify.action?adviceId=${advice.adviceId}" class="tablelink" target="rightFrame">回复</a>
			        	<a href="${pageContext.request.contextPath }/advice/remove.action?adviceId=${advice.adviceId}" class="tablelink" target="rightFrame">删除</a>
			        </td>
		        </tr> 
	        </c:forEach>
		</tbody>
		</table>
		</div>
</body>

</html>
