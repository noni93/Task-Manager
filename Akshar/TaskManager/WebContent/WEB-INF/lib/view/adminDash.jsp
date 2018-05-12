<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Admin Dashboard 4 Task Management Inc.</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<!-- Bootstrap -->
		
		<!-- styles -->
		<spring:url value = "/resources/bootstrap/css/bootstrap.min.css" var = "main" />
		<spring:url value = "/resources/css/styles.css" var = "styles" />
 	   <spring:url value = "/resources/css/bootstrap-datetimepicker.min.css" var = "date" />
	 	<spring:url value = "/resources/jquery/jquery-1.8.3.min.js" var = "jquery" />
	 	<spring:url value = "/resources/bootstrap1.1/js/bootstrap.min.js" var = "bootstrap" />
	 	
		<script type="text/javascript" src="${jquery}" charset="UTF-8"></script>
		<script type="text/javascript" src="${bootstrap}"></script>
 	   <link href="${main}"rel="stylesheet" />
 	   <link href="${styles}"rel="stylesheet" />
 	   <link href="${date}" rel="stylesheet" media="screen" />
	</head>
	
	<body>
		<div class="header">
			 <div class="container">
				<div class="row">
				   <div class="col-md-5">
					  <!-- Logo -->
					  <div class="logo">
						 <h1><a href="managerDash.html">Admin Dashboard</a></h1>
					  </div>
				   </div>
				   <div class="col-md-2">
					  <div class="navbar navbar-inverse" role="banner">
						  <nav class="collapse navbar-collapse bs-navbar-collapse navbar-right" role="navigation">
							<ul class="nav navbar-nav">
							  <li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">My Account <b class="caret"></b></a>
								<ul class="dropdown-menu animated fadeInUp">
								  <li><a href="profile.html">Profile</a></li>
								  <li><a href="loginPage.html">Logout</a></li>
								</ul>
							  </li>
							</ul>
						  </nav>
					  </div>
				   </div>
				</div>
			 </div>
		</div>
		<div class="page-content" vertical-align="left">
			<div class="row">
			  <div class="col-md-2">
				<div class="sidebar content-box" style="display: block;">
					<ul class="nav">
						<!-- Main menu -->
						<li class="current"><a href ="../Admin/showAdminDash"><i class="glyphicon glyphicon-home"></i> Dashboard</a></li>
						<li><a href="../ManagerAdd/showManagerAdd"><i class="glyphicon glyphicon-eject"></i> Add Manager</a></li>
						</li>
					</ul>
				 </div>
				</div>
				<div class="container">
					<div class="col-md-6">
						<div class="content-box-large">
							<div class="panel-heading">
								<dif class="panel-title">List of Managers</dif>
							</div>
							<div class="panel-body">
							</div>
						</div>
					</div>
					<div class="col-md-6">
						<div class="content-box-large">
							<div class="panel-heading">
								<dif class="panel-title">List of Users</dif>
							</div>
							<div class="panel-body"></div>
						</div>
					</div>
				</div>
			</div>
		</div>			
	</body>
	<br><br>
	<footer>
	<div class="container">
	<hr>
		<Strong>Devs: Akshar, Jessica, Tina, Matt, Singh</Strong>
	</div>
</footer>
</html>
