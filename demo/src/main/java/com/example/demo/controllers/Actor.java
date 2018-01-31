package com.example.demo.controllers;

import java.util.ArrayList;

public class Actor {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 public ArrayList<String> getList() {

			ArrayList<String> list = new ArrayList<String>();
			list.add("Kareena Kapoor");
			list.add("Diana Penty");
			list.add("Emmy Jackson");
			list.add("Demi Lovato");
			list.add("Charlie Puth");
			list.add("Emma Heester");
			list.add("Sidharth Malhotra");

			return list;

		}
}