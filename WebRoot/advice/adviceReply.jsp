<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/select.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.idTabs.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/select-ui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/editor/kindeditor.js"></script>

<script type="text/javascript">
    KE.show({
        id : 'content7',
        cssPath : './index.css'
    });
  </script>
  
<script type="text/javascript">
$(document).ready(function(e) {
    $(".select1").uedSelect({
		width : 345			  
	});
	$(".select2").uedSelect({
		width : 167  
	});
	$(".select3").uedSelect({
		width : 100
	});
});
</script>
</head>

<body>

	
    
    <div class="formbody">

    <div id="usual1" class="usual"> 
    
    <div class="itab">
	  	<ul> 
	    	<li><a href="#tab1" class="selected">回复意见</a></li> 
	  	</ul>
    </div> 
    
  	<div id="tab1" class="tabson">
	    <ul  class="forminfo">
	    <!-- 
	    private Integer adviceId;//意见编号
		private String adviceTitle;//意见标题
		private Integer staffId;//意见人编号
		private String adviceContent;//意见内容
		private Date adviceTime;//发表意见的时间
		private String replyContent;//回复内容
		private Integer adminId;//回复人编号
		private Date replyTime;//回复时间
	     -->
	    <form action="${pageContext.request.contextPath }/advice/modify.action" method="post">
	    	<li><label>编号：</label><input name="adviceId" type="text" class="dfinput" value="${advice.adviceId }"  style="width:518px;"/></li>
	    	<li><label>员工编号：</label><input type="text" class="dfinput" value="${advice.staffId }"  style="width:518px;"/></li>
	    	<li><label>标题：</label><input type="text" class="dfinput" value="${advice.adviceTitle }"  style="width:518px;"/></li>
	   		<li><label>意见内容：</label><input type="longtext" class="dfinput" value="${advice.adviceContent }"  style="width:518px; height: 150px"/></li>
	   		<li>
	   			<label>回复内容：</label>
	   			<textarea id="content7" name="replyContent" style="width:700px;height:250px;visibility:hidden;" >${advice.replyContent }</textarea>
	    	</li>
	    	<label>&nbsp;</label>
	    	<input type="submit" class="btn" value="提交" />
	    	<input name="" type="button" class="btn" value="返回" onclick="javascript :history.back(-1)" style=""/>
	   	</form>
	    </ul>
    </div>
     
    </div>
    </div>
    
</body>

</html>
