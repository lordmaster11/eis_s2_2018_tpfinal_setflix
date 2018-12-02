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
<title>Serie</title>
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
		<li> <a style="color: white" href="/home?user=${usuario}">Volver</a>
      </ul>
    </div>
    </nav>
	</div>
	<hr class="hrSuperior">


	<div class= "d-flex flex-column align-items-center mt-5 color-link">
	<h1 class="titulo animated zoomInUp ">S E T F L I X</h1>
		
	<div class="card-group">
		<div class="card" style="background-color: #666";>
		<h5 class="card-title" style="text-align: center" >${nombre}</h5>
		<div class="card-body">
			<img width=400 height=600 src=${imagen}>
	      </div>
	  	</div>
		<div class="card" style="background-color: #666";>
		<h5 class="card-text" style="text-align: center">${genero}</h5>
		<h5 class="card-text" style="text-align: center">${temporadas} TEMPORADAS</h5>
		<h5 class="card-text" style="text-align: center">${descripcion}</h5>
		
		</div> 
	   
	   </div>
	
	
	</div>	
</body>
</html>