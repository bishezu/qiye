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


</script>


</head>


<body>  
    <div class="rightinfo">
    
   
    
    
    <table class="tablelist">
    	<thead>
    	<tr>
    	<th>序号</th>
        <th>薪资等级</th>
       
        <th>基本薪资</th>
       
        <th>操作</th>
        </tr>
       
        <c:forEach items="${salaryLevellist}" var="salaryLevel" varStatus="status">
         	<tr>
        		
        		<td>${status.count}</td>
        		
				<td>${salaryLevel.salaryLevel}</td>
				
				<td>${salaryLevel.salaryBase}</td>
				
				<td><a href="${pageContext.request.contextPath }/salary/tostandardUpdate.action?salaryLevel=${salaryLevel.salaryLevel}"
							class="tablelink" target="rightFrame"> 修改</a></td>
			</tr>
        </c:forEach>
       
        </tbody>
    </table>
    


</body>

</html>
