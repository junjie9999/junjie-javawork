package com.qa.demo.rest.dto;

import javax.persistence.EntityNotFoundException;

import com.qa.demo.persitence.domain.Band;

public class BandDTO{
	 private Long id;

	private String name;
//	public BandDTO readById(Long id) {
//    Band found = this.Bandrepo.findById(id).orElseThrow(EntityNotFoundException::new);
//    return this.mapToDTO(found);
//}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}

