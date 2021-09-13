package com.example.easyfind.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.easyfind.model.ServiceProvider;
import com.example.easyfind.repository.ServiceProviderRepository;

@Service
public class ServiceProviderService {
	
	@Autowired
	ServiceProviderRepository repository;
	
	public void createServiceProvider(ServiceProvider sp) {
		repository.save(sp);
	}
	
	public List<ServiceProvider> findAllServiceProvider(){
		return repository.findAll();
	}
	
	public List<ServiceProvider> findServiceProviderByCity( String city ){
		return repository.findByCity(city);
	}
	
	public ServiceProvider findServiceProviderById( long id ) {
		return repository.findById(id).get();
	}

}
