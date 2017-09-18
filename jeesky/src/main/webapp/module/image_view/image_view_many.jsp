<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/base/base.jsp" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图片预览</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/thirdparty/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/thirdparty/easyui/themes/icon.css">
</head>
<body>
    <div>
	    <table  id="dg"  class="easyui-datagrid" title="车次列表" style="width:100%;height:600px;"
	            data-options="rownumbers:true,toolbar:'#tb',singleSelect:true,url:'${pageContext.request.contextPath}/sy/lines/lines_list.do',method:'post'">
	        <thead>
	            <tr>
	                <th data-options="field:'id',width:80,hidden:true">ID</th>
	                <th data-options="field:'trainNum',width:100">车次</th>
	                <th data-options="field:'trainStartTime',width:100">发车时间</th>
	                <th data-options="field:'trainEndTime',width:100">到达时间</th>
	                <th data-options="field:'trainStartStation',width:100">发站</th>
	                <th data-options="field:'trainEndStation',width:100">到站</th>
	                <th data-options="field:'ticketsPrice',width:100">票价</th>
	                <th data-options="field:'ticketsLeft',width:100">余票</th>
	            </tr>
	        </thead>
	    </table>
        <div id="tb" style="padding:2px 5px;">
	       	 发站: <input id="trainStartStation" class="easyui-textbox" style="width:110px">
	       	 到站: <input id="trainEndStation" class="easyui-textbox" style="width:110px">
	        <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="doSearch()">查询</a>
	    </div>
    </div>
	
	<div></div>
<script type="text/javascript">
</script>


<script src="${pageContext.request.contextPath}/thirdparty/easyui/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/thirdparty/easyui/jquery.easyui.min.js"></script>
<script src="${pageContext.request.contextPath}/module/image_view/image_view_many.js"></script>
</body>
</html>