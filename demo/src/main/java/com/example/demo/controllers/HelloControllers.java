package com.example.demo.controllers;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

//import com.hellokoding.springboot.Movie;

@Controller
public class HelloControllers {
	
	private String discoverURL = "https://api.themoviedb.org/3/discover/movie?api_key=4d4ed145d3584846f5922b6a467e1f85&sort_by=popularity.desc";
	private String searchURL = "https://api.themoviedb.org/3/search/movie?query=";
	private String apiKey = "&api_key=4d4ed145d3584846f5922b6a467e1f85";
	
	
	@RequestMapping("/")
	public String index(Model model, HttpServletRequest request) {
		try {
			String movieName = request.getParameter("moviename");

			String actorName = request.getParameter("actor");
			
			RestTemplate restTemplate = new RestTemplate();
			String url = discoverURL;
			if(!StringUtils.isEmpty(movieName)) {
				System.out.println(movieName);
				url = searchURL + movieName +apiKey;
				//https://api.themoviedb.org/3/discover/movie?api_key=4d4ed145d3584846f5922b6a467e1f85&query=minion
			}
			MovieList movieList = restTemplate.getForObject(url, MovieList.class);
			System.out.println(movieList);
			model.addAttribute("movieList", movieList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}

		@RequestMapping("/detail/{id}")
	   public String getMovieDetail(@PathVariable ("id") String id, Model model) {

		  Movie movie = new Movie();
			
		  RestTemplate restTemplate = new RestTemplate();

		  String url = "https://api.themoviedb.org/3/movie/" + id + "?api_key=4d4ed145d3584846f5922b6a467e1f85";
			  
		  DetailedMovie movieList = restTemplate.getForObject(url, DetailedMovie.class);

		  movie.setDescription("Jungle book. Movie a year back.");
	    	
		  movie.setImageurl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROqluO8oseBM_Xa5TIuwdGID8gJWvAm2UT5fyGQMeY9IpUd0BrTw");
	    	//model.addAttribute("name", name);
	    	
		  model.addAttribute("movie", movieList);
	    	
	    	
		  Actor actor=new Actor();
	    	actor.setName("ranveer");
	    	model.addAttribute("actor",actor);
	    	
	    	ArrayList<String> list = actor.getList();
	    	model.addAttribute("lists", list);

	      return "detailedmovie";
	      
	   }
	
	   @PostMapping("/hello")
	   public String sayHello(@RequestParam("name") String name, Model model) {
	      model.addAttribute("name", name);
	      Movie movie = new Movie();
	    	movie.setDescription("Jungle book. Movie a year back.");
	    	movie.setImageurl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROqluO8oseBM_Xa5TIuwdGID8gJWvAm2UT5fyGQMeY9IpUd0BrTw");
	    	//model.addAttribute("name", name);
	    	model.addAttribute("movie", movie);
	    	
	    	Actor actor=new Actor();
	    	actor.setName("ranveer");
	    	model.addAttribute("actor",actor);
	    	
	    	ArrayList<String> list = actor.getList();
	    	model.addAttribute("lists", list);

	      return "hello";
	      
	   }
	  
}
