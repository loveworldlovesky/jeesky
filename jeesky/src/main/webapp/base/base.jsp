<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!--引入c标签库-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!--配置虚拟路径(工程路径)-->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<script type="text/javascript">
	window.ctx = "${pageContext.request.contextPath}";
</script>
