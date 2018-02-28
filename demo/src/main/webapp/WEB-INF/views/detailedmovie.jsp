<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans|Bitter" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>

img {
height:50%;
}

.img {
height:50%;
}
.checked {
    color: orange;
}
.title
{
  padding: 28px;
  display: table-cell;
  position: relative;
  vertical-align: middle;
  text-align: center;
}
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
							<p>${review.totalResults} reviews</p>
						</div>
						<p class="product-description">${movie.tagline}</p>
						<p>Status: ${movieList.status}</p>
						<p>Average: ${movieList.voteAverage}</p>
						<c:if test="${not empty movieList}"><ul>Genres:<c:forEach var="movie" items="${movieList.genres}">${movie.name} </c:forEach></ul></c:if>
						<p>Overview:<br> ${movieList.overview}</p>
					</div>
				</div>
			</div>
		</div>


  <h1> CAST</h1>
  <div class="row">
    <div class="col-md-12">
      <div class="carousel slide multi-item-carousel" id="theCarousel">
      
        <div class="carousel-inner">
        
        <div class="item active">
            		<div class="col-xs-12 col-sm-6 col-md-2"><a href="#">
            			 Cast
            			</a>
          </div>
          		</div>
        	<c:if test="${not empty actorList}">
        		<c:forEach var="actor" items="${actorList.cast}">
        		
        		<div class="item ">
            		<div class="col-xs-12 col-sm-6 col-md-2"><a href="#">
            			<img src="https://image.tmdb.org/t/p/w342${actor.profilePath}"  class="img-responsive">
            			 ${actor.name } as ${actor.character}
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


</div>

<hr>
<form>
  <input type="button" value="Go back!" onclick="history.back()" style="float: right;" style="color:darkblue">
</form>
</body>
</html>
