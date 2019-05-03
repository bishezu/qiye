<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>

<script type="text/javascript">
	$(function() {
		//导航切换
		$(".menuson li").click(function() {
			$(".menuson li.active").removeClass("active");
			$(this).addClass("active");
		});

		$('.title').click(function() {
			var $ul = $(this).next('ul');
			$('dd').find('ul').slideUp();
			if ($ul.is(':visible')) {
				$(this).next('ul').slideUp();
			} else {
				$(this).next('ul').slideDown();
			}
		});
	});
</script>


</head>

<body style="background:#f0f9fd;">

	<div class="lefttop">
		<span></span>列表
	</div>

	<dl class="leftmenu">
	
		<dd>
			<div class="title">
				<span><img src="${pageContext.request.contextPath }/images/leftico01.png" /></span>个人管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="${pageContext.request.contextPath }/empInfoModify.jsp" target="rightFrame">个人信息修改</a><i></i></li>
				<li><cite></cite><a href="${pageContext.request.contextPath }/login/toModifyPassword.action" target="rightFrame">密码修改</a><i></i></li>
			</ul>
		</dd>

		<dd>
			<div class="title">
				<span><img src="${pageContext.request.contextPath }/images/leftico01.png" /></span>部门管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="${pageContext.request.contextPath }/dept/list.action" target="rightFrame">部门信息</a><i></i></li>
			</ul>
		</dd>

		<dd>
			<div class="title">
				<span><img src="${pageContext.request.contextPath }/images/leftico01.png" /></span>职位管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="${pageContext.request.contextPath }/title/title.action" target="rightFrame">职位信息</a><i></i></li>
			</ul>
		</dd>

		<dd>
			<div class="title">
				<span><img src="${pageContext.request.contextPath }/images/leftico01.png" /></span>员工管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="${pageContext.request.contextPath }/staff/list.action" target="rightFrame">员工信息</a><i></i></li>
			</ul>
		</dd>

		<dd>
			<div class="title">
				<span><img src="${pageContext.request.contextPath }/images/leftico01.png" /></span>考勤管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="${pageContext.request.contextPath }/Attendance/attendanceListAdmin.action" target="rightFrame">考勤信息</a><i></i></li>
			</ul>
		</dd>
		
		<dd>
			<div class="title">
				<span><img src="${pageContext.request.contextPath }/images/leftico01.png" /></span>加班与请假
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="${pageContext.request.contextPath }/Overwork/overworkListAdmin.action" target="rightFrame">加班管理</a><i></i></li>
				<li><cite></cite><a href="${pageContext.request.contextPath }/Dayoff/dayoffListAdmin.action"
					target="rightFrame">请假管理</a><i></i></li>
			</ul>
			
		</dd>
        
        
        <dd>
			<div class="title">
				<span><img src="${pageContext.request.contextPath }/images/leftico01.png" /></span>绩效管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="${pageContext.request.contextPath }/Achieve/achieveListAdmin.action" target="rightFrame">绩效列表</a><i></i></li>
				<li><cite></cite><a href="${pageContext.request.contextPath }/Achieve/signIn.action"
					target="rightFrame">绩效考评</a><i></i></li>
			</ul>
		</dd>
		
		<dd>
			<div class="title">
				<span><img src="${pageContext.request.contextPath }/images/leftico01.png" /></span>薪资管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="${pageContext.request.contextPath }/salary/list.action" target="rightFrame">薪资列表</a><i></i></li>
				<li><cite></cite><a href="${pageContext.request.contextPath }/salary/standard.action"
					target="rightFrame">基本薪资</a><i></i></li>
				<li><cite></cite><a href="${pageContext.request.contextPath }/salary/stafflist.action"
					target="rightFrame">员工薪资等级</a><i></i></li>

			</ul>
		</dd>

		

		<dd>
			<div class="title">
				<span><img src="${pageContext.request.contextPath }/images/leftico01.png" /></span>权限管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="${pageContext.request.contextPath }/admin/adminType.action" target="rightFrame">管理员种类</a><i></i></li>
			</ul>
		</dd>

	</dl>