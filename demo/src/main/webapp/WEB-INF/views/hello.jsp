<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
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
<title>Spring Boot</title>
</head>
<body>
  <h1>Spring Boot - MVC web application example</h1>
  
  <hr>

  <h2>Movie name is ${name}</h2>
  <hr>
  <h2>Poster is ${movie.imageurl}</font>
  <hr>
  
    <img src="${movie.imageurl}" style="width:500px;height:600px;">
	</img>
	<hr>
	Actor is ${actor.name}
	
	<c:if test="${not empty lists}">

		<ul>
			<c:forEach var="listValue" items="${lists}">
				<li>${listValue}</li>
			</c:forEach>
		</ul>

	</c:if>
</body>
</html>