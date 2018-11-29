<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="../resources/css/style.css"/>
<link rel="stylesheet" type="text/css" href="../resources/css/animate.css"/>
<link rel="stylesheet" type="text/css" href="../resources/css/bootstrap.css"/>
<link href="https://fonts.googleapis.com/css?family=Exo:800|Oswald:600" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="resources/js/bootstrap.js"></script>
<script src="resources/js/myjs.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<style type="text/css">
body {
   background: black;
}
</style>
</head>

<body>

    <div>
    	<nav class="navbar navbar-default" style="background-color: #FF0000">
    <div class="container-fluid">
      <div class="navbar-header">
       
      </div>
      <ul class="nav navbar-nav navbar-right">
		<li style="color: red">Login</li>
      </ul>
    </div>
    </nav>
	</div>
	<hr class="hrSuperior">
    
  <div class= "d-flex flex-column align-items-center mt-5 color-link">
	<h1 class="titulo animated zoomInUp ">S E T F L I X</h1>
	
	<form:form name="submitForm" method="POST" >
		<div class="form-group">
				<input type="text" name="usuario" class="form-control" id="exampleInputEmail1"  placeholder="Usuario" />
				<input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Contraseña" />
				<input style="color: white; background-color: #FF0000" value="Ingresar" name="button" type="submit"/>
				<div style="color: red; text-align: center">${error}</div>
		</div>
	</form:form>
	<div class="login-signup-now" style="color: white; text-align: center" >¿Primera vez en Setflix? <a class=" " target="_self" href="/registrar">Regístrate ya</a></div>
	</div>
</body>
</html>