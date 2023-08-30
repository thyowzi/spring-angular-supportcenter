package com.douglas.centralsupport.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.douglas.centralsupport.domain.Tecnico;
import com.douglas.centralsupport.domain.dtos.TecnicoDTO;
import com.douglas.centralsupport.repositories.TecnicoRepository;
import com.douglas.centralsupport.services.exceptions.ObjectnotFoundException;

@Service
public class TecnicoService {
	
	@Autowired
	private TecnicoRepository repository;
	
	public Tecnico findById (Integer id) {
		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontado!\nId: " + id));
	}

	public List<Tecnico> findAll() {
		return repository.findAll();
	}

	public Tecnico create(TecnicoDTO objDTO) {
		objDTO.setId(null);
		Tecnico newOBJ = new Tecnico(objDTO);
		
		return repository.save(newOBJ);
	}
}
