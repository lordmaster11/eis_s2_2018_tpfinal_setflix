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
<title>Home</title>
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
		<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" style="color: white" href="#">Bienvenido, ${user}<span class="caret"></span></a>
          <ul class="dropdown-menu">
         <!-- <li><a href="#">Modificar perfil</a></li>-->
            <li><a href="login"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
          </ul>
        </li>
      </ul>
    </div>
    </nav>
	</div>

	<div class= "d-flex flex-column align-items-center mt-5 color-link">
		<h1 class="titulo animated zoomInUp ">S E T F L I X</h1>
	</div>
	<br>
			
	
	<!-- CATALOGO -->
	<div class="card-deck">
		<div class="card">
		<h5 class="card-title" style="text-align: center">${variable.get(0).nombre}</h5>
		<div class="card-body">
			<img width=200 height=300 src="https://image.tmdb.org/t/p/w154/j17CGYDlysZjtSqJfbRKS6GmJKF.jpg" title="Junto a los dioses: Los últimos 49 días (2018)" alt="Junto a los dioses: Los últimos 49 días (2018)">
	      		<p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. </p>
	    	</div>
	    	<div class="card-footer">
	      		<small class="text-muted"><button type="button" class="btn btn-lg btn-block boton-largo card-bt" href="index.html">Ir a la Serie</button></small>
	    	</div>
	  	</div>
		<div class="card">
		<h5 class="card-title" style="text-align: center">${variable.get(1).nombre}</h5>
		<div class="card-body">
			<img width=200 height=300 src="https://image.tmdb.org/t/p/w154/j17CGYDlysZjtSqJfbRKS6GmJKF.jpg" title="Junto a los dioses: Los últimos 49 días (2018)" alt="Junto a los dioses: Los últimos 49 días (2018)">
	      		<p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. </p>
	    	</div>
	    	<div class="card-footer">
	      		<small class="text-muted"><button type="button" class="btn btn-lg btn-block boton-largo card-bt" href="index.html">Ir a la Serie</button></small>
	    	</div>
	  	</div>
	  	<div class="card">
		<h5 class="card-title" style="text-align: center">${variable.get(2).nombre}</h5>
		<div class="card-body">
			<img width=200 height=300 src="https://image.tmdb.org/t/p/w154/j17CGYDlysZjtSqJfbRKS6GmJKF.jpg" title="Junto a los dioses: Los últimos 49 días (2018)" alt="Junto a los dioses: Los últimos 49 días (2018)">
	      		<p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. </p>
	    	</div>
	    	<div class="card-footer">
	      		<small class="text-muted"><button type="button" class="btn btn-lg btn-block boton-largo card-bt" href="index.html">Ir a la Serie</button></small>
	    	</div>
	  	</div>
	  	<div class="card">
		<h5 class="card-title" style="text-align: center">${variable.get(3).nombre}</h5>
		<div class="card-body">
			<img width=200 height=300 src="https://image.tmdb.org/t/p/w154/j17CGYDlysZjtSqJfbRKS6GmJKF.jpg" title="Junto a los dioses: Los últimos 49 días (2018)" alt="Junto a los dioses: Los últimos 49 días (2018)">
	      		<p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. </p>
	    	</div>
	    	<div class="card-footer">
	      		<small class="text-muted"><button type="button" class="btn btn-lg btn-block boton-largo card-bt" href="index.html">Ir a la Serie</button></small>
	    	</div>
	  	</div>
	  	<div class="card">
		<h5 class="card-title" style="text-align: center">${variable.get(4).nombre}</h5>
		<div class="card-body">
			<img width=200 height=300 src="https://image.tmdb.org/t/p/w154/j17CGYDlysZjtSqJfbRKS6GmJKF.jpg" title="Junto a los dioses: Los últimos 49 días (2018)" alt="Junto a los dioses: Los últimos 49 días (2018)">
	      		<p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. </p>
	    	</div>
	    	<div class="card-footer">
	      		<small class="text-muted"><button type="button" class="btn btn-lg btn-block boton-largo card-bt" href="index.html">Ir a la Serie</button></small>
	    	</div>
	  	</div>
	</div>
	<br><br>
	
	
		<div class="card-deck">
		<div class="card">
		<h5 class="card-title" style="text-align: center">${variable.get(5).nombre}</h5>
		<div class="card-body">
			<img width=200 height=300 src="https://image.tmdb.org/t/p/w154/j17CGYDlysZjtSqJfbRKS6GmJKF.jpg" title="Junto a los dioses: Los últimos 49 días (2018)" alt="Junto a los dioses: Los últimos 49 días (2018)">
	      		<p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. </p>
	    	</div>
	    	<div class="card-footer">
	      		<small class="text-muted"><button type="button" class="btn btn-lg btn-block boton-largo card-bt" href="index.html">Ir a la Serie</button></small>
	    	</div>
	  	</div>
		<div class="card">
		<h5 class="card-title" style="text-align: center">${variable.get(6).nombre}</h5>
		<div class="card-body">
			<img width=200 height=300 src="https://image.tmdb.org/t/p/w154/j17CGYDlysZjtSqJfbRKS6GmJKF.jpg" title="Junto a los dioses: Los últimos 49 días (2018)" alt="Junto a los dioses: Los últimos 49 días (2018)">
	      		<p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. </p>
	    	</div>
	    	<div class="card-footer">
	      		<small class="text-muted"><button type="button" class="btn btn-lg btn-block boton-largo card-bt" href="index.html">Ir a la Serie</button></small>
	    	</div>
	  	</div>
	  	<div class="card">
		<h5 class="card-title" style="text-align: center">${variable.get(7).nombre}</h5>
		<div class="card-body">
			<img width=200 height=300 src="https://image.tmdb.org/t/p/w154/j17CGYDlysZjtSqJfbRKS6GmJKF.jpg" title="Junto a los dioses: Los últimos 49 días (2018)" alt="Junto a los dioses: Los últimos 49 días (2018)">
	      		<p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. </p>
	    	</div>
	    	<div class="card-footer">
	      		<small class="text-muted"><button type="button" class="btn btn-lg btn-block boton-largo card-bt" href="index.html">Ir a la Serie</button></small>
	    	</div>
	  	</div>
	  	<div class="card">
		<h5 class="card-title" style="text-align: center">${variable.get(8).nombre}</h5>
		<div class="card-body">
			<img width=200 height=300 src="https://image.tmdb.org/t/p/w154/j17CGYDlysZjtSqJfbRKS6GmJKF.jpg" title="Junto a los dioses: Los últimos 49 días (2018)" alt="Junto a los dioses: Los últimos 49 días (2018)">
	      		<p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. </p>
	    	</div>
	    	<div class="card-footer">
	      		<small class="text-muted"><button type="button" class="btn btn-lg btn-block boton-largo card-bt" href="index.html">Ir a la Serie</button></small>
	    	</div>
	  	</div>
	  	<div class="card">
		<h5 class="card-title" style="text-align: center">${variable.get(9).nombre}</h5>
		<div class="card-body">
			<img width=200 height=300 src="https://image.tmdb.org/t/p/w154/j17CGYDlysZjtSqJfbRKS6GmJKF.jpg" title="Junto a los dioses: Los últimos 49 días (2018)" alt="Junto a los dioses: Los últimos 49 días (2018)">
	      		<p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. </p>
	    	</div>
	    	<div class="card-footer">
	      		<small class="text-muted"><button type="button" class="btn btn-lg btn-block boton-largo card-bt" href="index.html">Ir a la Serie</button></small>
	    	</div>
	  	</div>
	</div>
	<br><br>
	
	
	
	
</body>
</html>