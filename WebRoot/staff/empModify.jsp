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
    <form action="${pageContext.request.contextPath }/staff/empModify.action" method="post">
    <input type="hidden" name="id" value="${staff.id }">
    <input type="hidden" name="sid" value="${staff.sid }">
    <input type="hidden" name="gender" value="${staff.gender }">
    <input type="hidden" name="hiredate" value="${staff.hiredate }">
    <%-- <input type="hidden" name="seniority" value="${staff.seniority }"> --%>
    <input type="hidden" name="password" value="${staff.password }">
    <input type="hidden" name="deptId" value="${staff.deptId }">
    <input type="hidden" name="titleId" value="${staff.titleId }">
    <input type="hidden" name="admintypeId" value="${staff.admintypeId }">
 <%--    <input type="hidden" name="nation" value="${staff.nation }"> --%>
    <input type="hidden" name="birthday" value="${staff.birthday }">
    <input type="hidden" name="edubackground" value="${staff.edubackground }">
   <%--  <input type="hidden" name="school" value="${staff.school }">
    <input type="hidden" name="profession" value="${staff.profession }"> --%>
    <input type="hidden" name="salarylevel" value="${staff.salarylevel }">
  <%--   <input type="hidden" name="numbera" value="${staff.numbera }">
    <input type="hidden" name="numberb" value="${staff.numberb }">
    <input type="hidden" name="numberc" value="${staff.numberc }"> --%>
    <ul class="forminfo">
    <li><label>姓名</label><input name="name" type="text" class="dfinput" value="${staff.name }" readonly="readonly"/></li>
    <li><label>账号</label><input name="account" type="text" class="dfinput" value="${staff.account }" /></li>
    <li><label>电话号码</label><input name="phone" type="text" class="dfinput" value="${staff.phone }" /></li>
    <li><label>个人邮箱</label><input name="email" type="text" class="dfinput" value="${staff.email }" /></li>
     <li>
     <label>用户类别(管理员5，普通员工1)</label>
    <!--  <select value="1">
      <option name="admintypeId" value="5"> 管理员</option>
      <option name="admintypeId" value="1"> 普通员工</option>
     </select> -->
    <input name="typeId" type="text" class="dfinput" value="${staff.admintypeId }" />
     </li>
 <%--    <li><label>家庭住址</label><input name="homeaddress" type="text" class="dfinput" value="${staff.homeaddress }" /></li> --%>
    <li><label>&nbsp;</label><input type="submit" class="btn" value="确认修改" onclick="return confirm('确认修改？')"/>
    </li>
    </ul>
    </form>
    
</body>

</html>
