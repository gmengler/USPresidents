<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>

<link href="StyleSheet.css" rel="stylesheet" type="text/css">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>U.S. Presidents</title>
</head>

<body>

	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<h1>Presidents of the United States</h1>
			</div>
		</div>
		<br>
		<!-- Previous, Search by term number, Next -->
		<div class="row">
			<div class="col-md-1"></div>
			<div class="col-md-2 text-center">
				<form action="Presidents.do" method="POST">
					<button type="submit" class="btn btn-default btn-arrow-left"
						name="previous">Previous President</button>
				</form>
			</div>
			<div class="col-md-6 text-center">
				<form action="Presidents.do" method="POST">
					<c:choose>
						<c:when test="${not empty termNumberError}">
  						<span class="text-danger">Invalid term number</span><br>
						</c:when>
					</c:choose>
					<label>Search by Term Number: <input type="text"
						name="termNumber"> <input type="submit" value="submit"
						name="getByTermNumber">
					</label>
				</form>
			</div>
			<div class="col-md-2 text-center">
				<form action="Presidents.do" method="POST">
					<button type="submit" class="btn btn-default btn-arrow-right"
						name="next">Next President</button>
				</form>
			</div>
			<div class="col-md-1"></div>
		</div>

		<!-- Pres info, photo -->
		<div class="row vertical-align">
			<div class="col-md-2"></div>
			<div class="col-md-4">
				<form action="Presidents.do" method="POST">
					<ul>
						<li>Name: ${currentPresident.name}</li>
						<li>Term Number: ${currentPresident.termNumber}</li>
						<li>Party: ${currentPresident.party}</li>
						<li>Presidency:</li>
						<li>From: ${currentPresident.termBeginDate}</li>
						<li>To: ${currentPresident.termEndDate}</li>
						<li>Interesting Fact: ${currentPresident.fact}</li>
					</ul>
				</form>
			</div>
			<div class="col-md-4">
				<img class="resize" src="${currentPresident.picURL}" />
			</div>

			<div class="col-md-2"></div>
		</div>

		<br>
		<br>
		<!-- Previous, Search by term number, Next -->
		<div class="row">
			<div class="col-md-1"></div>
			<div class="col-md-2 text-center">
				<form action="Presidents.do" method="POST">
					<button type="submit" class="btn btn-default btn-arrow-left"
						name="previous">Previous President</button>
				</form>
			</div>
			<div class="col-md-6 text-center">
				<form action="Presidents.do" method="POST">
					<c:choose>
						<c:when test="${not empty termNumberError}">
  						Invalid term number<br>
						</c:when>
					</c:choose>
					<label>Search by Term Number: <input type="text"
						name="termNumber"> <input type="submit" value="submit"
						name="getByTermNumber">
					</label>
				</form>
			</div>
			<div class="col-md-2 text-center">
				<form action="Presidents.do" method="POST">
					<button type="submit" class="btn btn-default btn-arrow-right"
						name="next">Next President</button>
				</form>
			</div>
			<div class="col-md-1"></div>
		</div>


	</div>
	<!-- closing main div tag -->

</body>
</html>