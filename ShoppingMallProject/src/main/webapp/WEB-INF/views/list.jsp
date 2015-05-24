<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
	<section>
		<div class="container">
			<div class="page-header">
				<h1>
					Log in to OpenMarket <br> <small>If you want to see on
						the product, Click the 'detail' button.</small>
				</h1>
			</div>

			<br />
			<div class="row">
				<div class="col-md-12">
					<!-- Advanced Tables -->
					<div class="panel panel-default">
						<div class="panel-heading">User Usage Count Tables</div>
						<div class="panel-body">
							<div class="table-responsive">
								<table
									class="table table-striped table-bordered table-hover table-custom"
									id="dataTables-example">
									<thead>
										<tr>
											<th>Encrypted User ID</th>
											<th>My Favorites 1</th>
											<th>My Favorites 2</th>
											<th>Food Style</th>
											<th>Charts</th>
										</tr>
									</thead>
									<tbody>

										<c:forEach var="user" items="${myList}" varStatus="status">
											<tr>
												<td>${user.id}</td>
												<td>${user.name}</td>
												<td>${user.password}</td>
												<td>${user}</td>
												<td><form action="chart" method="POST">
														<input class="hide" name=id value=${user.id } /> <input
															class="hide" name=name value=${user.name } /> <input
															class="hide" name=password value=${user.password } /> <input
															class="btn btn-custom btn-one" type="submit"
															value="Detail" /><input type="hidden"
															name="${_csrf.parameterName}" value="${_csrf.token}" />
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
