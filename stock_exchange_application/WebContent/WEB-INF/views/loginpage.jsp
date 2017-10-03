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
<script type="text/javascript">
var app = angular.module('ngpatternApp', []);
app.directive('validPasswordC', function() {
  return {
    require: 'ngModel',
    scope: {

      reference: '=validPasswordC'

    },
    link: function(scope, elm, attrs, ctrl) {
      ctrl.$parsers.unshift(function(viewValue, $scope) {

        var noMatch = viewValue != scope.reference
        ctrl.$setValidity('noMatch', !noMatch);
        return (noMatch)?noMatch:!noMatch;
      });

      scope.$watch("reference", function(value) {;
        ctrl.$setValidity('noMatch', value === ctrl.$viewValue);

      });
    }
  }
});
app.controller('ngpatternCtrl', function ($scope) {
$scope.sendForm = function () {
$scope.msg = "Email Validated";
};
});
</script>

<style>
.fgt-pwd{
	color:#eee;
	font-weight:bold;
}

.fgt-pwd:hover{
	text-decoration:none;
	color:#eee;
	font-weight:bold;
}
</style>
</head>
<!-- body begins -->
<body>
	<jsp:include page="header.jsp" />  
	<!-- header ends -->

	<!--<div class="col-md-12" style="background-color:#E8E8E8;">-->

	<div class="col-md-12 body-wrap">
		<div class="container">
			<div class="row">
				<div class="col-sm-6">
					<h3 style="font-variant: small-caps;">Sign In</h3>
					<form id="loginForm" action="validate.html"
						method="post">
						<h6 class="text-danger"><% if(request.getParameter("message")!=null) { out.println(request.getParameter("message")); }  %></h6>
						<br />
						<div class="col-sm-8">
							<label class="sr-only" for="customerName">E-mail / Username</label>
							<div class="input-group mb-2 mb-sm-0">
								<div class="input-group-addon form-control-sm">
									<i class="material-icons">perm_identity</i>
								</div>
								<input type="email"
									class="form-control form-control-sm" id="customerName"
									name="customerName" placeholder="E-mail / Username" required>
							</div>
						</div>
						<br />
						<div class="col-sm-8">
							<label class="sr-only mr-sm-2" for="customerPwd">Password</label>
							<div class="input-group mb-2 mb-sm-0">
								<div class="input-group-addon form-control-sm">
									<i class="material-icons">vpn_key</i>
								</div>
								<input type="password"
									class="form-control form-control-sm" id="customerPwd"
									name="customerPwd" placeholder="Password" required>
							</div>
						</div>
						<br />
						<div class="col-sm-7 float-sm-right">
							<div class="input-group mb-2 mb-sm-0">
								<button type="submit" name="login"
									class="btn btn-default btn-md text-md-right" value="Sign In"
									style="border-radius:0px; box-shadow:1px 2px 2px 1px #ccc;">Sign In</button>
								
							</div>
						</div>
						<a href="forgotpassword.html" class="fgt-pwd pl-4" style="font-size:14px; color:#444;">Forgot Password</a>
					</form>
				</div>
				<div class="col-sm-6" id="left1" style="border-left: 1px dashed #000;">
					<h3 style="font-variant: small-caps;">Sign Up</h3>
					<h6 class="text-info"><% if(request.getParameter("registerMessage")!=null) { out.println(request.getParameter("registerMessage")); }  %></h6>
					<form id="signUpForm" action="register.html" method="post">
						<br />
						<div class="col-sm-8">
							<label class="sr-only" for="customerEmail">E-mail</label>
							<div class="input-group mb-2 mb-sm-0">
								<div class="input-group-addon form-control-sm">
									<i class="material-icons">email</i>
								</div>
								<input type="text" class="form-control form-control-sm"
									id="customerEmail" name="customerEmail"
									placeholder="E-mail Address">
							</div>
						</div>
						<br />
						<div class="col-sm-8">
							<label class="sr-only mr-sm-2" for="customerPwd">Password</label>
							<div class="input-group mb-2 mb-sm-0">
								<div class="input-group-addon form-control-sm">
									<i class="material-icons">vpn_key</i>
								</div>
								<input type="password" class="form-control form-control-sm"
									id="customerPwd" name="customerPwd" placeholder="Password">
							</div>
						</div>
						<br />
						<div class="col-sm-8">
							<label class="sr-only mr-sm-2" for="customerName">Full Name</label>
							<div class="input-group mb-2 mb-sm-0">
								<div class="input-group-addon form-control-sm">
									<i class="material-icons">perm_identity</i>
								</div>
								<input type="text" class="form-control form-control-sm"
									id="customerName" name="customerName"
									placeholder="Enter Name">
							</div>
						</div>
						<br />
						<div class="col-sm-8">
							<label class="sr-only mr-sm-2" for="customerMObile">Mobile
								Number</label>
							<div class="input-group mb-2 mb-sm-0">
								<div class="input-group-addon form-control-sm">
									<i class="material-icons">phone</i>
								</div>
								<input type="text" class="form-control form-control-sm"
									id="customerMobile" name="customerMobile"
									placeholder="Mobile Number">
							</div>
						</div>
						<br />
						<div class="col-sm-7 float-sm-right">
							<div class="input-group mb-2 mb-sm-0">
								<button type="submit"
									class="btn btn-default btn-md text-md-right"
									id="signUpFormSubmit" name="signup" value="Sign Up"
									style="border-radius: 0px; box-shadow: 1px 2px 2px 1px #ccc;">Sign
									Up</button>

							</div>
						</div>
						</form>
				</div>
			</div>

		</div>
	</div>
	
	
		
		<script>
			 $(document).ready(function() {
				$('#signUpForm').bootstrapValidator({
					message: 'This value is not valid',
					fields: {
					   customerEmail: {
							message: 'Email is not valid',
							validators: {
								notEmpty: {
									message: 'Email is required'
								},
								emailAddress: {
									message: 'Email is not valid'
										},
								stringLength: {
							
									max:50,
									message:' Maximum 50 Characters. '
								}
							}
							},
						customerPwd: {
							message: 'Password must be minimum 6 Characters',
							validators: {
								notEmpty: {
									message: 'The password is required'
								},
								regexp:{
									regexp: /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[$@!%?&]).{6,12}$/,
									message: ' The password should contain at least 1 Uppercase Alphabet & should be 6 to 12 Characters Long'
								},
								stringLength: {
										min: 6,
										max:12,
										message:' Minimum 6 Characters. '
								}
								
							}
						},
						customerName: {
							validators: {
								notEmpty: {
									message: 'Customer Name is required'
								},
								regexp: {
									regexp: /^[a-z\s']+$/i,
									message: 'The full name can consist of alphabetical characters '
								}
							}
						},
						customerMobile: {
							validators: {
								notEmpty: {
                                message: 'Enter Your Mobile number'
								},
								digits:{
									max: 10,
									message: ' Not a Valid Mobile Number'
								}
							}
						},	
					}
					
				});
			});
		</script>
<jsp:include page="footer.jsp" /> 