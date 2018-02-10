package com.example.demo.controllers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DetailedMovie {

	private boolean adult;
	@JsonProperty("backdrop_path")
	private String backdropPath;
	
	 private String name;
	 
	 public int getVoteAverage() {
		return voteAverage;
	}

	public void setVoteAverage(int voteAverage) {
		this.voteAverage = voteAverage;
	}

	@JsonProperty("vote_average")
		int voteAverage;

	private Long budget;
	
	private String overview;
	
	private Long id;
	
	private String title;
	
	private String tagline;
	
	private String status;
	
	@JsonProperty("vote_count")
	private String voteCount;
	
	
	@JsonProperty("poster_path")
	private String posterPath;
	
	List<Movie> genres;

	
	public boolean isAdult() {
		return adult;
	}

	public void setAdult(boolean adult) {
		this.adult = adult;
	}

	public String getBackdropPath() {
		return backdropPath;
	}

	public void setBackdropPath(String backdropPath) {
		this.backdropPath = backdropPath;
	}

	public Long getBudget() {
		return budget;
	}

	public void setBudget(Long budget) {
		this.budget = budget;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(String voteCount) {
		this.voteCount = voteCount;
	}
	public List<Movie> getGenres() {
		return genres;
	}

	public void setGenres(List<Movie> genres) {
		this.genres = genres;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}
	

}
