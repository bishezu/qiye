<%@ page contentType="text/html; charset=UTF-8" %>

<!-- 本页面的功能是添加新的员工 信息-->

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
    
    <form action="${pageContext.request.contextPath }/staff/add.action" method="post">
    <ul class="forminfo">   
    <li><label>员工信息:</label></li>
    
    <li><label>员工ID*</label><input type="text" name="sid" id="sid" class="dfinput" /></li>
    <li><label>员工姓名*</label><input type="text" name="name" id="name" class="dfinput" /></li>
    
    <li><label>性别</label><input type="text" name="gender" class="dfinput" /></li>
    
    <li><label>账号*</label><input type="text" name="account" id="account" class="dfinput" /></li>
    <li><label>密码*</label><input type="text" name="password" id="password" class="dfinput" /></li>
    
    <li><label>部门id</label><input type="text" name="deptId" class="dfinput" /></li>
    <li><label>职位id</label><input type="text" name="titleId" class="dfinput" /></li>
    <li><label>账号权限类别id</label><input type="text" name="admintypeId" class="dfinput" /></li>
    
    <li><label>出生日期*</label><input type="date" name="birthday" id="birthday" class="dfinput" /></li>
    <li><label>电话号码*</label><input type="text" name="phone" id="phone" class="dfinput" /></li>
    <li><label>个人邮箱*</label><input type="text" name=email id="email" class="dfinput" /></li>
    
    
    <li><label>学历</label><input type="text" name="edubackground" class="dfinput" /></li>
    <li><label>薪资等级</label><input type="text" name="salarylevel" class="dfinput" /></li>    
    <li><label>&nbsp;</label><input type="submit" class="btn" value="确认添加" onclick="check();"/>
    &nbsp;
    <input name="" type="button" class="btn" value="返回" onclick="javascript :history.back(-1)" />
    </li>
    <li><span id="check"/></li>
    </ul>
    </form>
    
    
    </div>


</body>

</html>