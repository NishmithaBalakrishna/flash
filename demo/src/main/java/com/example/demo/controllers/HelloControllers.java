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
	public String index(Model model) {
		 try {
			 RestTemplate restTemplate = new RestTemplate();
			 MovieList movieList = restTemplate.getForObject(discoverURL, MovieList.class);
			 System.out.println(movieList);
			 model.addAttribute("movieList", movieList);
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
		return "index";
	}
	 @PostMapping("/hello")
	   public String sayHello( Model model, HttpServletRequest request) {
		 try {
			 String movieName = request.getParameter("moviename");

	
	
			 RestTemplate restTemplate = new RestTemplate();
			 String url=discoverURL;
			 if(!StringUtils.isEmpty(movieName)) {
				 System.out.println(movieName);
				 url = searchURL + movieName +apiKey;//https://api.themoviedb.org/3/discover/movie?api_key=4d4ed145d3584846f5922b6a467e1f85&query=minion
			 }
			 MovieList movieList = restTemplate.getForObject(url, MovieList.class);
			 System.out.println(movieList);
			 model.addAttribute("movieList", movieList);
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
	
		 return "hello";
	 }
	  

	 @RequestMapping("/detail/{id}")
	 public String getMovieDetail(@PathVariable ("id") String id, Model model) {


		 RestTemplate restTemplate = new RestTemplate();
		 
		 String url = "https://api.themoviedb.org/3/movie/" + id + "?api_key=4d4ed145d3584846f5922b6a467e1f85";
		  
		 DetailedMovie movieList = restTemplate.getForObject(url, DetailedMovie.class);

		 model.addAttribute("movieList", movieList);
	    
		 RestTemplate restTemplate1 = new RestTemplate();

		 String urll = "https://api.themoviedb.org/3/movie/" + id + "/casts?api_key=4d4ed145d3584846f5922b6a467e1f85";
		 
		 ActorList actorList = restTemplate1.getForObject(urll, ActorList.class);
	    	
		 model.addAttribute("actorList", actorList);
	     
		 return "detailedmovie";
	 }
	  
}

