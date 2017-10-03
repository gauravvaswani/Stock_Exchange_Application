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
.add-comp{
	color:#000;
}

.add-comp:hover{
	color:#000;
	text-decoration:none;
}
</style>
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
						<h1 style="font-variant:small-caps;">Companies
						</a><button	class="btn btn-default btn-md text-md-right pull-right" 
									style="border-radius:0px; box-shadow:1px 2px 2px 1px #ccc;"><a class="add-comp" href="companydata.html">ADD NEW</a></button>
						</h1>
						<hr>
						
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<table class="table table-responsive table-striped" data-toggle="table"  data-pagination="true" data-side-pagination="client" data-page-list="[5, 10, 20, 50, 100, 200]" data-search="true" >
							<thead>
								<tr>
									<!--<th data-field="state" data-checkbox="true"></th>-->
									<th data-field="company_code" data-align="center" data-sortable="true">Company Code</th>
									<th data-field="company_symbol" data-sortable="true" data-align="center">Symbol</th>
									<th data-field="company_name" data-sortable="true" data-align="center">Name</th>
									<th data-field="industry_sector" data-sortable="true" data-align="center">Sector</th>
									<th data-field="isin" data-sortable="true" data-align="center">ISIN</th>
									<th data-field="company_status" data-sortable="true" data-align="center">Status</th>
									<th data-field="action"  data-align="center">Action (De-List)</th>
									<!--  th data-field="action" data-sortable="true" data-align="center">Action</th> -->
								</tr>
							</thead>
							<tbody>
							
							<c:forEach items="${company}" var="comp" >
								<tr>
									
									<!--<th data-field="state" data-checkbox="true"></th>-->
									<td data-field="company_code" data-align="center" data-sortable="true"><c:out value="${comp.getCompanyCode() }"></c:out></td>
									<td data-field="company_symbol" data-sortable="true" data-align="center"><c:out value="${comp.getCompanySymbol() }"></c:out></td>
									<td data-field="company_name" data-sortable="true" data-align="left"><c:out value="${comp.getCompanyName() }"></c:out></td>
									<td data-field="industry_sector" data-sortable="true" data-align="left"><c:out value="${comp.getIndustrySector() }"></c:out></td>
									<td data-field="isin" data-sortable="true" data-align="center"><c:out value="${comp.getIsin() }"></c:out></td>
									<td data-field="company_status" data-sortable="true" data-align="center"><c:out value="${comp.getCompanyStatus() }"></c:out></td>
									<td style="width:10%;"><a href="delist.html?id=${comp.getCompanyCode()}" style="color:#000;"><i class="fa fa-level-down" aria-hidden="true"></i>&nbsp;<span style="text-transform:uppercase; font-weight:bold;">DE-LIST</span></a></td>
									<!--  th data-field="action" data-sortable="true" data-align="center">Action</th> -->
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
		