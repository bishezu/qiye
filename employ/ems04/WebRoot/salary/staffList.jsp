<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>

<script type="text/javascript">

</script>


</head>


<body>
    <div align=left>         
    </div>
    <div class="rightinfo">   
    <table class="tablelist">
    	<thead>
    	<tr>
        
        <th>序号</th>
        <th>员工编号</th>
        <th>员工姓名</th>
        <th>薪资等级</th>
      	<th>操作</th>
        </tr>
      </thead>
      <tbody>
      
      <c:forEach items="${stafflist}" var="staff" varStatus="status">
        <tr>
        	<td>${status.count}</td>
       	 	<td>${staff.sid}</td>
        	<td>${staff.name}</td>    	
        	<td>${staff.salarylevel}</td>
        	<td><a href="${pageContext.request.contextPath }/salary/toupdateStaffSalaryLevel.action?sid=${staff.sid}"
							class="tablelink" target="rightFrame"> 修改</a></td>
        </tr> 
        </c:forEach>
        
        </tbody>
    </table>
    
 
</body>

</html>
