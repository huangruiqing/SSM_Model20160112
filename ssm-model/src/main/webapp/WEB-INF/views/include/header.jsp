<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<!--为了确保适当的绘制和触屏缩放，需要在 <head> 之中添加 viewport 元数据标签。-->
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title></title>
		<link rel="stylesheet" type="text/css" href="static/css/bootstrap.css"/>
		<link rel="stylesheet" href="static/css/font-awesome.min.css" />
		<link rel="stylesheet" type="text/css" href="static/css/main.css"/>
		<style type="text/css">
			form .error{
				color:red;
			}
		</style>
	</head>
	<body>
		
		<nav class="navbar navbar-default">
			<div class="container-fluid">
			    <!-- Brand and toggle get grouped for better mobile display -->
			    <div class="navbar-header">
			    	<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
				        <span class="sr-only">Toggle navigation</span>
				        <span class="icon-bar"></span>
				        <span class="icon-bar"></span>
				        <span class="icon-bar"></span>
				    </button>
			      <a class="navbar-brand" href="#">
			      	<img src="static/img/logo.png" alt="Brand" height="30px" width="40px"/>
			      </a>
			    </div>
			    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="active"><a href="">首页</a></li>
					<li><a href="">目标1</a></li>
					<li><a href="">目标2</a></li>
					<li><a href="">目标3</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right right1">
					<li>
						<c:if test="${sessionScope.login eq 'true' }">
							<div class="dropdown">
							  <button class="btn btn-default dropdown-toggle margin-top7px" type="button" id="personMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
									<i class="fa fa-user"></i>${sessionScope.userName}
							  </button>
							  <ul class="dropdown-menu lua" aria-labelledby="personMenu">
							    <li><a href="javascript:;"> <i class="fa fa-user"></i> 个人中心</a></li>
							    <li><a href="javascript:;"><i class="fa fa-shopping-cart"></i> 购物车</a></li>
							    <li><a href="javascript:;"><i class="fa fa-sign-out"></i> 退出</a></li>
							  </ul>
							</div>
								
						</c:if>
						<c:if test="${empty sessionScope.login }">
							<a href="javascript:;" data-toggle="modal" data-target="#loginModal">
								<i class="fa fa-user"></i>  登录
							</a>
						</c:if>
					</li>
					<li>
						<c:if test="${empty sessionScope.login }">
							<a href="javascript:;" data-toggle="modal" data-target="#registModal">
								<i class="fa fa-edit"></i>  注册
							</a>
						</c:if>
						
					</li>
				</ul>
				</div><!-- navbar-collapse-->
			</div><!-- /.container-fluid -->
		</nav>
			
		<!--login Modal -->
		<div class="modal fade" id="loginModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title" id="myModalLabel"> <i class="fa fa-sign-in"></i> 登录</h4>
		      </div>
		      <div class="modal-body">
		        <form action="/login" class="form-horizontal" method="post" id="loginForm">
		        	<div class="form-group">
		        		<label class="col-sm-2 control-label">账户</label>
		        		<div class="col-md-6">
		        			<input type="text" class="form-control" placeholder="账户" name="userName"/>
		        		</div>
		        	</div>
		        	<div class="form-group">
					    <label class="col-sm-2 control-label">密码</label>
					    <div class="col-sm-6">
					      <input type="password" class="form-control" placeholder="密码" name="password" maxlength="18">
					    </div>
					</div>
		        </form>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
		        <button type="button" class="btn btn-primary" id="loginBtn">登录</button>
		      </div>
		    </div>
		  </div>
		</div>
		<!--<!--regist Modal -->
		
		<div class="modal fade" id="registModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title" id="myModalLabel"><i class="fa fa-edit"></i> 注册</h4>
		      </div>
		      <div class="modal-body">
		        <form action="/regist" class="form-horizontal" method="post" id="registForm">
		        	<div class="form-group">
		        		<label class="col-sm-2 control-label">账户</label>
		        		<div class="col-md-6">
		        			<input type="text" id="userName" class="form-control" placeholder="账户" name="userName"/>
		        		</div>
		        	</div>
		        	<div class="form-group">
					    <label class="col-sm-2 control-label">密码</label>
					    <div class="col-sm-6">
					      <input type="password" class="form-control" placeholder="密码" id="password" name="password" maxlength="18" id="password">
					    </div>
					</div>
					<div class="form-group">
					    <label class="col-sm-2 control-label">确认密码</label>
					    <div class="col-sm-6">
					      <input type="password" class="form-control" placeholder="确认密码" name="repassword" maxlength="18" >
					    </div>
					</div>
					<div class="form-group">
					    <label class="col-sm-2 control-label">手机号</label>
					    <div class="col-md-4">
					      <input type="text" class="form-control" placeholder="手机号...." id="tel" name="tel" maxlength="15">
					    </div>
					    <div class="col-md-1">
					     <input type="button" class="btn btn-danger orm-control" id="sendCode" value="发送验证码"/>
					    </div>
					</div>
					<div class="form-group">
					    <label class="col-sm-2 control-label">验证码</label>
					    <div class="col-sm-3">
					      <input type="text" class="form-control " placeholder="验证码..." name="yzm" maxlength="6">
					    </div>
					</div>
		        </form>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
		        <button type="button" class="btn btn-primary" id="registBtn">注册</button>
		      </div>
		    </div>
		  </div>
		</div>
		
		
		
		
	<!------------------------------------------------------------------------------------------------------->
	<!-- 
	
	<div class="row">
  <div class="col-sm-2">
    <div class="thumbnail">
      <img src="holder.js/200x140">
      <div class="caption">
        <h4>Thumbnail label</h4>
        <p>...</p>
        <p><a href="#" class="btn btn-primary btn-xs" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
      </div>
    </div>
  </div>
