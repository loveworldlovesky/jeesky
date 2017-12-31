$(function() {
	$.fn.zTree.init($("#treeDemo"), setting, zNodes);
});
var setting = {
		data: {
			key: {
				title:"t",
				idKey: "id1",
				pIdKey: "pId1",
				name: "tt"
			},
			simpleData: {
				enable: true
			}
		},
		callback: {
			beforeClick: beforeClick,
			onClick: onClick
		}
	};
var zNodes =[
 			{ id1:1, pId1:0, tt:"name", t:"title"},
 		];
var log, className = "dark";
function beforeClick(treeId, treeNode, clickFlag) {
	className = (className === "dark" ? "":"dark");
	showLog("[ "+getTime()+" beforeClick ]&nbsp;&nbsp;" + treeNode.name );
	return (treeNode.click != false);
}
function onClick(event, treeId, treeNode, clickFlag) {
	showLog("[ "+getTime()+" onClick ]&nbsp;&nbsp;clickFlag = " + clickFlag + " (" + (clickFlag===1 ? "普通选中": (clickFlag===0 ? "<b>取消选中</b>" : "<b>追加选中</b>")) + ")");
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
