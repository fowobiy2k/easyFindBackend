package com.example.easyfind.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.easyfind.model.Testimony;

@Repository
public interface TestimonyRepository extends JpaRepository<Testimony, Long> {

}