</div> -->
	
	
	
	

	
		<script src="static/js/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
		<script src="static/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="static/js/jquery.validate.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript">
			$(function() {
				
				$.validator.addMethod("isPhone",function(value,element) {
					var length = value.length;
					var phone =  /^(((13[0-9]{1})|(15[0-9]{1}))+\d{8})$/;
					var tel =  /^\d{3,4}-?\d{7,9}$/;  
					//this.optional(element) || (tel.test(value) || phone.test(value));
					return this.optional(element)|| tel.test(value) || phone.test(value);
				},"请输入正确的手机号");
				
				
				
				// 检测form表单数据
				// 登录)
				$("#loginForm").validate({
					errorElement:"span",
                	errorClass:"error",
					rules:{
						userName:{
							required:true
						},
						password:{
							required:true,
							rangelength:[6,18]
						}
					},
					messages:{
						userName:{
							required:"账户不能为空"
						},
						password:{
							required:"密码不能为空",
							rangelength:"密码长度为6-18位"
						}
					}
					
				
				});
				
				$("#loginBtn").click(function() {
					$("#loginForm").submit();
				});
				
				$("#registForm").validate({
					errorElement:"span",
					errorClass:"error",
					rules:{
						userName:{
							required:true,
							remote:{
								url:'/check/username',
								type:'get',
								dataType:'json',
								data:{
									userName:function() {
										return $("#userName").val();
									}
								}
								
							}
						},
						password:{
							required:true,
							rangelength:[6,18]
						},
						repassword:{
							required:true,
							equalTo:"#password"
						},
						yzm:{
							required:true
						},
						tel:{
							required:true,
							isPhone:true
						}
					},
					messages:{
						userName:{
							required:"用户名不能为空",
							remote:"改用户名已被注册"
						},
						password:{
							required:"密码不能为空",
							rangelength:"密码长度为6-18位"
						},
						repassword:{
							required:'密码不能为空',
							equalTo: "两次密码不一致"
						},
						yzm:{
							required:'请输入验证码'
						},
						tel:{
							required:"手机号不能为空",
							isPhone:"请输入正确的手机号"
						}
					}
					
					
					
				});
				
				$("#registBtn").click(function(){
					$("#registForm").submit();
				});
				
			});
		</script>
	</body>
</html>
