<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/base/base.jsp" %> 
<!DOCTYPE html>
<html>
<head>
  <title>HTML5图片预览</title>
  <script src="http://img9.tongzhuo100.com/js/jquery-1.7.2.min.js"></script>
  <style>
    .hide {
      display:none;
    }
  </style>
</head>
<body>
<h3>请选择一张JPG/GIF的图片</h3>
<form name="form0" id="form0" >
  <input type="file" name="file0" id="file0" multiple="multiple" />
  <br><br><img src="" id="img0" width="120" class="hide">
</form>
<script>
  $("#file0").change(function(){
    var objUrl = getObjectURL(this.files[0]) ;
    console.log("objUrl = "+objUrl) ;
    if (objUrl)
    {
      $("#img0").attr("src", objUrl);
      $("#img0").removeClass("hide");
    }
  }) ;
  function getObjectURL(file)
  {
    var url = null ;
    if (window.createObjectURL!=undefined)
    { // basic
      url = window.createObjectURL(file) ;
    }
    else if (window.URL!=undefined)
    {
      // mozilla(firefox)
      url = window.URL.createObjectURL(file) ;
    }
    else if (window.webkitURL!=undefined) {
      // webkit or chrome
      url = window.webkitURL.createObjectURL(file) ;
    }
    return url ;
  }
</script>
</body>
</html>