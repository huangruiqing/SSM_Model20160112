<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<script src="/static/js/holder.js"></script>
</head>
<body>
	<jsp:include page="include/header.jsp">
		<jsp:param value="index" name="meau"/>
	</jsp:include>
	
	 <div class="contain">
		<div class="jumbotron">
		  <h1>Hello, world!</h1>
		  <p>...</p>
		  <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a></p>
		</div>
		

		
		<div class="prodPic">
			<div class="pic">
				<div class="message">
					<span class="name" id="0">好时壹号</span>
				</div>
				<img data-src="holder.js/383x250?theme=sky">
				
			</div>
			<div class="pic">
				<div class="message">
					<span class="name" id="1">好时壹号</span>
				</div>
				<img data-src="holder.js/383x250?theme=sky">
			</div>
			<div class="pic">
				<div class="message">
					<span class="name" id="2">好时壹号</span>
				</div>
				<img data-src="holder.js/383x250?theme=sky">
			</div>
			
		</div>


<script>

	$(".pic").each(function(index) {
		var n = "#"+index;
		$(this).hover(function() {
			$(n).slideToggle();
		});
	});
	
</script>
	
</body>
</html>