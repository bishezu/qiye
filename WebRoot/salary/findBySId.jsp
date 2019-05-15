<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>

<script type="text/javascript">
$(function(){
	
	
	
});
</script>


</head>


<body>

	
    <div align=right>  
   
		
        <input name="" type="button" class="btn" value="返回" onclick="javascript :history.back(-1)" />
    </div>
	
    <div class="rightinfo">
    
   
    
    <table class="tablelist">
    	<thead>
    	<tr>
        
        <th>序号</th>
        <th>员工编号</th>
      
        <th>日期</th>
        <th>缺勤天数</th>
		<th>缺勤扣款</th>      
        <th>全勤奖</th>
        <th>应发工资</th>
        <th>五险一金</th>
        <th>税金</th>
        <th>实发工资</th>
        <th>是否发放</th>
      
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${salarysearchlist}" var="salary" varStatus="status">
        <tr>
        	<td>${status.count}</td>
       	 	<td>${salary.sid}</td>
        	<td>${salary.presentDate}</td>
        	<td>${salary.absenceDays}</td>        
        	<td>${salary.absenceFine}</td>
        	<td>${salary.attendAwards}</td>    	
        	<td>${salary.salaryGross}</td>
        	<td>${salary.insurnce}</td>
        	<td>${salary.salaryTax}</td>
        	<td>${salary.salaryFinal}</td>
        	<td>${salary.salaryStatus?'是':'否'}</td>
        </tr> 
        </c:forEach>
        
        
        </tbody>
    </table>
    
   

</body>

</html>
