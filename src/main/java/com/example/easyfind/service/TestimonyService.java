package com.example.easyfind.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.easyfind.model.Testimony;
import com.example.easyfind.repository.TestimonyRepository;

@Service
public class TestimonyService {
	
	@Autowired
	TestimonyRepository repository;
	
	public List<Testimony> getAll(){
		return repository.findAll();
	}
}
