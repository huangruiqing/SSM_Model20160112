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
<%-- <c:import url="./include/header.jsp"/> --%>

<form action="/images/save" method="post" enctype="multipart/form-data">
	<input type="text" name="docName"/>
	<input type="file" name="doc"/>
	<button id="uplodBtn">上传</button>
</form>

<script src="/static/js/juqery-1.11.3.js"></script>
<script src="/static/js/bootstarp.js"></script>
</body>
</html>