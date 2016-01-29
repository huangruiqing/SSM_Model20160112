<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
	<jsp:include page="include/header.jsp">
		<jsp:param value="index" name="meau"/>
	</jsp:include>

hhhhh:${message}

<form action="/uplod" method="post" enctype="multipart/from-data">
	<input type="text" name="docName"/>
	<input type="file" name="doc"/>
	<input type="submit" value="上传">
</form>


</body>
</html>