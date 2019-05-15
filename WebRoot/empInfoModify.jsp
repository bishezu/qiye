<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>

</head>


<body>
    <div class="formtitle"><span>修改个人信息</span></div>
    <form action="${pageContext.request.contextPath }/login/empInfoModify.action" method="post">
    <ul class="forminfo">
    <li><label>姓名</label><input name="name" type="text" class="dfinput" value="${staff.name }" readonly="readonly"/></li>
    <li><label>账号</label><input name="account" type="text" class="dfinput" value="${staff.account }" /></li>
    <li><label>电话号码</label><input name="phone" type="text" class="dfinput" value="${staff.phone }" /></li>
    <li><label>个人邮箱</label><input name="email" type="text" class="dfinput" value="${staff.email }" /></li>
  <%--   <li><label>家庭住址</label><input name="homeaddress" type="text" class="dfinput" value="${staff.homeaddress }" /></li> --%>
    <li><label>&nbsp;</label><input type="submit" class="btn" value="确认修改" onclick="return confirm('确认修改？')"/>
    </li>
    </ul>
    </form>
    
</body>

</html>
