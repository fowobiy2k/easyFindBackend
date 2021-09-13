package com.example.easyfind.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.easyfind.model.Meal;
import com.example.easyfind.repository.MealRepository;

@Service
public class MealService {
	
	@Autowired
	MealRepository repository;
	
	public void createMeal(Meal meal) {
		repository.save(meal);
	}
	
	public List<Meal> getAllMeals(){
		return repository.findAll();
	}
	
	public Meal getMealById( long id ) {
		return repository.findById(id).get();
	}

}
