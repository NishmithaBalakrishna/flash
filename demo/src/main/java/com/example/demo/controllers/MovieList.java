package com.example.demo.controllers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieList {

	@JsonProperty("vote_average")
	int voteAverage;
	
	public int getVoteAverage() {
		return voteAverage;
	}
	public void setVoteAverage(int voteAverage) {
		this.voteAverage = voteAverage;
	}
	private String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	int page;
	
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@JsonProperty("total_results")
	int totalResults;

	@JsonProperty("total_pages")
	int totalPages;
	
	List<Movie> results;
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public List<Movie> getResults() {
		return results;
	}
	public void setResults(List<Movie> results) {
		this.results = results;
	}
}
