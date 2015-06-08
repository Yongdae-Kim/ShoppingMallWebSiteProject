<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" session="true"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Register in to OpenMarket</title>

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
<body onload='document.loginForm.username.focus();'>
	<section id="register">
		<div class="container">
			<div class="page-header">
				<h1>
					Register in to OpenMarket <br> <small>If you want to
						see on the product, Click the 'detail' button.</small>
				</h1>
			</div>
			<div class="row">

				<form role="form" accept-charset="utf-8" method="post"
					action="register">
					<div class="col-md-12">
						<div class="well well-sm">
							<strong><span class="glyphicon glyphicon-asterisk"></span>Required
								Field</strong>
						</div>
						<div class="form-group">
							<label>Product Name</label>
							<div class="input-group">
								<input type="text" class="form-control" name="name"
									placeholder="Product Name" required> <span
									class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label>Product Image</label>
							<div class="input-group">
								<input type="text" class="form-control" name="img"
									placeholder="Product Image" required> <span
									class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label>Product Price</label>
							<div class="input-group">
								<input type="number" class="form-control" name="price"
									placeholder="Product Price" required> <span
									class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label>Product Seller</label>
							<div class="input-group">
								<input type="text" class="form-control" name="seller"
									placeholder="Product Seller" required> <span
									class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<label>Product Description</label>
							<div class="input-group">
								<textarea name="description" class="form-control" rows="5"
									required></textarea>
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-asterisk"></span></span>
							</div>
						</div>
						<div class="form-group">
							<input name="submit"
								class="btn btn-custom btn-two btn-lg btn-block" type="submit"
								value="Register" />
						</div>
					</div>
				</form>
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