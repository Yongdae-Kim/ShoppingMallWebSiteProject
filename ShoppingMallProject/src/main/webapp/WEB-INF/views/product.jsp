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
<title>Would You Like to Buy the Product ?</title>

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
<body onload='document.submit.focus();'>

	<!-- HEADER SECTION START-->
	<jsp:include page="page-module/header.jsp" flush="false" />
	<!-- HEADER SECTION END-->

	<section id="register">
		<div class="container">
			<div class="page-header">
				<h1>
					Would You Like to Buy the Product ?<br> <small> Click
						the 'Buy it' button</small>
				</h1>
			</div>

			<div class="row">

				<div class="col-md-12">
					<div class="col-md-6">
						<img src="${product.imgPath}" alt="${product.imgPath}"
							class="img-thumbnail" style="width: 550px; height: 450px;">
					</div>
					<div class="col-md-6" style="width: 550px; height: 450px;">
						<h2>Name : ${product.name}</h2>
						<h3>
							Date : <span class="label label-default">${product.date}</span>
						</h3>
						<h3>Description : ${product.description}</h3>
						<h3>Price : ${product.price}</h3>
						<h3>Seller : ${product.seller}</h3>
						<br>
					</div>
					<br>

					<c:choose>
						<c:when test="${empty seller}">
							<div class="form-group">
								<div class="col-md-6">
									<form action="addProduct" method="POST">
										<input type="hidden" name="productId" value="${product.id}" />
										<input name="submit"
											class="btn btn-custom btn-one btn-lg btn-block" type="submit"
											value="Add to Cart" />
									</form>
								</div>
								<div class="col-md-6">
									<form action="#" method="POST">
										<input name="submit"
											class="btn btn-custom btn-two btn-lg btn-block" type="submit"
											value="Buy it" />
									</form>
								</div>
							</div>
						</c:when>
						<c:otherwise>
							<div class="form-group">
								<div class="col-md-12">
									<form action="productModify" method="POST">
										<input type="hidden" name="productId" value="${product.id}" />
										<input name="submit"
											class="btn btn-custom btn-warning btn-lg btn-block"
											type="submit" value="Modify" />
									</form>
								</div>
							</div>
						</c:otherwise>
					</c:choose>
				</div>
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