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
<title>Registrar</title>
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
		<li> <a style="color: white" href="/login">Volver</a>
      </ul>
    </div>
    </nav>
	</div>
	<hr class="hrSuperior">


	<div class= "d-flex flex-column align-items-center mt-5 color-link">
	<h1 class="titulo animated zoomInUp ">S E T F L I X</h1>
	
	<form:form name="submitForm" method="POST" >
		<div class="form-group">
		        <label for="usuario" class="col-md-3 control-label" style="color: white">Usuario</label>		
                <input type="text" class="form-control" name="usuario" placeholder="Usuario">
                
                <label for="password" class="col-md-3 control-label" style="color: white">Contraseña</label>
                <input type="password" class="form-control" name="password" placeholder="Password">
                
                <label for="nombre" class="col-md-3 control-label" style="color: white">Nombre</label>
                <input type="text" class="form-control" name="nombre" placeholder="Nombre">
                
                <label for="apellido" class="col-md-3 control-label" style="color: white">Apellido</label>
                <input type="text" class="form-control" name="apellido" placeholder="Apellido">                              
                
               	<button  class="btn btn-primary" type="registrar">Registrarse</button>                              
                                
				<div style="color: red; text-align: center">${error}</div>
		</div>
	</form:form>
	</div>	
</body>
</html>