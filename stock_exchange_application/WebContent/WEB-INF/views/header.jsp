
<%@ page import="com.atos.stock.model.SeUser" %>
<nav class="navbar navbar-expand-md navbar-light bg-light header-bg">
			<div class="container">
			<a class="navbar-brand" href="#" style="color:#000; font-variant:small-caps; font-weight:600;">Stock Exchange</a>
			<button style="border:0px;" class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarsExample04">
			<!--  	<span class=""></span><form class="col-md-7 my-2 my-md-0 mx-auto px-lg-3 mr-lg-4">
				  <input class="form-control" type="text" placeholder="Quotes, NAV" style="border:0px; background-color:transparent; border-bottom:1px solid #ddd; font-size:14px; padding:5px;">
				</form> -->
				<ul class="navbar-nav ml-auto" style="text-transform:uppercase; font-size:14px; font-weight:bold">
					<li class="nav-item active">
						<a class="nav-link py-0" href="index.html"><i class="fa fa-line-chart d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;</span> Market <span class="sr-only">(current)</span></a>
					</li>
					<li class="nav-item d-none d-lg-block">|</li>
					<li class="nav-item">
						<a class="nav-link py-0" href="showstock.html"><i class="fa fa-bullseye d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span> Stocks</a>
					</li>
				<%
				
				if(session.getAttribute("isLoggedIn")!=null && session.getAttribute("isLoggedIn").equals("true"))
				{
					
				
				%>
				
					
					<li class="nav-item d-none d-lg-block">|</li>
					<li class="nav-item">
						<a class="nav-link py-0" href="portfolio.html"><i class="fa fa-folder-open d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span> Portfolio</a>
					</li>
					<li class="nav-item d-none d-lg-block">|</li>
					<li class="nav-item">
						<a class="nav-link py-0" href="watchlist.html"><i class="fa fa-th-list d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span> Watchlist</a>
					</li>
					<li class="nav-item d-none d-lg-block">|</li>
					<li class="nav-item d-none d-lg-block">|</li>
					<!--  <li class="nav-item">
						<a class="nav-link py-0" href="logout.html"><i class="fa fa-sign-out d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span>logout</a>
					</li> -->
					<li class="nav-item dropdown">
						<a class="nav-link py-0 dropdown-toggle" href="#" id="userProfileLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-user-circle-o d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;</span><i class="fa fa-user"></i></a>
						<div class="dropdown-menu dropdown-menu-right mt-md-3 " aria-labelledby="userProfileLink" style="border-radius:0px; border:0px; background-color:#f8f9fa; text-transform:uppercase; font-size:14px; font-weight:bold; border-top:3px solid #888;">
							<!-- <a class="dropdown-item py-0" href="#" style="font-weight:bold; color:#696969"><i class="fa fa-pencil-square-o d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span> Edit Profile</a>
							<div class="dropdown-divider"></div> -->
							<a class="dropdown-item py-0" href="change.html" style="font-weight:bold; color:#696969"><i class="fa fa-key d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span> Change Password</a>
							<div class="dropdown-divider"></div>
							<!--  a class="dropdown-item py-0" href="#" style="font-weight:bold; color:#696969"><i class="fa fa-download d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span> Download Log File</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item py-0" href="#" style="font-weight:bold; color:#696969"><i class="fa fa-eye d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span> View as User</a> -->
							<div class="dropdown-divider"></div>
							<a class="dropdown-item py-0" href="logout.html" style="font-weight:bold; color:#696969"><i class="fa fa-sign-out d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span> Logout</a>
						</div>
					</li> 
					<%
					}
				else if(session.getAttribute("isLoggedIn")!=null && session.getAttribute("isLoggedIn").equals("trueadmin"))
				{
					%>
					<li class="nav-item d-none d-lg-block">|</li>
					<li class="nav-item">
						<a class="nav-link py-0" href="files.html"><i class="fa fa-folder-open d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span>File Upload</a>
					</li>
					<li class="nav-item d-none d-lg-block">|</li>
					
					
					<li class="nav-item">
						<a class="nav-link py-0" href="companies.html"><i class="fa fa-sign-out d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span>Companies</a>
					</li>
					<li class="nav-item d-none d-lg-block">|</li>
					<!--  <li class="nav-item">
						<a class="nav-link py-0" href="users.html"><i class="fa fa-sign-out d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span>Users</a>
					</li> -->
					
					<!--  <li class="nav-item">
						<a class="nav-link py-0" href="logout.html"><i class="fa fa-sign-out d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span>logout</a>
					</li> -->
					<li class="nav-item dropdown">
						<a class="nav-link py-0 dropdown-toggle" href="#" id="userProfileLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-user-circle-o d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;</span> <i class="fa fa-user"></i> </a>
						<div class="dropdown-menu dropdown-menu-right mt-md-3 " aria-labelledby="userProfileLink" style="border-radius:0px; border:0px; background-color:#f8f9fa; text-transform:uppercase; font-size:14px; font-weight:bold; border-top:3px solid #888;">
							<!-- <a class="dropdown-item py-0" href="#" style="font-weight:bold; color:#696969"><i class="fa fa-pencil-square-o d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span> Edit Profile</a>
							<div class="dropdown-divider"></div> -->
							<a class="dropdown-item py-0" href="change.html" style="font-weight:bold; color:#696969"><i class="fa fa-key d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span> Change Password</a>
							<div class="dropdown-divider"></div>
							<!--  a class="dropdown-item py-0" href="#" style="font-weight:bold; color:#696969"><i class="fa fa-download d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span> Download Log File</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item py-0" href="#" style="font-weight:bold; color:#696969"><i class="fa fa-eye d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span> View as User</a> -->
							<div class="dropdown-divider"></div>
							<a class="dropdown-item py-0" href="logout.html" style="font-weight:bold; color:#696969"><i class="fa fa-sign-out d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span> Logout</a>
						</div>
					</li> 
					
					<% 	
				}
				else
				{
					%>
					<li class="nav-item d-none d-lg-block">|</li>
					<li class="nav-item">
						<a class="nav-link py-0" href="login.html"><i class="fa fa-sign-out d-sm-block d-lg-none" aria-hidden="true"></i><span class="d-sm-block d-lg-none">&nbsp;&nbsp;</span> Login</a>
					</li>
					
					<% 
				}
					%>
					
					
				</ul>
			</div>
			</div>
		</nav>