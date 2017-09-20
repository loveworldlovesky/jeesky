<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>ztree树学习演示</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/thirdparty/ztree/css/zTreeStyle/zTreeStyle.css">
</head>
<body>
ztree树学习演示
<h1>单击节点控制</h1>
<h6>[ 文件路径: core/click.html ]</h6>
<div class="content_wrap">
	<div class="zTreeDemoBackground left">
		<ul id="treeDemo" class="ztree"></ul>
	</div>
	<div class="right">
		<ul class="info">
			<li class="title"><h2>1、beforeClick / onClick 事件回调函数控制</h2>
				<ul class="list">
				<li>利用 click 事件回调函数 可以进行各种其他的附加操作，这里简单演示如何监控此事件</li>
				<li><p><span class="highlight_red">请尝试按下 <b>Ctrl</b> 或 <b>Cmd</b> 键进行 多节点选择 和 取消选择</span><br/>
					click log:<br/>
					<ul id="log" class="log"></ul></p>
				</li>
				</ul>
			</li>
			<li class="title"><h2>2、setting 配置信息说明</h2>
				<ul class="list">
				<li class="highlight_red">需要设置 setting.callback.beforeClick 和  setting.callback.onClick 属性, 详细请参见 API 文档中的相关内容</li>
				</ul>
			</li>
			<li class="title"><h2>3、treeNode 节点数据说明</h2>
				<ul class="list">
				<li>对 节点数据 没有特殊要求，用户可以根据自己的需求添加自定义属性</li>
				</ul>
			</li>
		</ul>
	</div>
</div>
<script src="${pageContext.request.contextPath}/thirdparty/jquery/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/thirdparty/ztree/js/jquery.ztree.all.js"></script>
<script src="${pageContext.request.contextPath}/ztree.js"></script>
</body>
</html>