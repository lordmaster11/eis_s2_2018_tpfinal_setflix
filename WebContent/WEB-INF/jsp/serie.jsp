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
#form {
  width: 250px;
  margin: 0 auto;
  height: 50px;
}
#form p {
  text-align: center;
}
#form label {
  font-size: 20px;
}
input[type="radio"] {
  display: none;
}
label {
  color: grey;
}
.clasificacion {
  direction: rtl;
  unicode-bidi: bidi-override;
}
label:hover,
label:hover ~ label {
  color: orange;
}
input[type="radio"]:checked ~ label {
  color: red;
}
.clasificacion input[type='radio'] {
    opacity: 0;
  }
.clasificacion label {
    font-size: 30px;
    color:rgb(150, 150, 150);
    cursor: pointer;
  }
.clasificacion label:hover {
    color: rgb(217, 215, 11);
  }
.activo + label{
   color: rgb(255, 230, 0) !important;
}

.center {
    margin-left: auto;
    margin-right: auto;
    display: block;
}
.texto {
    margin-left: auto;
    margin-right: auto;
    display: block;
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
	</div>
	<br>
		
	<div class="card-group">
		<div class="card" style="background-color: black; border:0">
		<h1 class="card-title" style="color: white; text-align: center; padding: 10px";>${nombre}</h1>
			<div class="card-body">
				<img class= "center" width=400 height=600 src=${imagen} style="border-style:solid;border-width:6px; color:red">
	    	</div>
	  	</div>
		
		<div class="card" style="background-color: black; color: white; padding: 30px; margin-top: 65px;">
			<div class="texto">
			<h5 class="card-text" style="padding-bottom: 10px">Genero: ${genero}</h5>
			<h5 class="card-text" style="padding-bottom: 10px">Temporadas: ${temporadas}</h5>
			<div class="card-parrafo">
				<h5 class="card-tex" style="padding-bottom: 10px"> Sinopsis</h5>
				<p class="card-text">${descripcion}</p>
			</div>
				<br>
				
		<h5 class= "text-color1">Calificación</h5>
		<form>
  			<p class="clasificacion">
    			<input id="radio1" type="radio" name="estrellas" value="5"><!--
    			--><label for="radio1">★</label><!--
    			--><input id="radio2" type="radio" name="estrellas" value="4"><!--
    			--><label for="radio2">★</label><!--
    			--><input id="radio3" type="radio" name="estrellas" value="3"><!--
    			--><label for="radio3">★</label><!--
    			--><input id="radio4" type="radio" name="estrellas" value="2"><!--
    			--><label for="radio4">★</label><!--
				--><input id="radio5" type="radio" name="estrellas" value="1"><!--
    			--><label for="radio5">★</label>
 			 </p>
		</form>
		</div> 
			<h5 class="card-text" style="padding-bottom: 20px">Trailer</h5>
			<div style="text-align: center"><iframe width="560" height="315" src= ${trailer} frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
			
			</div>
		</div>		
	</div>
	
	
</body>
</html>