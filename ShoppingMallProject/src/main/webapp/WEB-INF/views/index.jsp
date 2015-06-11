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
<title>Everybody Buy, Everybody Sell</title>
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
<body>
	<!-- HEADER SECTION START-->
	<jsp:include page="page-module/header.jsp" flush="false" />
	<!-- HEADER SECTION END-->
	<!--HOME SECTION START  -->
	<div id="home">
		<div class="overlay">
			<div class="container">
				<div class="row scroll-me">
					<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
						<h1>OpenMarket</h1>
						<h2>Everybody Buy, Everybody Sell</h2>
						<h4>
							You can be a master of the OpenMarket.<br> Sign up right
							now!
						</h4>
						<a href="userLogin" class="btn btn-custom btn-two">Log In</a> <a
							href="userSignup" class="btn btn-custom btn-one">Sign Up</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--HOME SECTION END  -->
	<!-- ABOUT SECTION START-->
	<section id="advertisement">
		<div class="container">
			<div class="row">
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
					<h1>
						Today's Product <span class="label label-default">New</span>
					</h1>
					<h2 class="head-line">${product.name}</h2>
					<h3>${product.description}</h3>
					<div class="row text-center">
						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
							<div class="row pad-bottom">
								<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
									<div class="icon-wrapper">
										<i class="ion-ios-time"></i>
									</div>
									<h3>Time</h3>
									<h4>${product.date}</h4>
								</div>
								<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
									<div class="icon-wrapper">
										<i class="ion-pricetag"></i>
									</div>
									<h3>Price</h3>
									<h4>${product.price}</h4>
								</div>
								<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
									<div class="icon-wrapper">
										<i class="ion-person"></i>
									</div>
									<h3>Seller</h3>
									<h4>${product.seller}</h4>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 text-center">
					<img src="${product.img}" class="img-side" alt="" />
				</div>
			</div>
		</div>
	</section>
	<!-- ABOUT SECTION END-->
	<!-- CONTACT SECTION START-->
	<section id="contact">
		<div class="overlay">
			<div class="container">
				<div class="row text-center">
					<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12  contact-cover">
						<h2>Location</h2>
						<h3>JEJU National Univ, South Korea</h3>
						<h3>Software Development Lab</h3>
						<h3>Scratchback</h3>
						<div class="space"></div>
						<div class="social">
							<a href="#"><i class="fa fa-facebook "></i></a> <a href="#"><i
								class="fa fa-twitter"></i></a> <a href="#"><i
								class="fa fa-google-plus "></i></a> <a href="#"><i
								class="fa fa-linkedin "></i></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- CONATCT SECTION END-->

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
