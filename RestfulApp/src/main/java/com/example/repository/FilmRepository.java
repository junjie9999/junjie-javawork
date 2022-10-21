package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film,Integer>{
	// find by title 
	@Query(value = "SELECT * from Film where title=?1", nativeQuery = true)
	List<Film> findFilmByTitle(String title);// abstract method no body
	//find by year
	@Query(value = "SELECT * from Film where genre=?1 and release_year=?2", nativeQuery = true)
	List<Film> findFilmByYear(String genre, int year); // abstract method 
	// find by 

}
