package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.MainService;

@RestController
public class Controller {

	@Autowired
	MainService service;

	@GetMapping("/list")
	public List<String> showList()
	{
		return this.service.show();
		
	}
	//post
	@PostMapping("/add")
	public List<String> addToList()
	{
		return this.service.create();
	}
	//update the list
	@PutMapping("/update/{id}")
	public void updateTheList(@PathVariable int id)
	{
		this.service.update(id);
	}
	//delete
	@DeleteMapping("/delete/{id}")
	public void deleteFromTheList(@PathVariable int id)
	{
		this.service.delete(id);
	
	}

}
