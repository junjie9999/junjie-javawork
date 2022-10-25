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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.demo.persitence.domain.Band;
import com.qa.demo.rest.dto.BandDTO;
import com.qa.demo.service.BandService;


@RestController
@RequestMapping("/band")
public class BandController {
	private BandService service;
	
	public BandController(BandService service) {
		super();
		this.service = service;
	}
	@PostMapping("/createBand")
	public ResponseEntity<BandDTO> createBand(@RequestBody Band band) {
		return new ResponseEntity<>(this.service.createBand(band), HttpStatus.CREATED);
	}


	@GetMapping("/read/{id}")
	public ResponseEntity<BandDTO> readOne(@PathVariable Long id) {
		return ResponseEntity.ok(this.service.readById(id));
	}

	@GetMapping("/readAll")
	public ResponseEntity<List<Band>> readAll() {
		return ResponseEntity.ok(this.service.readAll());
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<BandDTO> update(@PathVariable Long id, @RequestBody Band band) {
		return new ResponseEntity<>(this.service.update(band, id), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		return this.service.delete(id) ? new ResponseEntity<>(HttpStatus.NO_CONTENT)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping("/readByBand/{Name}")
	public ResponseEntity<List<Band>> readByTitle(@PathVariable String name ) {
		return ResponseEntity.ok(this.service.readByBand(name));

}
	
}
