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
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>

<script src="${pageContext.request.contextPath}/resources/js/jquery-3.2.1.min.js"></script>
	</head>
	<!-- body begins -->
	<body>
		<jsp:include page="header.jsp" />  
		<!-- header ends -->
		
		<!--<div class="col-md-12" style="background-color:#E8E8E8;">-->
		
		<div class="col-md-12 body-wrap">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<h1 style="font-variant:small-caps;">Stocks</h1>
						<hr>
					</div>
				</div>
				<div class="row">
					<br/>
				</div>
				<div class="row">
					<div class="col-md-12">
						<table class="table table-responsive table-striped table-bordered" data-toggle="table"  data-pagination="true" data-side-pagination="client" data-page-list="[5, 10, 20, 50, 100, 200]" data-search="true">
							<thead>
								<tr>
									<!--  <th style="text-align:center;">Sr. No.</th> -->
									<th data-field="company_name" data-sortable="true" style="text-align:center;">Company</th>
									<th data-field="market" data-sortable="true"style="text-align:center;">Market</th>
									<th data-field="highest_stock_value" data-sortable="true" style="text-align:center;">High Value</th>
									<th data-field="lowest_stock_value" data-sortable="true" style="text-align:center;">Low Value</th>
									<th data-field="opening_stock_value" data-sortable="true" style="text-align:center;">Opening Value</th>
									<th data-field="closing_stock_value" data-sortable="true" style="text-align:center;">Closing Value</th>
									<th data-field="last_trade_price" data-sortable="true"style="text-align:center;">Last Trade Price</th>
									<th data-field="volume" data-sortable="true"style="text-align:center;">Volume</th>
									<th data-field="change_percentage" data-sortable="true"style="text-align:center;">Change %</th>
								</tr>
							</thead>
							<tbody>
							<c:forEach items="${msg}" var="stock">
								<tr>
									<!--   <td style="text-align:center">1.</td> -->
									<td style="text-align:center;"><a href="viewstock.html?code=${stock.getCompanyData().getCompanyCode()}"><c:out value="${stock.getCompanyData().getCompanyName()}"/></a></td>
									<td style="text-align:center;"><c:out value="${stock.market}"/></td>
									<td style="text-align:center;"><c:out value="${stock.highestStockValue}"/></td>
									<td style="text-align:center;"><c:out value="${stock.lowestStockValue}"/></td>
									<td style="text-align:center;"><c:out value="${stock.openingStockValue}"/></td>
									<td style="text-align:center;"><c:out value="${stock.closingStockValue}"/></td>
									<td style="text-align:center;"><c:out value="${stock.lastTradePrice}"/></td>
									<td style="text-align:center;"><c:out value="${stock.volume}"/></td>
									<td style="text-align:center;"><c:out value="${stock.changePercentage}"/></td>
								</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
			
		<div class="col-md-12" style="background-color:#808080; color:#ccc; height:175px;">
			<div class="container">
				<div class="row">
					<div class="col-sm-3 foot-list hidden-xs-down">
						<span style="font-weight:bold; font-size:14px; color:#eee;">Top Gainers</span>
						<ul class="foot-listing">
							<li></li>
							
						</ul>
					</div>
					<div class="col-sm-3 foot-list hidden-xs-down">
						<span style="font-weight:bold; font-size:13px; color:#eee">Top Losers</span>
						<ul class="foot-listing">
							<li></li>
							
						</ul>
					</div>
					<div class="col-sm-3 foot-list hidden-xs-down">
						<span style="font-weight:bold; font-size:13px; color:#eee"></span>
						<ul class="foot-listing">
							<li></li>
							
						</ul>
					</div>
					<div class="col-sm-3 foot-list">
						<span style="color:#fff;"><strong>Need Help? Toll Free Number<br/><i class="fa fa-phone" aria-hidden="true"></i> 1800-200-4456</strong></span>
						<ul class="foot-listing-social">
							<li style="display:inline; padding-right:20px"><a class="foot-listing-social-link" href="https://www.facebook.com" target="_blank"><i class="fa fa-facebook" aria-hidden="true"></i></a>
							
							</li>
							<li style="display:inline;"><a class="foot-listing-social-link" href="https://www.twitter.com" target="_blank"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
							
						</ul>
					</div>
				</div>
			</div>
		</div>
		
		<!-- footer begins -->
		<footer>
			<div class="col-md-12 footer-bg">
				<div class="container-fluid footer-content">
					<span class="float-md-left footer-copyright">&copy; <script>document.write(new Date().getFullYear())</script> The Stock Exchange Application. All Rights Reserved.</span>
					<span class="float-sm-right hidden-xs-down footer-menu"><a href="#" class="foot-link">Privacy Policy</a> | <a class="foot-link" href="#">Terms & Conditions</a></span>
				</div>
			</div>
		</footer>
		<!-- footer ends -->
		
		<!-- Placed at the end of the document so the pages load faster -->
		<!-- jQuery library -->
		
		
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>

		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<!--<script>window.jQuery || document.write('<script src="js/jquery.min.js"><\/script>')</script>-->
		
		<!-- Bootstrap Validator JavaScript -->
		<script src="js/bootstrapValidator.js"></script>
		
		<!-- Bootstrap Table JavaScript -->
		<script src="js/bootstrap-table.js"></script>
    	
		<!-- Bootstrap core JavaScript -->
		<script src="js/bootstrap.js"></script>
		
		<!-- Date Picker -->
		<script src="js/bootstrap-datepicker/bootstrap-datepicker.js"></script>
	
		<!-- Popper -->
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
		
		<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
		
		<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
		<script src="js/ie10-viewport-bug-workaround.js"></script>
		
		<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
		<script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script>
		<script src='http://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/js/bootstrapvalidator.min.js'></script>
 	</body>
	<!-- body ends -->
</html>