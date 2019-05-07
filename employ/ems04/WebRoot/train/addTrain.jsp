<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css" />
<title>添加培训信息</title>
</head>
<body>

  <div class="formtitle"><span>填写培训信息</span></div>
    <form action="${pageContext.request.contextPath }/train/add.action" method="post">
    <ul class="forminfo">
    <li><label>培训期数</label><input name="num" type="text" class="dfinput"/></li>
    <li><label>培训时间</label><input name="date" type="date" class="dfinput"/></li>
    <li><label>培训内容</label><input name="info" type="textarea" class="dfinput"/></li>
    <li><label>&nbsp;</label><input type="submit" class="btn" value="确认提交" />
    </li>
    </ul>
    </form>
</body>
</html>