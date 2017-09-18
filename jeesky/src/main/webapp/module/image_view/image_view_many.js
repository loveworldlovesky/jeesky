$(function() {
	
    
});

function doSearch(){
	$('#dg').datagrid('load',{
			trainStartStation:$("#trainStartStation").val(),
			trainEndStation:$("#trainEndStation").val()
		}
	);
}