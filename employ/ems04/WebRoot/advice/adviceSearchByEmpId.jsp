<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
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

</script>
</head>

<body>

    <label>&nbsp;</label>
    <div class="tools" align="right">
    	<input name="" type="button" class="btn" value="返回" onclick="javascript :history.back(-1)" style=""/>
    </div>

    <table class="tablelist">
    	<thead>
    	<tr>
        <th style="width: 50px;"><a onclick="return confirm('是否删除？');">删除</a></th>
        <th style="width: 70px; ">编号</th>
        <th style="width: 150px; " align="center">标题</th>
        <th style="width: 70px; ">员工编号</th>
        <th style="width: 150px; ">创建时间</th>
        <th>回复内容</th>
        <th style="width: 80px; ">回复人编号</th>
        <th style="width: 150px; ">回复时间</th>
        <th style="width: 60px; ">操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${adviceList }" var="advice" varStatus="status">
	        <tr>
		        <td><input name="" type="checkbox" value="" /></td>
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
		        </td>
	        </tr> 
        </c:forEach>
        </tbody>
    </table>
    
 
</body>

</html>
