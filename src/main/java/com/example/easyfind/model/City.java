package com.example.easyfind.model;

import java.util.ArrayList;
import java.util.List;

public class City {
	
	private final List<String> supportedCities = new ArrayList<String>() {
		{
			add("Lagos");
			add("Abuja");
			add("Ibadan");
			add("Uyo");
			add("Port Harcourt");
			add("Enugu");
			add("Asaba");
			add("Kano");
			add("Umuahia");
			add("Onitsha");
			add("Aba");
			add("Owerri");
		}
	};

	public List<String> getSupportedCities() {
		return supportedCities;
	}
	
	

}
