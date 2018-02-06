package com.example.demo.controllers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieList {

	int page;
	
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
