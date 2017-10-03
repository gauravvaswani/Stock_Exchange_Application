<!DOCTYPE html>
<html lang="en" ng-app="app">
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>

<script>
  
  var app = angular.module('app', []);
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
app.controller('homeCtrl', function($scope) {

});
  </script>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Stock Exchange">
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
	<header>
		<div class="col-md-12 header-bg" style="z-index: 16;">
			<div class="container header-brand">
				<nav class="navbar navbar-toggleable-md fixed-top"
					style="background-color: #eee !important; color: #000 !important;">
					<button class="navbar-toggler navbar-toggler-right" type="button"
						data-toggle="collapse" data-target="#navbarCollapse"
						aria-controls="navbarCollapse" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>
					<a class="navbar-brand" href="#"
						style="color: #000; font-variant: small-caps; font-weight: 600;">The
						Stock Exchange Application</a>
					<div class="collapse navbar-collapse" id="navbarCollapse">
						<ul class="navbar-nav" style="margin-left: auto; font-size: 24px;">
							<li class="nav-item active">
								<!--<a class="nav-link" href="login.html" style="color:#000;" title="Login / Sign Up"><i class="material-icons" style="font-size:36px;">person_pin</i><span class="hidden-md-up" style="font-size:16px;">&nbsp;Login / Sign Up</span> <span class="sr-only">(current)</span></a>-->
							</li>

						</ul>
					</div>
				</nav>
			</div>
		</div>
	</header>
	<!-- header ends -->

	<!--<div class="col-md-12" style="background-color:#E8E8E8;">-->

	<div class="col-md-12 body-wrap">
		<div class="container">
			<div class="row">
				<div class="col-sm-6">
					<h3 style="font-variant: small-caps;">Reset Password</h3>
					<h4>${err}</h4>
					<form name="myForm" action="repassword.html" method="post">
						<br />
						<input type="hidden" value="${username}" name="username">

						<div class="col-sm-8">
							<label class="sr-only mr-sm-2" for="customerPwd">Password</label>
							<div class="input-group mb-5 mb-sm-0">
								<div class="input-group-addon form-control-sm">
									<i class="material-icons">vpn_key</i>
								</div>
								
								<input type="password" class="form-control form-control-sm"
									id="customerPwd" name="password" placeholder="Password"
									maxlength="20" name="password" ng-model="formData.password"
									required size="65" ng-maxlength="20" ng-minlength="8"
									ng-pattern="/(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z])(?=.*[!@#$%^&*])/"
									autofocus> <br>
							</div>

						</div>
						<span
							ng-show="myForm.password.$touched && myForm.password.$invalid">
							<font color="red"> &nbsp&nbsp*required.</font>
						</span>
						<p ng-show="myForm.password.$error.minlength" class="error">
							&nbsp&nbsp Passwords must be between 8 and 20 characters.</p>

						<p ng-show="myForm.password.$error.pattern" class="error">
							&nbsp&nbsp Must contain one lower &amp; uppercase letter, and one
							non-alpha character &nbsp&nbsp(a number or a symbol.)</p>

						<br />
						<div class="col-sm-8">
							<label class="sr-only mr-sm-2" for="customerConfirmPwd">Confirm
								Password</label>
							<div class="input-group mb-5 mb-sm-0">
								<div class="input-group-addon form-control-sm">
									<i class="material-icons">vpn_key</i>
								</div>
								<input type="password" maxlength="15"
									ng-model="formData.password_c"
									class="form-control form-control-sm" id="customerConfirmPwd"
									name="password_c" valid-password-c="formData.password" required
									size="65" placeholder="Confirm Password">


							</div>
						</div>
						<p
							ng-show="myForm.password_c.$touched && myForm.password_c.$error.noMatch"
							class="error">
							&nbsp&nbsp Passwords do not match.</span>
						<p
							ng-show="myForm.password_c.$touched && myForm.password_c.$error.required"
							class="error">&nbsp&nbsp please re-enter your password</p>

						<br />
						<div class="col-sm-7 float-sm-right">
							<div class="input-group mb-2 mb-sm-0">
								<button type="submit"
									class="btn btn-default btn-md text-md-right"
									id="signUpFormSubmit" name="signUpFormSubmit" value="Sign Up"
									style="border-radius: 0px; box-shadow: 1px 2px 2px 1px #ccc;">Submit</button>

							</div>
						</div>
					</form>
				</div>
			</div>

		</div>
	</div>

	<div class="col-md-12"
		style="background-color: #808080; color: #ccc; height: 175px;">
		<div class="container-fluid">
			<div class="row">
				<div class="col-sm-3 foot-list hidden-xs-down">
					<span style="font-weight: bold; font-size: 14px; color: #eee;">Top
						Gainers</span>
					<ul class="foot-listing">
						<li></li>

					</ul>
				</div>
				<div class="col-sm-3 foot-list hidden-xs-down">
					<span style="font-weight: bold; font-size: 13px; color: #eee">Top
						Losers</span>
					<ul class="foot-listing">
						<li></li>

					</ul>
				</div>
				<div class="col-sm-3 foot-list hidden-xs-down">
					<span style="font-weight: bold; font-size: 13px; color: #eee"></span>
					<ul class="foot-listing">
						<li></li>

					</ul>
				</div>
				<div class="col-sm-3 foot-list">
					<span style="color: #fff;"><strong>Need Help? Toll
							Free Number<br />
						<i class="fa fa-phone" aria-hidden="true"></i> 1800-200-4456
					</strong></span>
					<ul class="foot-listing-social">
						<li style="display: inline; padding-right: 20px"><a
							class="foot-listing-social-link" href="https://www.facebook.com"
							target="_blank"><i class="fa fa-facebook" aria-hidden="true"></i></a>

						</li>
						<li style="display: inline;"><a
							class="foot-listing-social-link" href="https://www.twitter.com"
							target="_blank"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>

					</ul>
				</div>
			</div>
		</div>
	</div>

	<!-- footer begins -->
	<footer>
		<div class="col-md-12 footer-bg">
			<div class="container-fluid footer-content">
				<span class="float-md-left footer-copyright">&copy; <script>document.write(new Date().getFullYear())</script>
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
	<script src="js/bootstrapValidator.js"></script>

	<!-- Bootstrap Table JavaScript -->
	<script src="js/bootstrap-table.js"></script>

	<!-- Bootstrap core JavaScript -->
	<script src="js/bootstrap.js"></script>

	<!-- Date Picker -->
	<script src="js/bootstrap-datepicker/bootstrap-datepicker.js"></script>

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
	<script src="js/ie10-viewport-bug-workaround.js"></script>

	<script
		src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	<script
		src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script>
	<script
		src='http://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/js/bootstrapvalidator.min.js'></script>






</body>
<!-- body ends -->
</html>