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
<title>OpenMarket List</title>

<!-- BOOTSTRAP STYLES-->
<link href="resources/css/bootstrap.css" rel="stylesheet" />

<!-- ION ICONS STYLES -->
<link href="resources/css/ionicons.css" rel="stylesheet" />

<!-- FONTAWESOME STYLES-->
<link href="resources/css/font-awesome.css" rel="stylesheet" />

<!-- CUSTOM CSS -->
<link href="resources/css/style.css" rel="stylesheet" />

<!-- IE10 viewport hack  -->
<script src="resources/js/ie-10-view-port.js"></script>

<!-- TABLE STYLES-->
<link href="resources/js/dataTables/dataTables.bootstrap.css"
	rel="stylesheet" />

</head>
<body>

	<!-- HEADER SECTION START-->
	<jsp:include page="page-module/header.jsp" flush="false" />
	<!-- HEADER SECTION END-->

	<section>
		<div class="container">
			<div class="page-header">
				<h1>
					My Cart <br>
					<c:choose>
						<c:when test="${empty msg}">
							<small>If you want to buy a product, Click the 'Buy'
								button.</small>
						</c:when>
						<c:otherwise>
							<small>${msg}</small>
						</c:otherwise>
					</c:choose>
				</h1>
			</div>

			<br />
			<div class="row">
				<div class="col-md-12">
					<!-- Advanced Tables -->
					<div class="panel panel-default">
						<div class="panel-heading">My Product List Tables</div>
						<div class="panel-body">
							<div class="table-responsive">
								<table
									class="table table-striped table-bordered table-hover table-custom"
									id="dataTables-example">
									<thead>
										<tr>
											<th>Image</th>
											<th>Name & Description</th>
											<th>Price</th>
											<th>Date</th>
											<th>Seller</th>
											<th>Buy</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="product" items="${cartList}"
											varStatus="status">
											<tr>
												<td><img src="${product.img}"
													class="img-thumbnail img-responsive" alt="${product.img}"
													width="100" height="100"></td>
												<td>${product.name}+${product.description}</td>
												<td>${product.price}</td>
												<td>${product.date}</td>
												<td>${product.seller}</td>
												<td><form action="#" method="POST">
														<input class="btn btn-danger" type="submit" value="Buy" />
													</form></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- FOOTER SECTION START-->
	<jsp:include page="page-module/footer.jsp" flush="false" />
	<!-- FOOTER SECTION END-->

	<!-- JQUERY SCRIPTS -->
	<script src="resources/js/jquery-1.11.1.js"></script>
	<!-- BOOTSTRAP SCRIPTS -->
	<script src="resources/js/bootstrap.js"></script>
	<!-- METISMENU SCRIPTS -->
	<script src="resources/js/jquery.metisMenu.js"></script>
	<!-- DATA TABLE SCRIPTS -->
	<script src="resources/js/dataTables/jquery.dataTables.js"></script>
	<script src="resources/js/dataTables/dataTables.bootstrap.js"></script>
	<script>
		$(document).ready(function() {
			$('#dataTables-example').dataTable();
		});
	</script>

</body>
</html>
