package com.example.demo.controllers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Movie {

	long id;

	@JsonProperty("vote_count")
	int voteCount;
	
	private String title;
	
	@JsonProperty("poster_path")
	private String posterPath;
	
	private String description;

	private String imageurl;
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	List<Movie> genres;
	
	public List<Movie> getGenres() {
		return genres;
	}

	public void setGenres(List<Movie> genres) {
		this.genres = genres;
	}

	
	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getVoteCount() {
		return voteCount;
	}
	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}
	
}
