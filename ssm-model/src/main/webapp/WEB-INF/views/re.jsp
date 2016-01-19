<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
	alert("2");
</script>
</head>
<body>
	<h1>hello redirect</h1>
	获取session值：${sessionScope.key}
	<c:set var = "s" value="${sessionScope.key}"></c:set>
	sss:<c:out value="${s }"></c:out>
	<c:if test="${not empty sessionScope.key }">
		<c:out value="not is noll"/>
		<c:redirect url="in"/>  
	</c:if>
</body>

</html>