package com.qa.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.demo.exception.MusicianNotFoundException;

import com.qa.demo.persitence.domain.Musician;
import com.qa.demo.persitence.repository.MusicianRepository;
import com.qa.demo.rest.dto.MusicianDTO;

@Service
public class MusicianService {

	MusicianRepository MusicianRepo;
	private ModelMapper mapper;
	
    public MusicianService(MusicianRepository MusicianRepo, ModelMapper mapper) {
        super();
        this.MusicianRepo = MusicianRepo;
        this.mapper = mapper;
    }

    private MusicianDTO mapToDTO(Musician musician) {
        return this.mapper.map(musician, MusicianDTO.class);
    }

    public MusicianDTO create(Musician musician) {
    	Musician saved =  this.MusicianRepo.save(musician);
        return this.mapToDTO(saved);
    }

    public List<MusicianDTO> getAll() {
        return this.MusicianRepo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    public MusicianDTO update(Musician newMusician, Long id) {
        Optional<Musician> existingOptional = this.MusicianRepo.findById(id);
        Musician existing = existingOptional.get();

        existing.setId(newMusician.getId());
        existing.setName(newMusician.getName());
        existing.setStrings(newMusician.getStrings());
        existing.setType(newMusician.getType());
        existing.setBand (newMusician.getBand());

        Musician updated =  this.MusicianRepo.save(existing);
        return this.mapToDTO(updated);
    }


	public boolean delete(Long id) {
		this.MusicianRepo.deleteById(id);
		return !this.MusicianRepo.existsById(id);
	}
	public List<Musician> readByName(String name) 
	{
		return this.MusicianRepo.findMusicianByName(name);
	}
	
    public MusicianRepository getMusicianRepo() {
		return MusicianRepo;
	}
	public void setMusicianRepo(MusicianRepository musicianRepo) {
		MusicianRepo = musicianRepo;
	}
	   public MusicianDTO readById(Long id) {
	        Musician foundMusician = this.MusicianRepo.findById(id).orElseThrow(EntityNotFoundException::new);
	        return this.mapToDTO(foundMusician);
	    }
	   public Optional<Musician> readOne(Long id) throws MusicianNotFoundException
	    {
	        return Optional.ofNullable(this.MusicianRepo.findById(id).orElseThrow(()->new MusicianNotFoundException())) ;
}
}



