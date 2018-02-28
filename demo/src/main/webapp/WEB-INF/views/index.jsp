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
	<script type="text/javascript">


$(document).ready(function () {
    // Instantiate the Bootstrap carousel
	$('.multi-item-carousel').carousel({
	  interval: false
	});
	
	// for every slide in carousel, copy the next slide's item in the slide.
	// Do the same for the next, next item.
	$('.multi-item-carousel .item').each(function(){
		console.log($(this)[0].innerHTML);
	  	var next = $(this).next();
	  	console.log(next[0].innerHTML);
	  	
	  	if (!next.length) {
	    	next = $(this).siblings(':first');
	  	}
	  	next.children(':first-child').clone().appendTo($(this));
	  
	  	
	  	 for (var i=0;i<4;i++) {
	  	    next=next.next();
	  	    if (!next.length) {
	  	    	next = $(this).siblings(':first');
	  	  	}
	  	    next.children(':first-child').clone().appendTo($(this));
	  	  }
	});

});


</script>
</head>
<body>
	<div class="container">

  <h1>CiniGene</h1>
  <hr>
 <div class="row">
    <div class="col-md-12">
      <div class="carousel slide multi-item-carousel" id="theCarousel">
      
        <div class="carousel-inner">
         <div class="item active">
            		<div class="col-xs-12 col-sm-6 col-md-2"><a href="#">
            			 <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSCv23JYGCp63noR2ziyRhslhRo2z_lDuWYmlPS_QjuWONAHcS-"  class="img-responsive">
            			
            			</a>
          </div>
          		</div>
       
        	<c:if test="${not empty movieList}">
        		<c:forEach var="movie" items="${movieList.results}">
        		
        		<div class="item ">
            		<div class="col-xs-12 col-sm-6 col-md-2"><a href="#">
            			
            			<img src="https://image.tmdb.org/t/p/w342${movie.posterPath}" alt="${movie.title}"    class="img-responsive">
            	
            			</a>
            		</div>
          		</div>
        		</c:forEach >
        		
        	</c:if>
        	
        </div>
        <a class="left carousel-control" href="#theCarousel" data-slide="prev"><i class="glyphicon glyphicon-chevron-left"></i></a>
        <a class="right carousel-control" href="#theCarousel" data-slide="next"><i class="glyphicon glyphicon-chevron-right"></i></a>
      </div>
    </div>
  </div>
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
