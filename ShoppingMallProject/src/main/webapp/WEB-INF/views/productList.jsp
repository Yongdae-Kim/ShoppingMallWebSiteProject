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
<title>OpenMarket Product List</title>

<!-- BOOTSTRAP STYLES-->
<link href="resources/css/bootstrap.css" rel="stylesheet" />

<!-- FONTAWESOME STYLES-->
<link href="resources/css/font-awesome.css" rel="stylesheet" />

<!-- ION ICONS STYLES -->
<link href="resources/css/ionicons.css" rel="stylesheet" />

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
					OpenMarket Product List <br> <small>If you want to see
						on the product, Click the 'Detail' button.</small>
				</h1>
			</div>

			<br />
			<div class="row">
				<div class="col-md-12">
					<!-- Advanced Tables -->
					<div class="panel panel-default">
						<div class="panel-heading">Product List Tables</div>
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
											<th>Detail</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="product" items="${productList}"
											varStatus="status">
											<tr>
												<td><img src="${product.imgPath}"
													class="img-thumbnail img-responsive"
													alt="${product.imgPath}" width="100" height="100"></td>
												<td><span style="font-weight: bold">${product.name}</span><br>
													<br>${product.description}</td>
												<td>${product.price}</td>
												<td>${product.date}</td>
												<td>${product.seller}</td>
												<td><form action="product" method="GET">
														<input type="hidden" name="productId"
															value="${product.id}" /> <input class="btn btn-info"
															type="submit" value="Detail" />
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
