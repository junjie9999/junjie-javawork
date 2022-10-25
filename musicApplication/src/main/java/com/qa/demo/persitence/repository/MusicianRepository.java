package com.qa.demo.persitence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qa.demo.persitence.domain.Band;
import com.qa.demo.persitence.domain.Musician;

@Repository
public interface MusicianRepository extends JpaRepository<Musician, Long> {
	// find by title 
	@Query(value = "SELECT * from band where Id=?1", nativeQuery = true)
	List<Musician> findMusicianByName(String name);// abstract method no body
	//find by year


}
