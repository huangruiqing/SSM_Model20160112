<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon" href=" /static/img/favicon.ico" />
</head>
<body>
<h2>hello</h2>
{}{}{}{}{}{}::::${key }
<c:if test="${fn:contains(key,'%') }">
	<h2>hello </h2>
</c:if>
[${key * 1 }]
[${key * 10 }]
[${key * 100}]
${0.56 * 100}
dd: ${(key * 1) > 1 }dd
<c:if test="${key  ge 2 }">${key }</c:if>
ll:${sessionScope.id }
ll:${sessionScope.key }

</body>
</html>