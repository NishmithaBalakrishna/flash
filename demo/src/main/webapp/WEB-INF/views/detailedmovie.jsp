<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
body {
    background-color: lightgreen;
}

h1 {
background-color:lightgreen;
    color: white;
    text-align: center;
}


</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="style.css"></link>
<title>Spring Boot</title>
<script src="/lib/w3.js"></script>
</head>
<body>
  <h1>CineGene</h1>
  
<div class="container">
		<div class="card">
			<div class="container-fliud">
				<div class="wrapper row">
					<div class="preview col-md-6">
						
						<div class="preview-pic tab-content">
						  <div class="tab-pane active" id="pic-1"><img src="https://image.tmdb.org/t/p/w342${movieList.posterPath}" /></div>
						</div>
						
					</div>
					<div class="details col-md-6">
						<h3 class="product-title">${movieList.title}</h3>
						<div class="rating">
							<div class="stars">
								<span class="fa fa-star checked"></span>
								<span class="fa fa-star checked"></span>
								<span class="fa fa-star checked"></span>
								<span class="fa fa-star"></span>
								<span class="fa fa-star"></span>
							</div>
							<span class="review-no">41 reviews</span>
						</div>
						<p class="product-description">${movie.tagline}</p>
						<p>Status: ${movieList.status}</p>
						<p>Average: ${movieList.voteAverage}</p>
						<c:if test="${not empty movieList}"><ul>Genres:<c:forEach var="movie" items="${movieList.genres}">${movie.name} </c:forEach></ul></c:if>
						<p>Overview:<br> ${movieList.overview}</p>
						<c:if test="${not empty actorList}"><ul>Casts:<c:forEach var="movie" items="${actorList.cast}">${movie.character} as ${movie.name }<br></c:forEach ></ul></c:if>
					</div>
				</div>
			</div>
		</div>
	</div>
<hr>
<form>
  <input type="button" value="Go back!" onclick="history.back()" style="float: right;" style="color:darkblue">
</form>
</body>
</html>
