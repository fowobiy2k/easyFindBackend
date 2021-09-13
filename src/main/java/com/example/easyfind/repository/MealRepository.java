package com.example.easyfind.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.easyfind.model.Meal;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {

}
