<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>

</head>

<body>

	
   
    	 <form action="${pageContext.request.contextPath}/salary/findBySId.action" method="post">
    	  <div align=left>  
        	<input id="sid" name="sid" type="text" class="dfinput" value="${staff.sid }"/>
			<input type="submit" class="btn" value="按员工编号查询" onclick="check();"/>
			<span id="check"/> 
			</div>
        </form>
        <form action="${pageContext.request.contextPath}/salary/findByDate.action" method="get">
         <div align=left>  
        	<input id= "presentDate" name="presentDate" type="date" class="dfinput" />
			<input name="" type="submit" class="btn" value="按日期查询" /> 
			</div>
        </form>
    
	
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
      
      <c:forEach items="${salaries}" var="salary" varStatus="status">
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
    
    <!-- 分页功能 start -->  
    <div align="center">  
        <font size="2">共 ${page.totalPageCount} 页</font> <font size="2">第  
            ${page.pageNow} 页</font> <a href="${pageContext.request.contextPath}/salary/list.action?pageNow=1">首页</a>  
        <c:choose>  
            <c:when test="${page.pageNow - 1 > 0}">  
                <a href="${pageContext.request.contextPath}/salary/list.action?pageNow=${page.pageNow - 1}">上一页</a>  
            </c:when>  
            <c:when test="${page.pageNow - 1 <= 0}">  
                <a href="${pageContext.request.contextPath}/salary/list.action?pageNow=1">上一页</a>  
            </c:when>  
        </c:choose>  
        <c:choose>  
            <c:when test="${page.totalPageCount==0}">  
                <a href="${pageContext.request.contextPath}/salary/list.action?pageNow=${page.pageNow}">下一页</a>  
            </c:when>  
            <c:when test="${page.pageNow + 1 < page.totalPageCount}">  
                <a href="${pageContext.request.contextPath}/salary/list.action?pageNow=${page.pageNow + 1}">下一页</a>  
            </c:when>  
            <c:when test="${page.pageNow + 1 >= page.totalPageCount}">  
                <a href="${pageContext.request.contextPath}/salary/list.action?pageNow=${page.totalPageCount}">下一页</a>  
            </c:when>  
        </c:choose>  
        <c:choose>  
            <c:when test="${page.totalPageCount==0}">  
                <a href="${pageContext.request.contextPath}/salary/list.action?pageNow=${page.pageNow}">尾页</a>  
            </c:when>  
            <c:otherwise>  
                <a href="${pageContext.request.contextPath}/salary/list.action?pageNow=${page.totalPageCount}">尾页</a>  
            </c:otherwise>  
        </c:choose>  
    </div>  
    <!-- 分页功能 End -->  
   
  
</body>

</html>
