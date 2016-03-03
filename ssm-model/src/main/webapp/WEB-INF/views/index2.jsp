<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<link rel="stylesheet" href="/static/css/bootstrap.css" />
<link rel="stylesheet" href="/static/css/font-awesome.min.css" />
<script src="/static/js/holder.js"></script>
</head>
<body>
<%-- <c:import url="./include/header.jsp"/>  --%>
<h2>Message:${message}</h2>
<form action="/images/save" method="post" id="uplodForm" enctype="multipart/form-data">
	<input type="text" name="docName"/>
	<input type="file" name="doc" id="doc"/>
	<input type="button" id="upload" value="上传"/>
</form> 











<img src="" alt="" id="preview" />
<script src="/static/js/jquery-1.11.3.js"></script>
<script src="/static/js/bootstrap.js"></script>
<script>


</script>
</body>
</html>