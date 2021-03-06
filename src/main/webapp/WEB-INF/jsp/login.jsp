<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link href="webjars/bootstrap/4.6.0/css/bootstrap.min.css" rel="stylesheet">
<style>
	.Login-form{
		width:400px;
		height:200px;
		position:absolute;
		background-color: #5B5EA6;
		top:50%;
		left:50%;
		margin-right:-50%;
		transform: translate(-50%,-50%);
		border-radius:20px; 
	}
</style>
</head>
<body>
<h2>${errMsg}</h2>
<div class="Login-form">
	<div class="container-fluid">				
		<form method="post">
			<input type="text" name="username" class="form-control mt-3" placeholder="Enter Username"/>
			<input type="password" name="password" class="form-control mt-3" placeholder="Enter Password"/>
			<input type="submit" value="Login" class="btn btn-block btn-dark mt-3"/>
		</form>
	</div>
</div>
</body>
</html>