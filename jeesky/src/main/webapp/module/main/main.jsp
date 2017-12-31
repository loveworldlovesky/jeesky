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
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/thirdparty/ztree/css/zTreeStyle/zTreeStyle.css">
	
<style type="text/css">

</style>

</head>
<body  id="cc" class="easyui-layout">

	<div data-options="region:'north',split:true" style="width:100%;height:10%">
         <h2 align="center">JEESKY</h2>
	</div>
    <div data-options="region:'west',split:true" style="width:20%;height:100%">
    	<div class="zTreeDemoBackground left">
			<ul id="tt" class="ztree"></ul>
		</div>
    </div>
    <div data-options="region:'center'" style="padding: 5px; background: #eee;">
        <div id="main-center" class="easyui-tabs" fit="true" border="false">
            <div title="首页" style="padding: 20px;">
                <img src="images/banner.gif"></img>
                <div style="margin-top: 20px;">
                    <h2>考试</h2>
                    <h2 style="line-height: 30px;">
                    <a href="${pageContext.request.contextPath}/t1.jsp" target="_blank">t1.jsp  一、代码补全 </a><br>
                    <a href="${pageContext.request.contextPath}/t2.jsp" target="_blank">t2.jsp  二、编写代码  1.字符统计</a><br>
                    <a href="${pageContext.request.contextPath}/t3.jsp" target="_blank">t3.jsp  二、编写代码  2.域名反转</a><br>
                    <a href="${pageContext.request.contextPath}/t4.jsp" target="_blank">t4.jsp  二、编写代码  3.日期计算</a><br>
                    <a href="${pageContext.request.contextPath}/t5.jsp" target="_blank">t5.jsp  三、程序设计 </a>
                    </h2>
                </div>
                <div>
				<ul id="log" class="log"></ul>
				</div>
            </div>
        </div>
    </div>
	<script	src="${pageContext.request.contextPath}/thirdparty/jquery/jquery.min.js"></script>
	<script	src="${pageContext.request.contextPath}/thirdparty/easyui/jquery.easyui.min.js"></script>
	<script src="${pageContext.request.contextPath}/thirdparty/ztree/js/jquery.ztree.all.js"></script>
	<script src="${pageContext.request.contextPath}/module/main/main.js"></script>
	<script src="${pageContext.request.contextPath}/module/main/main_ztree_leftmenu.js"></script>
</body>
</html>