package com.qa.demo.persitence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.qa.demo.persitence.domain.Band;


public interface BandRepository extends JpaRepository<Band, Long> {
	// find by id 
	@Query(value = "SELECT * from band where Id=?1", nativeQuery = true)
	List<Band> findBandByName(String name);// abstract method no body
	//find by name



}
