package com.example.easyfind.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.easyfind.model.ServiceProvider;

@Repository
public interface ServiceProviderRepository extends JpaRepository<ServiceProvider, Long> {
	List<ServiceProvider> findByCity( String city);
}
