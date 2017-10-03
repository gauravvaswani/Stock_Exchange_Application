<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html lang="en" ng-app="app">
	<head>
	 <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>

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
		<!--  <script src="${pageContext.request.contextPath}/resources/js/bootstrap-table.js"></script>-->
    	
		
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
	<!-- header begins -->
	<jsp:include page="header.jsp" /> 

		<div class="col-md-12 body-wrap">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<h1 style="font-variant:small-caps;">${data.get(0).getCompanyName() }</h1>
						<hr>
					</div>
				</div>
				<div class="row">
					<div class="col-md-8">
						<ul class="list-inline" style="font-size:12px;">
							<li class="list-inline-item">BSE: ${data.get(0).getCompanyCode() }</li>
							<li class="list-inline-item">|</li>
							<li class="list-inline-item">NSE: ${data.get(0).getCompanySymbol() }</li>
							<li class="list-inline-item">|</li>
							<li class="list-inline-item">ISIN: ${data.get(0).getIsin() }</li>
							<li class="list-inline-item">|</li>
							<li class="list-inline-item" style="text-transform:uppercase;">INDUSTRY SECTOR: ${data.get(0).getIndustrySector()}</li>
							<li class="list-inline-item">|</li>
						</ul>
					</div>
					
					<br/>
					<br/>
					<br/>
				</div>
				<div class="row">
					<div class="col-md-6">
						<table rol="table" class="table table-responsive">
							<tbody style="border-left:1px solid #eee; border-right:1px solid #eee;">
								<tr>
									<td><span style="font-weight:bold; font-size:24px;">${data.get(1).get(0).getOpeningStockValue() }</span> <span style="font-size:12px"><strong>BSE</strong></span></td>
									<td class="align-bottom"><span style="font-size:12px;"><b> <c:if test="${ data.get(1).get(1).getChangePercentage() > 0 }">+</c:if>${data.get(1).get(0).getChangePercentage() }</b></span></td>
									<td class="align-bottom"><span style="font-size:12px;">VOLUME: <strong>${data.get(1).get(0).getVolume() }</strong></span></td>
									<td class="align-bottom">&nbsp;</td>
								</tr>
								<tr style="border-bottom:1px solid #ccc;">
									<td>
										<span style="font-size:12px;">OPENING VALUE</span>
										<br/><strong>${data.get(1).get(0).getOpeningStockValue() }</strong>
									</td>
									<td>
										<span style="font-size:12px;">CLOSING VALUE</span>
										<br/><strong>${data.get(1).get(0).getClosingStockValue() }</strong>
									</td>
									<td>
										<span style="font-size:12px;">HIGH. PRICE</span>
										<br/><strong>${data.get(1).get(0).getHighestStockValue() }</strong>
									</td>
									<td>
										<span style="font-size:12px;">LOW. PRICE</span>
										<br/><strong>${data.get(1).get(0).getLowestStockValue() }</strong>
									</td>
								</tr>
							</tbody>
						</table>
						
						<ul class="list-inline float-md-right" style="font-size:12px;">
							<li class="list-inline-item"><a href="addportfolio.html?id=${data.get(1).get(0).getStockId()}" class="add-to">ADD TO PORTFOLIO</a></li>
							<li class="list-inline-item"><a href="addwatchlist.html?id=${data.get(1).get(0).getStockId()}" class="add-to">ADD TO WATCHLIST</a></li>
						</ul>
						
						
						
					
					</div>
					
					<div class="col-md-6">
						<table rol="table" class="table table-responsive">
							<tbody style="border-left:1px solid #eee; border-right:1px solid #eee;">
								<tr>
									<td><span style="font-weight:bold; font-size:24px;">${data.get(1).get(1).getOpeningStockValue() }</span> <span style="font-size:12px"><strong>NSE</strong></span></td>
									<td class="align-bottom"><span style="font-size:12px;" ><b> <c:if test="${ data.get(1).get(1).getChangePercentage() > 0 }">+</c:if> ${data.get(1).get(1).getChangePercentage() }</b></span></td>
									<td class="align-bottom"><span style="font-size:12px;">VOLUME: <strong>${data.get(1).get(1).getVolume() }</strong></span></td>
									<td class="align-bottom">&nbsp;</td>
								</tr>
								<tr style="border-bottom:1px solid #ccc;">
									<td>
										<span style="font-size:12px;">OPENING VALUE</span>
										<br/><strong>${data.get(1).get(1).getOpeningStockValue() }</strong>
									</td>
									<td>
										<span style="font-size:12px;">CLOSING VALUE</span>
										<br/><strong>${data.get(1).get(1).getClosingStockValue() }</strong>
									</td>
									<td>
										<span style="font-size:12px;">HIGH. PRICE</span>
										<br/><strong>${data.get(1).get(1).getHighestStockValue() }</strong>
									</td>
									<td>
										<span style="font-size:12px;">LOW. PRICE</span>
										<br/><strong>${data.get(1).get(1).getLowestStockValue() }</strong>
									</td>
								</tr>
							</tbody>
						</table>
						<ul class="list-inline float-md-right" style="font-size:12px;">
							<li class="list-inline-item"><a href="addportfolio.html?id=${data.get(1).get(1).getStockId()}" class="add-to">ADD TO PORTFOLIO</a></li>
							<li class="list-inline-item"><a href="addwatchlist.html?id=${data.get(1).get(1).getStockId()}" class="add-to">ADD TO WATCHLIST</a></li>
						</ul>
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
				<span class="float-md-left footer-copyright">&copy; <script>
					document.write(new Date().getFullYear())
				</script>
					The Stock Exchange Application. All Rights Reserved.
				</span> <span class="float-sm-right hidden-xs-down footer-menu"><a
					href="#" class="foot-link">Privacy Policy</a> | <a
					class="foot-link" href="#">Terms & Conditions</a></span>
			</div>
		</div>
	</footer>
	<!-- footer ends -->

	<!-- Placed at the end of the document so the pages load faster -->
	<!-- jQuery library -->


	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<!--<script>window.jQuery || document.write('<script src="js/jquery.min.js"><\/script>')</script>-->

	<!-- Bootstrap Validator JavaScript -->
	<script src="${pageContext.request.contextPath}/resources/js/bootstrapValidator.js"></script>

	<!-- Bootstrap Table JavaScript -->
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap-table.js"></script>

	<!-- Bootstrap core JavaScript -->
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>

	<!-- Date Picker -->
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap-datepicker/bootstrap-datepicker.js"></script>

	<!-- Popper -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"
		integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
		crossorigin="anonymous"></script>

	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js"
		integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb"
		crossorigin="anonymous"></script>

	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="${pageContext.request.contextPath}/resources/js/ie10-viewport-bug-workaround.js"></script>

	<script
		src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	<script
		src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script>
	<script
		src='http://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/js/bootstrapvalidator.min.js'></script>




	<script>
		$(document)
				.ready(
						function() {
							$('#signInForm')
									.bootstrapValidator(
											{
												message : 'This value is not valid',
												feedbackIcons : {
													valid : 'glyphicon glyphicon-ok',
													invalid : 'glyphicon glyphicon-remove',
													validating : 'glyphicon glyphicon-refresh'
												},
												fields : {
													customerName : {
														message : 'Username is not valid',
														validators : {
															notEmpty : {
																message : 'Username address is required'
															},
															emailAddress : {
																message : 'Username is not valid'
															}
														}
													},
													customerPwd : {
														message : 'Password must be minimum 6 Characters',
														validators : {
															notEmpty : {
																message : 'The password is required'
															},
															regexp : {
																regexp : /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[$@!%?&]).{6,12}$/,
																message : 'The password should contain at least 1 Uppercase Alphabet. '
															},
															stringLength : {
																min : 6,
																max : 12,
																message : 'Minimum 6 Characters and Maximum 12 Characters'
															}

														}
													},
												}

											});
						});
	</script>

	<script>
		$(document)
				.ready(
						function() {
							$('#signUpForm')
									.bootstrapValidator(
											{
												message : 'This value is not valid',
												feedbackIcons : {
													valid : 'glyphicon glyphicon-ok',
													invalid : 'glyphicon glyphicon-remove',
													validating : 'glyphicon glyphicon-refresh'
												},
												fields : {
													customerEmail : {
														message : 'Email is not valid',
														validators : {
															notEmpty : {
																message : 'Email is required'
															},
															emailAddress : {
																message : 'Email is not valid'
															}
														}
													},
													customerPwd : {
														message : 'Password must be minimum 6 Characters',
														validators : {
															notEmpty : {
																message : 'The password is required'
															},
															regexp : {
																regexp : /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[$@!%?&]).{6,12}$/,
																message : 'The password should contain at least 1 Uppercase Alphabet & should be 6 to 12 Characters Long'
															},
															stringLength : {
																min : 6,
																max : 12,
																message : 'Minimum 6 Characters. '
															}

														}
													},
													customerConfirmPwd : {
														message : 'Password must be minimum 8 Characters',
														validators : {
															notEmpty : {
																message : 'The password is required'
															},
															identical : {
																field : 'customerPwd',
																message : 'The password and its confirm are not the same'
															}
														}
													},
													customerMobile : {
														validators : {
															notEmpty : {
																message : 'Enter Your Mobile number'
															},
															digits : {
																max : 10,
																message : ' Not a Valid Mobile Number'
															}
														}
													},
												}

											});
						});
	</script>

</body>
<!-- body ends -->
</html>