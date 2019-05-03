<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
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
	    	<li><a href="#tab1" class="selected">发表意见</a></li> 
	  	</ul>
    </div> 
    
  	<form action="${pageContext.request.contextPath }/advice/save.action" method="post">
	    <ul class="forminfo">
	    	<li>
	    		<label>意见标题</label><input name="adviceTitle" type="text" class="dfinput" value=""  style="width:518px;"/>
	    	</li>
	    	<li>
	    		<label>通知内容</label>
	   			<textarea id="content7" name="adviceContent" style="width:700px;height:250px;visibility:hidden;"></textarea>
	    	</li>
	   		<li><label>&nbsp;</label></li>  
    	</ul>
    		<input type="submit" class="btn" value="提交" />
    </form>
    </div>
    </div>
    
</body>

</html>
