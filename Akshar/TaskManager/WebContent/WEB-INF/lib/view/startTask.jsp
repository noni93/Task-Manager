<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Team Dashboard 4 Task Management Inc.</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<!-- Bootstrap -->
		
		<spring:url value = "/resources/bootstrap/css/bootstrap.min.css" var = "main" />
		<!-- styles -->
		
		<spring:url value = "/resources/css/styles.css" var = "styles" />
		
 	   
 	   <spring:url value = "/resources/css/bootstrap-datetimepicker.min.css" var = "date" />
 	   	
	 	<spring:url value = "/resources/jquery/jquery-1.8.3.min.js" var = "jquery" />
	 	<spring:url value = "/resources/bootstrap1.1/js/bootstrap.min.js" var = "bootstrap" />
	 	<spring:url value = "/resources/js/bootstrap-datetimepicker.js" var = "bootstrap1" />
	 	<spring:url value = "/resources/js/locales/bootstrap-datetimepicker.fr.js" var = "bootstrap2" />
		<script type="text/javascript" src="${jquery}" charset="UTF-8"></script>
		<script type="text/javascript" src="${bootstrap}"></script>
		<script type="text/javascript" src="${bootstrap1}" charset="UTF-8"></script>
		<script type="text/javascript" src="${bootstrap2}" charset="UTF-8"></script>
 	   
 	   <link href="${main}"rel="stylesheet" />
 	   <link href="${styles}"rel="stylesheet" />
 	   <link href="${date}" rel="stylesheet" media="screen" />
 	   
	</head>
	 
	<body>
		<h1> Akshar</h1>
		<div class="header">
			 <div class="container">
				<div class="row">
				   <div class="col-md-5">
					  <!-- Logo -->
					  <div class="logo">
						 <h1><a href="../userdashboard/showUDash">Team Dashboard</a></h1>
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
						<li ><a href ="../userdashboard/showUDash"><i class="glyphicon glyphicon-home"></i> Dashboard</a></li>
						<li class="current"><a href="../Task/showStartTask"><i class="glyphicon glyphicon-calendar"></i> Propose Task</a></li>
						<li><a href="../Task/showUpdateTask"><i class="glyphicon glyphicon-cog"></i>Task Config/Edit</a></li>
						<li><a href="../userdashboard/showUDash"><i class="glyphicon glyphicon-list"></i>Completed Tasks</a></li>
						</li>
					</ul>
				 </div>
			  </div>
			  <div class="col-md-10">
					<div class="content-box-large">
					<p style="color:red">* Required Field</p>  
				<form action="proposeTask" method="POST" veritcal-align="center" name = "login_fourm" style="border:1px solid" >
						<br>
						<div><label for="task_name" class="col-md-2 control-label">Task Name: *</label>
							<input type="text" name="task_name" placeholder="" id="task_name" required><br>
						</div>
						<br><br>
						<div >
						<fieldset>
							<label for="dtp_input1" class="col-md-2 control-label">Start Time: *</label>
							<div class="input-group date form_datetime col-md-5" data-date="2018-04-24T00:00:00Z" data-date-format="dd MM yyyy - HH:ii p" data-link-field="dtp_input1">
								<input class="form-control" size="16" type="text" name = "starttime"value="" required onkeypress="return false;">
								<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
								<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
							</div>
							<input type="hidden" id="dtp_input1" value="" /><br/>
						</div>
						<br>
						<div >
							<label for="dtp_input2" class="col-md-2 control-label">Stop Time: *</label>
							<div class="input-group date form_datetime col-md-5" data-date="2018-04-24T00:00:00Z" data-date-format="dd MM yyyy - HH:ii p" data-link-field="dtp_input2" >
								<input class="form-control" size="16" type="text" name = "stoptime" value="" required onkeypress="return false;">
								<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
								<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
							</div>
							<input type="hidden" id="dtp_input2" value="" /><br/>
						</div>
						<br>
						<div><label for="task_describe" class="col-md-2" >Task Description: *</label>
							<textarea  name="task_describe" id="task_describe" rows="5" cols="50" required></textarea><br>
							<!--<input type="text" name="task_describe" placeholder="" id="task_describe" ><br>-->
						</div>
						<br><br>
						
						<div><label for="task_priority" class="col-md-2 control-label" >Task Priority: *</label>
							<input type="text" name="task_priority" placeholder="Integer between 1-50" id="task_priority" required><br>
						</div>
						<br><br>
						<div><label for="task_team" class="col-md-2 control-label">Task Team: *</label>
							<input type="text" name="task_team" placeholder="" id="task_team" required><br>
						</div>
						<br><br>
						
						<br>
						<div style="text-align:center"><input type="submit" value="Submit" name="submitButton" style="font-weight:bold" >
						<a href="userDash.html"><input type="button" value="Cancel" style="font-weight:bold"><br>
					</div>
						
					</fieldset>
				</form>
				</div>
			</div>
		</div>

		<script type="text/javascript">
			$('.form_datetime').datetimepicker({
				//language:  'fr',
				weekStart: 1,
				todayBtn:  1,
				autoclose: 1,
				todayHighlight: 1,
				startView: 2,
				forceParse: 0,
				startDate: "2018-04-24 00:00",
				showMeridian: 1
			});
			
		</script>

	 
	 
	</body>


<footer>
	<div class="container">
	<hr>
		<Strong>Devs: Akshar, Jessica, Tina, Matt, Singh</Strong>
	</div>
</footer>





</html>