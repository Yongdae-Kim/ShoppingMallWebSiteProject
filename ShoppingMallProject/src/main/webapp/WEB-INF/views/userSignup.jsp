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
<title>Create a OpenMarket Account</title>

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
<body onload='document.signupForm.name.focus();'>
	<section id="signup">
		<div class="container">
			<div class="page-header">
				<h1>
					Create a OpenMarket Account<br> <small id="msg">${msg}</small>
				</h1>
			</div>

			<form name=signupForm class="col-md-12" method="post"
				accept-charset="utf-8" action="userSignup"
				onsubmit="return passwordValidation()">
				<div class="form-group">
					<input type="email" class="form-control input-lg"
						placeholder="Email" name="name" />
				</div>
				<div class="form-group">
					<input id="pass" type="password" class="form-control input-lg"
						placeholder="Password" name="password" />
				</div>
				<div class="form-group">
					<input id="c_pass" type="password" class="form-control input-lg"
						placeholder="Confirm Password(again)" name="confirmPassword" />
				</div>
				<div class="form-group">
					<input type="submit"
						class="btn btn-custom btn-two btn-lg btn-block"
						value="Create New Account" />
				</div>
			</form>

			<div class="form-group">
				<span>Already have an account?<a href="userLogin"> Log in</a></span>
			</div>
		</div>
	</section>

	<jsp:include page="page-module/footer.jsp" flush="false" />

	<!-- CORE JQUERY  SCRIPTS -->
	<script src="resources/js/jquery-1.11.1.js"></script>
	<!-- CORE JQUERY  SCRIPTS -->
	<script src="resources/js/pw_validation.js"></script>
	<!-- BOOTSTRAP SCRIPTS  -->
	<script src="resources/js/bootstrap.js"></script>
</body>
</html>

