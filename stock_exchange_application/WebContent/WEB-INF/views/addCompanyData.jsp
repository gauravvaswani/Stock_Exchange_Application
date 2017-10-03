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
<style>
#overlay {
    position: fixed; /* Sit on top of the page content */
    display: none; /* Hidden by default */
    width: 100%; /* Full width (cover the whole page) */
    height: 100%; /* Full height (cover the whole page) */
    top: 0; 
    left: 0;
    right: 0;
    bottom: 0;
    background-color: rgba(0,0,0,0.5); /* Black background with opacity */
    z-index: 2; /* Specify a stack order in case you're using a different order for other elements */
    cursor: pointer; /* Add a pointer on hover */
}
#text{
    position: absolute;
    top: 50%;
    left: 50%;
    font-size: 50px;
    color: white;
    transform: translate(-50%,-50%);
    -ms-transform: translate(-50%,-50%);
}
</style>
<script>
function on() {
    document.getElementById("overlay").style.display = "block";
}
</script>
</head>
	<!-- body begins -->
	<body>
		<!-- header begins -->
		<jsp:include page="header.jsp" />
		<!-- header ends -->
		<div id="overlay">
			<div id="text">Uploading. . . </div>
		</div>
		<!--<div class="col-md-12" style="background-color:#E8E8E8;">-->
		
		<div class="col-md-12 body-wrap">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<h1 style="font-variant:small-caps;">Add Company</h1>
						<hr>
					</div>
				</div>
				<div class="row">
					<br/>
				</div>
				
				<div class="row">
					<div class="col-sm-6">
						<h3 style="font-variant:small-caps;">Upload File</h3>
						<form id="uploadCompanyForm" action="uploadcompanydata.html" method="post" enctype = "multipart/form-data">
							<div class="col-sm-8">
								<label for="uploadCompanyData"></label>
								<input type="file" name="filedata" class="form-control-file form-control-md" id="uploadCompanyData" aria-describedby="fileHelp" style="font-size:14px;">
								<small id="fileHelp" class="form-text text-muted">Upload file in .csv format</small>
							</div>
							<br/>
							<div class="col-sm-7 float-sm-right">
								<div class="input-group mb-2 mb-sm-0">
									<button type="submit" onclick="on()" class="btn btn-default btn-md text-md-right" id="uploadCompanyData" name="uploadCompanyData" value="Upload" style="border-radius:0px; box-shadow:1px 2px 2px 1px #ccc;">Upload</button>
								
								</div>
							</div>
						</form>
					</div>
					<div class="col-sm-6" style="border-left:1px dashed #000;">
						<h3 style="font-variant:small-caps;">Company Information</h3><br/>
						<form id="addCompany" action="getcompanydata.html" method="post">
							<div class="form-group">
								<label for="addCompanyCode"><strong>Company Code</strong></label>
								<input type="text" class="form-control col-md-6" id="addCompanyCode" name="addCompanyCode" placeholder="Enter Company Code" style="font-size:14px;">
							</div>
							<div class="form-group">
								<label for="addCompanySymbol"><strong>Company Symbol</strong></label>
								<input type="text" class="form-control col-md-6" id="addCompanySymbol" name="addCompanySymbol"  placeholder="Enter Company Symbol" style="font-size:14px;">
							</div>
							<div class="form-group">
								<label for="addCompanyName"><strong>Company Name</strong></label>
								<input type="text" class="form-control col-md-6" id="addCompanyName" name="addCompanyName" placeholder="Enter Company Name" style="font-size:14px;">
							</div>
							<div class="form-group">
								<label for="addCompanyISIN"><strong>ISIN</strong></label>
								<input type="text" class="form-control col-md-6" id="addCompanyISIN" name="addCompanyISIN" placeholder="Enter Company ISIN" style="font-size:14px;">
							</div>
							<div class="form-group">
								<label for="addCompanyQuantity"><strong>Company Quantity</strong></label>
								<input type="number" min="1" class="form-control col-md-6" id="addCompanyQuantity" name="addCompanyQuantity" placeholder="Enter Company Quantity" style="font-size:14px;">
							</div>
							<div class="form-group">
								<label for="addCompanyIndustry"><strong>Industry Sector</strong></label>
								<input type="text" class="form-control col-md-6" id="addCompanyIndustry" name="addCompanyIndustry" placeholder="Enter Company Industry Sector" style="font-size:14px;">
							</div>
							
							<div class="col-sm-7 float-sm-right">
								<div class="input-group mb-2 mb-sm-0">
									<button type="submit" class="btn btn-default btn-md text-md-right" id="addCompanyInfo" name="addCompanyInfo" value="Add Company Information" style="border-radius:0px; box-shadow:1px 2px 2px 1px #ccc;">Add</button>
								
								</div>
							</div>
						</form>
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
		
		<script>
			 $(document).ready(function() {
				$('#addCompany').bootstrapValidator({
					message: 'This value is not valid',
					fields: {
					   addCompanyCode: {
							message: 'Company code is not valid',
							validators: {
								notEmpty: {
									message: 'Company Code is required'
								},
								
								stringLength: {
									min:7,
									max:7,
									message:' Maximum 7 Characters. '
								},
								regexp:{
									regexp: /^[0-9]*$/,
									message: 'Numbers only'
									}
							}
							},
							addCompanySymbol: {
							message: 'Company Symbol is invalid',
							validators: {
								notEmpty: {
									message: 'The company symbol is required'
								},
								stringLength: {
										min: 3,
										message:' Minimum 3 Characters. '
								}
								
							}
						},
						addCompanyName: {
							validators: {
								notEmpty: {
									message: 'Company Name is required'
								},
								stringLength: {
										min:3,
										message: 'Minimum 3 Characters'
									}
							}
						},
						addCompanyISIN: {
							validators: {
								notEmpty: {
                                message: 'ISIN is required'
								},
								stringLength: {
									max: 12,
									message: ' Invalid ISIN'
								}
							}
						},
						addCompanyQuantity:{
							validators: {
								notEmpty: {
									message: 'Quantity is requied'
									}
								},
								digits:{
									min:1,
									message: 'Minimum quantity required is 1'
								},
								regexp:{
									regexp:/^([1-9]{1,9999999})*$/,
									message: 'Minimum 1 quantity required'
									}
							},
						addCompanyIndustry:{
							validators: {
								notEmpty: {
									message: 'Company Industry is required'
									},
								stringLength: {
									min: 3,
									message: 'Minimum length is 3'
									}
								}
							}	
					}
					
				});
			});
		</script>
		
	</body>
	<!-- body ends -->
</html>