<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<meta name="description" content="" />
<meta name="author" content="" />
<!--[if IE]>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <![endif]-->
<!-- Favicon Icon -->
<link rel="icon" href="assets/img/favicon.ico" />
<title>Reset Password</title>
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
<!-- HTML5 Shiv and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body onload='document.resetForm.oldPassword.focus();'>
	<section id="reset">
		<div class="container">
			<div class="page-header">
				<h1>
					Reset Password<br> <small>${msg}</small>
				</h1>
			</div>
			<!-- Reset Form START -->
			<form name=resetForm class="col-md-12" method="post"
				accept-charset="utf-8" action="resetUserPassword">
				<div class="form-group">
					<input type="password" class="form-control input-lg"
						placeholder="Old Password" name="oldPassword" />
				</div>
				<div class="form-group">
					<input type="password" class="form-control input-lg"
						placeholder="New Password" name="password" />
				</div>
				<div class="form-group">
					<input type="password" class="form-control input-lg"
						placeholder="New Password(again)" name="confirmPassword" />
				</div>
				<div class="form-group">
					<input type="submit"
						class="btn btn-custom btn-two btn-lg btn-block" value="Save" />
				</div>
			</form>
			<!-- Change Form End -->
		</div>
	</section>
	<!-- FOOTER SECTION START-->
	<jsp:include page="page-module/footer.jsp" flush="false" />
	<!-- FOOTER SECTION END-->

	<!-- JAVASCRIPT FILES PLACED AT THE BOTTOM TO REDUCE THE LOADING TIME  -->
	<!-- CORE JQUERY  SCRIPTS -->
	<script src="resources/js/jquery-1.11.1.js"></script>
	<!-- BOOTSTRAP SCRIPTS  -->
	<script src="resources/js/bootstrap.js"></script>
	<!-- SCROLLING SCRIPTS PLUGIN  -->
	<script src="resources/js/jquery.easing.min.js"></script>
	<!-- CUSTOM SCRIPTS   -->
	<script src="resources/js/custom.js"></script>

</body>
</html>