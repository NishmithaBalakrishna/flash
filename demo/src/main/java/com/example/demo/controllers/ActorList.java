package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActorList {
	

	List<Movie> cast;

	private String character;
	
	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}
	private String name;
	
	@JsonProperty("cast_id")
	private String castId;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Movie> getCast() {
		return cast;
	}

	public void setCast(List<Movie> cast) {
		this.cast = cast;
	}

	
		
}
