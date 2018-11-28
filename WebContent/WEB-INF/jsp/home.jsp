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
            <li><a href="#">Modificar perfil</a></li>
            <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
          </ul>
        </li>
      </ul>
    </div>
    </nav>
	</div>
	<hr class="hrSuperior">

	<div class= "d-flex flex-column align-items-center mt-5 color-link">
		<h1 class="titulo animated zoomInUp ">S E T F L I X</h1>
		
			
			<h2 style="color: white">Lista de series</h2>
			
			<table border="1" bordercolor= "white" style="color: red" type"series" >
            <tr>
                <th style="width: 250px" style="color: white">Nombre</th>
                <th style="width: 150px;">Temporadas</th>
                <th style="width: 150px;">Genero</th>
                <th style="width: 150px;">Estado</th>
            </tr>
            <c:forEach var="serie" 
                       items="${series}">
                <tr>
                    <td>${serie.nombre}</td>
                    <td>${serie.temporada}</td>
                    <td>${serie.genero}</td>
                    <td>${serie.estado}</td>
                </tr>
            </c:forEach>
        </table>
			
			
	
	</div>
</body>
</html>