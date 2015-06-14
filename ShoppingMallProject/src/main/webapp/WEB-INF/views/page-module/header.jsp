<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<header id="header">
	<div class="container">
		<div class="row">
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 logo-wrapper">
				<h3>
					<a href="welcome">OpenMarket - Everyone Buy, Everyone Sell</a>
				</h3>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 text-right">
				<div class="menu-links scroll-me">
					<c:choose>
						<c:when test="${empty sessionScope.loginUser}">
							<a href="welcome"> <i class="ion-ios-home"></i></a>
							<a href="userLogin"> <i class="ion-log-in"></i></a>
							<a href="productList"> <i class="ion-ios-list-outline"></i></a>
						</c:when>
						<c:otherwise>
							<a href="welcome"> <i class="ion-ios-home"></i></a>
							<a href="productList"> <i class="ion-ios-list-outline"></i></a>
							<a href="productRegister"> <i class="ion-ios-upload-outline"></i></a>
							<a href="userCart"> <i class="ion-ios-cart-outline"></i></a>
							<a href="welcome"> <i class="ion-ios-folder-outline"></i></a>
							<a href="userReset"><i class="ion-ios-person"></i></a>
							<a href="userLogout"> <i class="ion-log-out"></i></a>
							<h4>Welcome to OpenMarket !!! ${sessionScope.loginUser.name}</h4>
						</c:otherwise>
					</c:choose>
				</div>
			</div>
		</div>
	</div>
</header>
