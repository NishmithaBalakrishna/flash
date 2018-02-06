package com.example.demo.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;


import java.util.ArrayList;

//import com.hellokoding.springboot.Movie;

@Controller
public class HelloControllers {
	
	private String discoverURL = "https://api.themoviedb.org/3/discover/movie?api_key=4d4ed145d3584846f5922b6a467e1f85";
	
	
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
