<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
body {
    background-color: #8f0040;
}

h1 {
    color: white;
    text-align: center;
}

td {
    color: white;
    font-family: verdana;
    font-size: 20px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content -->
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>

<title>Spring Boot</title>
</head>
<body>
	<div class="container">

  <h1>CiniGene</h1>
  <hr>

	  <form action="hello" method="post" onsubmit="return validate()">
	  <div class="row">
	  <div class="col-lg-6">
	    <div class="input-group">
	      <span class="input-group-btn">
	        <button class="btn btn-default" type="submit">Go!</button>
	      </span>
	      <input id="moviename" name="moviename" type="text" class="form-control" placeholder="Search for Movie">
	    </div><!-- /input-group -->
	  </div><!-- /.col-lg-6 -->
	  <div class="col-lg-6">
	    <div class="input-group">
	      <input id= = "actor" name = "actor" type="text" class="form-control" placeholder="Search for Actor">
	      <span class="input-group-btn">
	        <button class="btn btn-default" type="submit">Go!</button>
	      </span>
	    </div><!-- /input-group -->
	  </div><!-- /.col-lg-6 -->
	</div><!-- /.row -->
	</form>
	</br>
	
	<c:if test="${not empty movieList}">
		<ul>
			<c:forEach var="movie" 

items="${movieList.results}">
				  <div class="col-md-4">
    				<div class="thumbnail">
      					<a href="/detail/${movie.id}">
        				<img src="https://image.tmdb.org/t/p/w342${movie.posterPath}" alt="${movie.title}" style="width:100%">
        				<div class="caption">
          					<p>${movie.id} Lorem ipsum...</p>
        				</div>
      					</a>
    				</div>
  				</div>
			</c:forEach>
		</ul>

	</c:if>
	

</body>
</html>
