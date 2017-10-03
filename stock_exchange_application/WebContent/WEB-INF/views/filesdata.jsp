<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html lang="en" ng-app="app">
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>

<script>
	var app = angular.module('app', []);
	app.directive('validPasswordC', function() {
		return {
			require : 'ngModel',
			scope : {

				reference : '=validPasswordC'

			},
			link : function(scope, elm, attrs, ctrl) {
				ctrl.$parsers.unshift(function(viewValue, $scope) {

					var noMatch = viewValue != scope.reference
					ctrl.$setValidity('noMatch', !noMatch);
					return (noMatch) ? noMatch : !noMatch;
				});

				scope.$watch("reference", function(value) {
					;
					ctrl.$setValidity('noMatch', value === ctrl.$viewValue);

				});
			}
		}
	});
	app.controller('homeCtrl', function($scope) {

	});
</script>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Stock">
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
	<div id="overlay">
	<div id="text">Uploading. . . </div></div>
	<div class="col-md-12 body-wrap">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h1 style="font-variant: small-caps;">Files</h1>
					<hr>
				</div>
			</div>
			<div class="row">
				<br />
			</div>
			<div class="row">
				<div class="col-sm-6" style="border-right: 1px dashed #000;">
					<h3 style="font-variant: small-caps;">File List</h3>
					<table class="table table-responsive table-striped table-bordered">
						<thead>
							<tr>
								<th style="text-align:center;">Sr. No.</th>
								<th style="text-align:center;">File Name</th>
								<th style="text-align:center;">Timestamp</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${files}" var="file">
								<tr>
									<td style="text-align:center;"><c:out value="${file.fileId}" /></td>
									<td style="text-align:center;"><c:out value="${file.fileName}" /></td>
									<td style="text-align:center;"><c:out value="${file.fileProcessingDate}" /></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div class="col-sm-6">
					<h3 style="font-variant: small-caps;">Upload File</h3>
					<form id="uploadCompanyForm" action="uploadstock.html"
						method="post" enctype="multipart/form-data">
						<div class="col-sm-8">
							<label for="uploadCompanyData"></label> <input type="file"
								class="form-control-file form-control-md" id="uploadCompanyData"
								name="file" aria-describedby="fileHelp" style="font-size: 14px;">
							<small id="fileHelp" class="form-text text-muted">Upload
								stock file</small>
						</div>
						<br />
						<div class="col-sm-7 float-sm-right">
							<div class="input-group mb-2 mb-sm-0">
								<button type="submit" onclick="on()"
									class="btn btn-default btn-md text-md-right"
									id="uploadCompanyData" name="uploadCompanyData" value="Upload"
									style="border-radius: 0px; box-shadow: 1px 2px 2px 1px #ccc;">Upload</button>

							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<jsp:include page="footer.jsp" />