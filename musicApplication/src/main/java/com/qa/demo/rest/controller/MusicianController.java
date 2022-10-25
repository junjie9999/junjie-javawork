package com.qa.demo.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.qa.demo.persitence.domain.Band;
import com.qa.demo.persitence.domain.Musician;
import com.qa.demo.rest.dto.MusicianDTO;
import com.qa.demo.service.BandService;
import com.qa.demo.service.MusicianService;

public class MusicianController {
	@Autowired
	MusicianService service;
	@PostMapping("/create")
	public ResponseEntity<MusicianDTO> create(@RequestBody Musician musician) {
		return new ResponseEntity<>(this.service.create(musician),HttpStatus.CREATED);
		
	}
	@GetMapping("/getAll")
	public ResponseEntity<List<MusicianDTO>> read() {
		return ResponseEntity.ok(this.service.getAll());
	}
	
	@GetMapping("/readOne/{id}")
	public ResponseEntity<Optional<Musician>> readId(@PathVariable Long id ){
		return ResponseEntity.ok(this.service.readOne(id));}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<MusicianDTO> update(@PathVariable Long id,@RequestBody Musician musician){
		return new ResponseEntity<>(this.service.update(musician,id),HttpStatus.ACCEPTED);}
	
	@DeleteMapping("/deleteMusician/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		return ResponseEntity.ok(this.service.delete(id));
	}
//	@GetMapping("/readById/{id}")
//	public ResponseEntity<List<Musician>> readById(@PathVariable Long id) {
//		return ResponseEntity.ok(this.service.readById(id));
//
//}
}
