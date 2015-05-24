<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Reset Your OpenMarket Password</title>

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
<body onload='document.resetForm.username.focus();'>



	<section id="reset">


		<div class="container">
			<div class="col-md-4">
				<a href="welcome"><button type="button"
						class="btn btn-default btn-lg btn-block">Home</button></a>
			</div>
			<div class="col-md-4 col-md-offset-4">
				<div class="col-md-6">
					<a href="login"><button type="button"
							class="btn btn-default btn-lg btn-block">Log In</button></a>
				</div>
				<div class="col-md-6">
					<a href="signup"><button type="button"
							class="btn btn-default btn-lg btn-block">Sign Up</button></a>
				</div>
			</div>
		</div>

		<div class="container">
			<div class="page-header">
				<h1>
					Reset Your OpenMarket Password<br>
					<c:choose>
						<c:when test="${empty msg}">
							<small>Submit your email address and we’ll send you a
								link to reset your password.</small>
						</c:when>
						<c:otherwise>
							<small>${msg}</small>
						</c:otherwise>
					</c:choose>
				</h1>
			</div>

			<form name="resetForm" class="col-md-12" method="post"
				action="resetSubmit">
				<div class=" form-group">
					<input type="email" class="form-control input-lg"
						placeholder="Email" name="username">
				</div>
				<div class="form-group">
					<input name="submit"
						class="btn btn-custom btn-two btn-lg btn-block" type="submit"
						value="Send" />
				</div>
				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" />
			</form>
		</div>
	</section>
	<jsp:include page="page-module/footer.jsp" flush="false" />

	<!-- CORE JQUERY  SCRIPTS -->
	<script src="resources/js/jquery-1.11.1.js"></script>
	<!-- BOOTSTRAP SCRIPTS  -->
	<script src="resources/js/bootstrap.js"></script>
</body>
</html>
