<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Log in to OpenMarket</title>

<!-- BOOTSTRAP CORE CSS -->
<link href="resources/css/bootstrap.css" rel="stylesheet" />
<!-- ION ICONS STYLES -->
<link href="resources/css/ionicons.css" rel="stylesheet" />
<!-- FONT AWESOME ICONS STYLES -->
<link href="resources/css/font-awesome.css" rel="stylesheet" />
<!-- CUSTOM CSS -->
<link href="resources/css/style.css" rel="stylesheet" />
<!-- IE10 viewport hack  -->
<script src="resources/js/ie-10-view-port.js"></script>

</head>
<body onload='document.loginForm.name.focus();'>
	<section id="login">
		<div class="container">
			<div class="page-header">
				<h1>
					Log in to OpenMarket<br> <small>${error}</small>
				</h1>
			</div>
			<!-- Login Form Start -->
			<form name="loginForm" class="col-md-12" method="post"
				action="userLogin">
				<div class="form-group">
					<input type="email" class="form-control input-lg"
						placeholder="Email" name="name" value="${name}" />
				</div>
				<div class="form-group">
					<input type="password" class="form-control input-lg"
						placeholder="Password" name="password" />
				</div>
				<div class="form-group">
					<input name="submit"
						class="btn btn-custom btn-two btn-lg btn-block" type="submit"
						value="Log in" />
				</div>
			</form>
			<!-- Login Form End -->
			<div class="form-group">
				<span>Forget your password?<a href="userLost"> Reset your
						password</a></span>
			</div>
			<div class="form-group">
				<span>Don't have an a account?<a href="userSignup">
						Create a OpenMarket account</a></span>
			</div>
		</div>
	</section>
	<jsp:include page="page-module/footer.jsp" flush="false" />

	<!-- CORE JQUERY  SCRIPTS -->
	<script src="resources/js/jquery-1.11.1.js"></script>
	<!-- BOOTSTRAP SCRIPTS  -->
	<script src="resources/js/bootstrap.js"></script>

</body>
</html>

