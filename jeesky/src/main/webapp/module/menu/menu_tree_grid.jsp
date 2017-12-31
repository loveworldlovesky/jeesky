<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/base/base.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JEESKY</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/thirdparty/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/thirdparty/easyui/themes/icon.css">
	
<style type="text/css">

</style>

</head>
<body>
	<h2>Basic TreeGrid</h2>
	<table id="menuTreeGrid" style="width:100%;height:400px"></table>
	
	<script	src="${pageContext.request.contextPath}/thirdparty/jquery/jquery.min.js"></script>
	<script	src="${pageContext.request.contextPath}/thirdparty/easyui/jquery.easyui.min.js"></script>
	<script src="${pageContext.request.contextPath}/module/menu/menu_tree_grid.js"></script>
</body>
</html>