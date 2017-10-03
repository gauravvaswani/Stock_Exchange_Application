<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta name="description" content="The Big Bus Company - Online Bus Ticketing System">
		<meta name="Diksha Jasuja, Gaurav Vaswani, Gayathri Jayaseelan, Liya Baby, Priyanka Upadhyay, Prashant Birajdar,Rasika Deshpande, Raveena Nagdev, Sanket Solanki,Shivkumar Rathod" content="AtoS India Pvt. Ltd. - Trainee Project - Stock Exchange Application">
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
		
		<!-- Google Fonts for Material IO -->
		<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="StyleSheet">
		
		<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
		<!--<link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">-->
		
		<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
		<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
		<script src="${pageContext.request.contextPath}/resources/js/ie-emulation-modes-warning.js"></script>
		
		<!-- Popper -->
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
			
		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!--[if lt IE 9]>
		  
		<![endif]-->
		<script>

					function redirect()
					{
						
						window.location = "index.html";
					}

		</script>
		<script src="${pageContext.request.contextPath}/resources/js/jquery-3.2.1.min.js" ></script>
	</head>
	<!-- body begins -->
	<body onload="redirect()">
		<!-- header navigation begins -->
		<nav class="navbar navbar-expand-md navbar-light bg-light header-bg">
			<div class="container">
			<a class="navbar-brand" href="#" style="color:#000; font-variant:small-caps; font-weight:600;">Stock Exchange</a>
			<button style="border:0px;" class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarsExample04">
				<form class="col-md-7 my-2 my-md-0 mx-auto px-lg-3 mr-lg-4">
				  <input class="form-control" type="text" placeholder="Quotes, NAV" style="border:0px; background-color:transparent; border-bottom:1px solid #ddd; font-size:14px; padding:5px;">
				</form>
				<ul class="navbar-nav ml-auto" style="text-transform:uppercase; font-size:14px; font-weight:bold">
					<li class="nav-item active">
						<a class="nav-link py-0" href="#"><i class="fa fa-line-chart d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;</span> Market <span class="sr-only">(current)</span></a>
					</li>
					<li class="nav-item d-none d-lg-block">|</li>
					<!--<li class="nav-item dropdown">
						<a class="nav-link py-0 dropdown-toggle" href="#" id="navbarCompanyLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-university d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;</span> Company</a>
						<div class="dropdown-menu mt-md-3 " aria-labelledby="navbarCompanyLink" style="border-radius:0px; border:0px; background-color:#f8f9fa; text-transform:uppercase; font-size:14px; font-weight:bold; border-top:3px solid #888;">
							<a class="dropdown-item py-0" href="#" style="font-weight:bold; color:#696969"><i class="fa fa-plus-circle d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span> Add Company</a>
						</div>
					</li>
					<li class="nav-item d-none d-lg-block">|</li>
					<li class="nav-item">
						<a class="nav-link py-0" href="#"><i class="fa fa-bullseye d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span> Stocks</a>
					</li>
					<li class="nav-item d-none d-lg-block">|</li>
					<li class="nav-item">
						<a class="nav-link py-0" href="#"><i class="fa fa-folder-open d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span> Portfolio</a>
					</li>
					<li class="nav-item d-none d-lg-block">|</li>
					<li class="nav-item">
						<a class="nav-link py-0" href="#"><i class="fa fa-th-list d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span> Watchlist</a>
					</li>
					<li class="nav-item d-none d-lg-block">|</li>
					<li class="nav-item">
						<a class="nav-link py-0" href="#"><i class="fa fa-file-excel-o d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span> Files</a>
					</li>
					<li class="nav-item d-none d-lg-block">|</li>
					<li class="nav-item">
						<a class="nav-link py-0" href="#"><i class="fa fa-users d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;</span> Users</a>
					</li>
					<li class="nav-item d-none d-lg-block">|</li>-->
					<li class="nav-item">
						<a class="nav-link py-0" href="#"><i class="fa fa-sign-in d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span> Login</a>
					</li>
					<!--<li class="nav-item d-none d-lg-block">|</li>
					<li class="nav-item dropdown">
						<a class="nav-link py-0 dropdown-toggle" href="#" id="userProfileLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-user-circle-o d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;</span> Rahul T.</a>
						<div class="dropdown-menu dropdown-menu-right mt-md-3 " aria-labelledby="userProfileLink" style="border-radius:0px; border:0px; background-color:#f8f9fa; text-transform:uppercase; font-size:14px; font-weight:bold; border-top:3px solid #888;">
							<a class="dropdown-item py-0" href="#" style="font-weight:bold; color:#696969"><i class="fa fa-pencil-square-o d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span> Edit Profile</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item py-0" href="#" style="font-weight:bold; color:#696969"><i class="fa fa-key d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span> Change Password</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item py-0" href="#" style="font-weight:bold; color:#696969"><i class="fa fa-download d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span> Download Log File</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item py-0" href="#" style="font-weight:bold; color:#696969"><i class="fa fa-eye d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span> View as User</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item py-0" href="#" style="font-weight:bold; color:#696969"><i class="fa fa-sign-out d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span> Logout</a>
						</div>
					</li>-->
				</ul>
			</div>
			</div>
		</nav>
		<!-- header navigation ends -->
		
		<!-- main body begins -->
		<div class="col-md-12 body-wrap">
			<div class="container">
				<div class="row">  	
					<div class="col-md-12">
						<h2 style="font-variant:small-caps;"> Market Snapshot</h2></td>
						<p style="font-size:14px; text-align:justify" class="d-none d-lg-block">The one-stop destination for a comprehensive insight into the equity markets. Live stock prices, along with gainers and losers, and more to help you make informed decisions.</p>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<ul class="list-inline" style="font-size:14px; border-bottom:1px solid #ccc; text-transform:uppercase;">
							<!--<li class="list-inline-item in-nav-list"><a class="nav-link sub-menu in-nav" href="#nbse-market" >Market</a></li>
							<li class="list-inline-item">|</li>-->
							<li class="list-inline-item in-nav-list"><a class="nav-link sub-menu in-nav" href="#nse-gainers" >Top Gainers</a></li>
							<li class="list-inline-item">|</li>
							<li class="list-inline-item in-nav-list"><a class="nav-link sub-menu in-nav" href="#nse-losers" >Top Losers</a></li>
						</ul>
					</div>
				</div>
				
				<!--<div class="row" id="nbse-market">
					<div class="col-md-6">
						<span class="d-none d-lg-block" style="font-size:60px; font-weight:bold;">9,788.60</span><span class="d-lg-none d-sm-block" style="font-size:52px; font-weight:bold;">9,788.60</span>
						<p><span class="d-lg-inline d-sm-inline" style="font-size:18px; font-weight:bold;">BSE</span> &nbsp;Change 19.65 (0.20%)</p>
						
						<table rol="table" class="table table-responsive table-bordered">
							<tbody style="border-left:1px solid #eee; border-right:1px solid #eee;">
								<tr style="border-bottom:1px solid #ccc;">
									<td>
										<span style="font-size:12px;">OPENING VALUE</span>
										<br/><strong>898.00</strong>
									</td>
									<td>
										<span style="font-size:12px;">CLOSING VALUE</span>
										<br/><strong>896.00</strong>
									</td>
									<td>
										<span style="font-size:12px;">HIGH. PRICE</span>
										<br/><strong>902.40</strong>
									</td>
									<td>
										<span style="font-size:12px;">LOW. PRICE</span>
										<br/><strong>895.00</strong>
									</td>
								</tr>
							</tbody>
						</table>
					</div>
					
					<div class="col-sm-6" id="left1" style="border-left:1px dashed #000">
						<span class="d-none d-lg-block" style="font-size:60px; font-weight:bold;">9,788.60</span><span class="d-lg-none d-sm-block" style="font-size:52px; font-weight:bold;">9,788.60</span>
						<p><span class="d-lg-inline d-sm-inline" style="font-size:18px; font-weight:bold;">NSE</span> &nbsp;Change 19.65 (0.20%)</p>
						
						<table rol="table" class="table table-responsive table-bordered">
							<tbody style="border-left:1px solid #eee; border-right:1px solid #eee;">
								<tr style="border-bottom:1px solid #ccc;">
									<td>
										<span style="font-size:12px;">OPENING VALUE</span>
										<br/><strong>898.00</strong>
									</td>
									<td>
										<span style="font-size:12px;">CLOSING VALUE</span>
										<br/><strong>896.00</strong>
									</td>
									<td>
										<span style="font-size:12px;">HIGH. PRICE</span>
										<br/><strong>902.40</strong>
									</td>
									<td>
										<span style="font-size:12px;">LOW. PRICE</span>
										<br/><strong>895.00</strong>
									</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<hr>-->
				<h3 style="font-size:24; font-variant:small-caps; font-weight:600">Top Gainers <i class="fa fa-caret-up bg-succes" aria-hidden="true" style="color:green;"></i></h3>
				<div class="row" id="nse-gainers">
					<div class="col-sm-6">
						<table class="table table-responsive table-striped table-bordered bg-success text-white">
							<thead>
								<tr>
									<th style="text-align:center;">Sr. No.</th>
									<th style="text-align:center;">Company</th>
									<th style="text-align:center;">Last Trade Price</th>
									<th style="text-align:center;">Change %</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td style="text-align:center">1.</td>
									<td>INFY</td>
									<td style="text-align:center;">898.75</td>
									<td style="text-align:center;">+0.34%</td>
								</tr>
							</tbody>
						</table>
					</div>
					
					<div class="col-sm-6" id="left1" style="border-left:1px dashed #000">
						<table class="table table-responsive table-striped table-bordered bg-success text-white">
							<thead>
								<tr>
									<th style="text-align:center;">Sr. No.</th>
									<th style="text-align:center;">Company</th>
									<th style="text-align:center;">Last Trade Price</th>
									<th style="text-align:center;">Change %</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td style="text-align:center">1.</td>
									<td>INFY</td>
									<td style="text-align:center;">898.75</td>
									<td style="text-align:center;">+0.34%</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<hr>
				<h3 style="font-size:24; font-variant:small-caps; font-weight:600">Top Losers <i class="fa fa-caret-down" aria-hidden="true" style="color:red;"></i></h3>
				<div class="row" id="nse-losers">
					<div class="col-sm-6">
						<table class="table table-responsive table-striped table-bordered bg-danger text-white">
							<thead>
								<tr>
									<th style="text-align:center;">Sr. No.</th>
									<th style="text-align:center;">Company</th>
									<th style="text-align:center;">Last Trade Price</th>
									<th style="text-align:center;">Change %</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td style="text-align:center">1.</td>
									<td>INFY</td>
									<td style="text-align:center;">898.75</td>
									<td style="text-align:center;">+0.34%</td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="col-sm-6" id="left1" style="border-left:1px dashed #000">
						<table class="table table-responsive table-striped table-bordered bg-danger text-white">
							<thead>
								<tr>
									<th style="text-align:center;">Sr. No.</th>
									<th style="text-align:center;">Company</th>
									<th style="text-align:center;">Last Trade Price</th>
									<th style="text-align:center;">Change %</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td style="text-align:center">1.</td>
									<td>INFY</td>
									<td style="text-align:center;">898.75</td>
									<td style="text-align:center;">+0.34%</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
		<script>
			$(document).ready(function(){
			  // Add smooth scrolling to all links
			  $(".sub-menu").on('click', function(event) {

				// Make sure this.hash has a value before overriding default behavior
				if (this.hash !== "") {
				  // Prevent default anchor click behavior
				  event.preventDefault();

				  // Store hash
				  var hash = this.hash;

				  // Using jQuery's animate() method to add smooth page scroll
				  // The optional number (800) specifies the number of milliseconds it takes to scroll to the specified area
				  $('html, body').animate({
					scrollTop: $(hash).offset().top
				  }, 800, function(){
			   
					// Add hash (#) to URL when done scrolling (default click behavior)
					window.location.hash = hash;
				  });
				} // End if
			  });
			});
		</script>
		<!-- sub-footer begins -->	
		<div class="col-md-12 d-none d-lg-block" style="background-color:#808080; color:#ccc; height:175px;">
			<div class="container">
				<div class="row">
					<div class="col-sm-3 foot-list">
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
					<div class="col-sm-3 foot-list">
						<span style="font-weight:bold; font-size:13px; color:#eee">NSE</span>
						<ul class="foot-listing">
							<li></li>
						</ul>
						<br/>
						<span style="font-weight:bold; font-size:13px; color:#eee">BSE</span>
						<ul class="foot-listing">
							<li></li>
							
						</ul>
					</div>
					<div class="col-sm-3 foot-list">
						<span style="color:#fff;"><strong>Need Help? Toll Free Number<br/><i class="fa fa-phone" aria-hidden="true"></i> 1800-200-4456</strong></span>
						<ul class="foot-listing-social hidden-md-down">
							<li style="display:inline; padding-right:20px"><a class="foot-listing-social-link" href="https://www.facebook.com" target="_blank"><i class="fa fa-facebook" aria-hidden="true"></i></a>
							
							</li>
							<li style="display:inline;"><a class="foot-listing-social-link" href="https://www.twitter.com" target="_blank"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
							
						</ul>
					</div>
				</div>
			</div>
		</div>
		<!-- sub-footer ends -->
		
		<!-- footer begins -->
		<footer>
			<div class="col-md-12 footer-bg">
				<div class="container-fluid footer-content">
					<span class="float-md-left footer-copyright">&copy; <script>document.write(new Date().getFullYear())</script> The Stock Exchange Application. All Rights Reserved.</span>
					<span class="float-sm-right footer-menu d-none d-lg-block"><a href="#" class="foot-link ">Privacy Policy</a> | <a class="foot-link" href="#">Terms & Conditions</a></span>
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
		<script src="${pageContext.request.contextPath}/resources/js/bootstrapValidator.js"></script>
		
		<!-- Bootstrap Table JavaScript -->
		<script src="${pageContext.request.contextPath}/resources/js/bootstrap-table.js"></script>
    	
		<!-- Bootstrap core JavaScript -->
		<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
		
		<!-- Date Picker -->
		<script src="${pageContext.request.contextPath}/resources/js/bootstrap-datepicker/bootstrap-datepicker.js"></script>
	
		<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
		
		<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
		<script src="${pageContext.request.contextPath}/resources/js/ie10-viewport-bug-workaround.js"></script>
		
		<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
		<script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script>
		<script src='http://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/js/bootstrapvalidator.min.js'></script>
 	</body>
	<!-- body ends -->
</html>