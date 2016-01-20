<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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

	<h3>Number Format:</h3>
<c:set var="balance" value="5.6" />
<p>Formatted Number (1): <fmt:formatNumber value="${balance}" 
            type="currency"/></p>
<p>Formatted Number (2): <fmt:formatNumber type="number" 
            maxIntegerDigits="3" value="${balance}" /></p>
<p>Formatted Number (3): <fmt:formatNumber type="number" 
            maxFractionDigits="3" value="${balance}" /></p>
<p>Formatted Number (4): <fmt:formatNumber type="number" 
            groupingUsed="false" value="${balance}" /></p>
<p>Formatted Number (5): <fmt:formatNumber type="percent" 
            maxIntegerDigits="3" value="${balance}" /></p>
<p>Formatted Number (6): <fmt:formatNumber type="percent" minFractionDigits="2" value="${balance}" /></p>
<p>Formatted Number (7): <fmt:formatNumber type="percent" 
            maxIntegerDigits="3" value="${balance}" /></p>
<p>Formatted Number (8): <fmt:formatNumber type="number" 
            pattern="###.###E0" value="${balance}" /></p>
<p>Currency in USA :
<fmt:setLocale value="en_US"/>
<fmt:formatNumber value="${balance}" type="currency"/></p>

	<%-- <h1>hello redirect</h1>
	<a href="/in">ininin</a>
	获取session值：${sessionScope.key}
	<c:set var = "s" value="${sessionScope.key}"></c:set>
	sss:<c:out value="${s }"></c:out>
	<c:if test="${not empty sessionScope.key }">
		<c:out value="not is noll"/>
		<c:redirect url="in"/>  
	</c:if> --%>
</body>

</html>