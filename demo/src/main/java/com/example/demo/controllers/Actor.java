package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActorList {
	

	List<Movie> casts;

	private String character;
	
	private String name;
	
	@JsonProperty("cast_id")
	private String castId;
	
	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Movie> getCasts() {
		return casts;
	}

	public void setCasts(List<Movie> casts) {
		this.casts = casts;
	}

	
		
}
