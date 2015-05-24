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
<title>Wonder Landing Page</title>
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
	<header id="header">
		<div class="container">
			<div class="row">
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 logo-wrapper">
					<img src="resources/img/logo.png" alt="" />
				</div>
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 text-right">
					<div class="menu-links scroll-me">
						<a href="#contact"> <i class="ion-log-out"></i>
						</a> <a href="#header"> <i class="ion-ios-home-outline"></i>
						</a> <a href="#advertisement"> <i class="ion-ios-star-outline"></i>
						</a> <a href="#"> <i class="ion-ios-list-outline"></i>
						</a> <a href="#"> <i class="ion-ios-upload-outline"></i>
						</a> <a href="#"> <i class="ion-ios-cart-outline"></i>
						</a> <a href="#contact"> <i class="ion-ios-information-outline"></i>
						</a>
					</div>
				</div>
			</div>
		</div>
	</header>
	<!-- HEADER SECTION END-->
	<!--HOME SECTION START  -->
	<div id="home">
		<div class="overlay">
			<div class="container">
				<div class="row scroll-me">
					<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
						<h1>Wonder Landing Page</h1>
						<h4>Consectetur adipiscing elit felis dolor felis dolor
							vitae. Eelit felis dolor vitae adipiscing elit felis dolor felis
							dolor vitae. Eelit felis dolor vitae</h4>
						<a href="login" class="btn btn-custom btn-two">Log In</a> <a
							href="signup" class="btn btn-custom btn-one">Sign Up</a>
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
					<h2 class="head-line">What Worth Here & Why ?</h2>
					<p>Morbi mollis lectus et ipsum sollicitudin varius. Aliquam
						tempus ante placerat, consectetur tellus nec, porttitor nulla.
						Maecenas a quam erat. Praesent vehicula ut magna sit amet
						ultrices.</p>
					<div class="row text-center">
						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
							<div class="row pad-bottom">
								<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
									<div class="icon-wrapper">
										<i class="ion-tshirt-outline"></i>
									</div>
									<h4>Responsive Design</h4>
									Consectetur adipiscing elit felis dolor .

								</div>
								<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
									<div class="icon-wrapper">
										<i class="ion-monitor"></i>
									</div>
									<h4>Awesome Features</h4>
									Consectetur adipiscing elit felis dolor .

								</div>
								<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
									<div class="icon-wrapper">
										<i class="ion-clipboard"></i>
									</div>
									<h4>Multipurpose Use</h4>
									Consectetur adipiscing elit felis dolor .
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 text-center">
					<img src="resources/img/phone.png" class="img-side" alt="" />
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
						<h2>Physical Location</h2>
						<h3>345, New Street ,</h3>
						<h3>United States</h3>
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
