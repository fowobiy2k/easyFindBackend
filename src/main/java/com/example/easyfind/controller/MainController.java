package com.example.easyfind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.easyfind.model.City;
import com.example.easyfind.model.Meal;
import com.example.easyfind.model.ServiceProvider;
import com.example.easyfind.model.Testimony;
import com.example.easyfind.service.MealService;
import com.example.easyfind.service.ServiceProviderService;
import com.example.easyfind.service.TestimonyService;

@RestController
@RequestMapping("/easy")
public class MainController {
	
	@Autowired
	ServiceProviderService SPService;
	
	@Autowired
	MealService mealService;
	
	@Autowired
	TestimonyService testimonyService;
	
	@GetMapping("/ef")
	public String welcome() {
		return "Welcome";
	}
	
	@GetMapping("/sp/city/{cityname}")
	public List<ServiceProvider> findServiceProviderByCity( @PathVariable String cityname ){
		System.out.println("City: " + cityname );
		return SPService.findServiceProviderByCity(cityname);
	}
	
	@GetMapping("/sp")
	public List<ServiceProvider> allServiceProvider( ){
		
		return SPService.findAllServiceProvider();
	}
	
	@GetMapping("/sp/{id}")
	public ServiceProvider oneServiceProvider(@PathVariable long id ){
		
		return SPService.findServiceProviderById(id);
	}
	
	@GetMapping("/testimony")
	public List<Testimony> getTestimony( ){
		
		return testimonyService.getAll();
	}
	
	@GetMapping("/cities")
	public List<String> allCities( ){
		
		City city = new City();
		
		return city.getSupportedCities();
	}
	
	@GetMapping("/meals")
	public List<Meal> getAllMeal(){
		return mealService.getAllMeals();
	}
	
	@GetMapping("/meal/{id}")
	public Meal getMealById(@PathVariable long id) {
		return mealService.getMealById(id);
	}

}
