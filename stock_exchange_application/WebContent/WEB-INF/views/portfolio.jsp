<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description"
	content="Stock">
<meta
	name="Diksha Jasuja, Gaurav Vaswani, Gayathri Jayaseelan, Liya Baby,Priyanka Upadhyay, Prashant Birajdar,Rasika Deshpande, Raveena Nagdev, Sanket Solanki,Shivkumar Rathod"
	content="AtoS India Pvt. Ltd. - Trainee Project - Stock Exchange Application">
<link rel="icon" href="">
<title>Stock Exchange Application</title>

<!-- BootStrap CSS -->
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.css" rel="StyleSheet" type="text/css">

<!-- BootStrap Table CSS -->
<link href="${pageContext.request.contextPath}/resources/css/bootstrap-table.css" rel="StyleSheet" type="text/css">

<!-- BootStrap Validator CSS -->
<link href="${pageContext.request.contextPath}/resources/css/bootstrapValidator.css" rel="StyleSheet" type="text/css">

<!-- BootStrap Date Picker CSS -->
<link href="${pageContext.request.contextPath}/resources/css/bootstrap-datepicker/bootstrap-datepicker3.css" rel="StyleSheet" type="text/css">

<!-- Custom CSS -->
<link href="${pageContext.request.contextPath}/resources/css/style.css" rel="StyleSheet" type="text/css">

<!-- FontAwesome CSS -->
<link href="${pageContext.request.contextPath}/resources/css/font-awesome.css" rel="StyleSheet" type="text/css">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>

		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<!--<script>window.jQuery || document.write('<script src="js/jquery.min.js"><\/script>')</script>-->
		
		<!-- Bootstrap Validator JavaScript -->
		<script src="${pageContext.request.contextPath}/resources/js/bootstrapValidator.js"></script>
		
		<!-- Bootstrap Table JavaScript -->
		<script src="${pageContext.request.contextPath}/resources/js/bootstrap-table.js"></script>
    	
		
		<!-- Date Picker -->
		<script src="${pageContext.request.contextPath}/resources/js/bootstrap-datepicker/bootstrap-datepicker.js"></script>
	
		<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
		
		<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
		<script src="${pageContext.request.contextPath}/resources/js/ie10-viewport-bug-workaround.js"></script>
		
		<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
		<script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script>
		<script src='http://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/js/bootstrapvalidator.min.js'></script>

<!-- Bootstrap core JavaScript -->
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
		
<!-- Google Fonts for Material IO -->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="StyleSheet">

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<!--<link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">-->


<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="${pageContext.request.contextPath}/resources/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="${pageContext.request.contextPath}/resources/js/ie-emulation-modes-warning.js"></script>


<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
		  
		<![endif]-->
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>

<script src="${pageContext.request.contextPath}/resources/js/jquery-3.2.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>

	</head>
	<!-- body begins -->
	<body>
		<!-- header navigation begins -->
		
		<jsp:include page="header.jsp" />
		<!-- header navigation ends -->
		
		<!-- main body begins -->
		<div class="col-md-12 body-wrap">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<h1 style="font-variant:small-caps;">Portfolio</h1>
						<hr>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<table data-toggle="table"  data-pagination="true" data-side-pagination="client" data-page-list="[5, 10, 20, 50, 100, 200]" data-search="true" >
							<thead>
								<tr>
									<!--<th data-field="state" data-checkbox="true"></th>-->
									<th data-field="company_name" data-align="center" data-sortable="true">Company</th>
									<th data-field="market" data-sortable="true" data-align="center">Market</th>
									<th data-field="last_trade_price" data-sortable="true" data-align="center">Last Trade Price</th>
									<!--  th data-field="action" data-sortable="true" data-align="center">Action</th> -->
								</tr>
							</thead>
							<tbody>
							
							<c:forEach items="${data}" var="port" >
								<tr>
									
									<td data-field="company_name" data-align="left"><c:out value="${port.getStockData().getCompanyData().getCompanyName() }"></c:out></td>
									<td data-field="market" data-align="justify"><c:out value="${port.getStockData().getMarket() }"></c:out></td>
									<td data-field="last_trade_price" data-align="justify"><c:out value="${port.getStockData().getLastTradePrice() }"></c:out></td>
									<!--  td data-field="current_value" data-align="justify">
										<a href="deleteport.html?id=${port.getStockData().getStockId() }" style="color:#000;" title="Delete Stock"><i class="material-icons">delete_forever</i></a>
									</td -->
								</tr>
							</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
			
		<!-- main body ends -->
		
<jsp:include page="footer.jsp" /> 