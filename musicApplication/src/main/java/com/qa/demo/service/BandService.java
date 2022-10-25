package com.qa.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.qa.demo.exception.BandNotFoundException;
import com.qa.demo.persitence.domain.Band;
import com.qa.demo.persitence.domain.Musician;
import com.qa.demo.persitence.repository.BandRepository;
import com.qa.demo.persitence.repository.MusicianRepository;
import com.qa.demo.rest.dto.BandDTO;
import com.qa.demo.rest.dto.MusicianDTO;
@Service
public class BandService {

	BandRepository BandRepo;
	private ModelMapper mapper;
    public BandService(	BandRepository BandRepo, ModelMapper mapper) {
        super();
        this.BandRepo = BandRepo;
        this.mapper = mapper;
    }

    private BandDTO mapToDTO(Band person) {
        return this.mapper.map(person, BandDTO.class);
    }

    public BandDTO createBand(Band person) {
    	Band saved =  this.BandRepo.save(person);
        return this.mapToDTO(saved);
    }

    public List<BandDTO> getAllPeople() {
        return this.BandRepo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    public BandDTO update(Band newBand, Long id) {
        Optional<Band> existingOptional = this.BandRepo.findById(id);
        Band existing = existingOptional.get();

        existing.setId(newBand.getId());
        existing.setName(newBand.getName());

        Band updated =  this.BandRepo.save(existing);
        return this.mapToDTO(updated);
    }

	public boolean delete(Long id) {
		this.BandRepo.deleteById(id);
		return !this.BandRepo.existsById(id);
	}
	public List<Band> readByBand(String name) 
	{
		return this.BandRepo.findBandByName(name);
	}
	public BandDTO readById(Long id) {
	    Band found = BandRepo.findById(id).orElseThrow(EntityNotFoundException::new);
	    return this.mapToDTO(found);

	}
	public List<Band> readAll() {
		return this.BandRepo.findAll();

//	}
//	public Optional<Band> readOne(Long id) throws BandNotFoundException
//    {
//        return Optional.ofNullable(this.BandRepo.findById(id).orElseThrow(()->new BandNotFoundException())) ;
//    }
//	
	}
	
}
