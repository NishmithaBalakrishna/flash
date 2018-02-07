hello
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
    background-color: darkblue;
}

h1 {
background-color:darkblue;
    color: white;
    text-align: center;
}

h2 {
background-color:darkblue;
    color:white;
    font-family: Italic;
    font-size: 20px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>>
<title>Spring Boot</title>

</head>
<body>
  <h1>CineGene</h1>
  <hr>
  <div>
  <form action="hello" method="post" onsubmit="return validate()">
  <c:if test="${not empty movieList}">
		<ul>
			<c:forEach var="movie" items="${movieList.results}">
				  <div class="col-md-4">
    				<div class="thumbnail">
      					<a href="/w3images/lights.jpg">
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
	   </form>
	</div>
	
  
</bean>
</body>
</html>
 