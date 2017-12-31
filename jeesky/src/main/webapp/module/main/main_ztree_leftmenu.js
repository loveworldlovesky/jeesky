$(function() {
	
	$.ajax({
	   type: "POST",
	   url: window.ctx + '/sys/menu/menu_list.do',
	   dataType: "json",
	   success: function(zNodes){
	     $.fn.zTree.init($("#tt"), setting, zNodes);
	   }
	});
	
});
var setting = {
		data: {
			key: {
				idKey: "menuId",
				pIdKey: "parentMenuId",
				name: "menuName",
				title:"menuName"
			},
			simpleData: {
				enable: true,
				idKey: "menuId",
				pIdKey: "parentMenuId",
				name: "menuName",
				title:"menuName"
			}
		},
		callback: {
			beforeClick: beforeClick,
			onClick: onClick
		}
	};
var log, className = "dark";
function beforeClick(treeId, treeNode, clickFlag) {
	className = (className === "dark" ? "":"dark");
	showLog("[ "+getTime()+" beforeClick ]&nbsp;&nbsp;" + treeNode.menuName );
	return (treeNode.click != false);
}
function onClick(event, treeId, treeNode, clickFlag) {
	showLog("[ "+getTime()+" onClick ]&nbsp;&nbsp;clickFlag = " + clickFlag + " (" + (clickFlag===1 ? "普通选中": (clickFlag===0 ? "<b>取消选中</b>" : "<b>追加选中</b>")) + ")");
	if(treeNode.openType && treeNode.openType == 'menu'){
		addTab(treeNode.menuName,treeNode.menuUrl);
	}else{
		window.open(treeNode.menuUrl);
	}
}		
function showLog(str) {
	if (!log) log = $("#log");
	log.append("<li class='"+className+"'>"+str+"</li>");
	if(log.children("li").length > 8) {
		log.get(0).removeChild(log.children("li")[0]);
	}
}
function getTime() {
	var now= new Date(),
	h=now.getHours(),
	m=now.getMinutes(),
	s=now.getSeconds();
	return (h+":"+m+":"+s);
}
