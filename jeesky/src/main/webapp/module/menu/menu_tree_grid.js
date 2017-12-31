$(function() {
	$('#menuTreeGrid').treegrid({
	    url:window.ctx + '/sys/menu/menu_list_treegrid.do',
	    idField:'menuId',
	    treeField:'menuName',
	    columns:[[
			{field:'menuName',title:'name'},
			{field:'menuUrl',title:'menuUrl',align:'right'},
			{field:'openType',title:'openType'},
			{field:'icon',title:'icon'}
	    ]]
	});
    
});
