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
		<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" style="color: white" href="#">Bienvenido, ${us}<span class="caret"></span></a>
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
			
	<ul>
		<%! int fontSize; %> 
		<%fontSize = 0;%>

			<c:forEach var="serie" items="${variable}">

			<% if (fontSize == 0 || fontSize == 5 ) { %>
			<div class="row">
         		<div class="card-deck">
         			<%fontSize = 0;%>
    		<% } %>
		   
         			
			<div class="card" style="background-color: #333; border-color: #333;" style="width: 15rem;" >
				<h5 class="card-title" style="text-align: center">${serie.nombre}</h5>
			<div class="card-body">
			<img width=200 height=300 src= ${serie.imagen} title=${serie.nombre}>
				<br>
	      		<p class="card-text" style= "color: white" style= "text-align: center" >${serie.temporadas}  TEMPORADAS  </p>
	    	</div>
	    	<div class="card-footer">
	      		<small class="text-muted">
	      		
	      		<button class="btn btn-lg btn-block boton-largo card-bt" name = buttonSerie  type="button"
	      		 onclick="window.location.href='${us}/${serie.nombre}';">
 
	      		Ir a la Serie 
	      		</button></small>
					
	    	</div>
	  	</div>
	    	
	    	<% if (fontSize == 4) { %>
	    		</div>
	    		 </div>
				<br><br>
    		  <% } %>
    		  
    		  <%fontSize ++;%>
		</c:forEach>		
	</ul>


	
</body>
</html>