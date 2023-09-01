package com.douglas.centralsupport.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.douglas.centralsupport.domain.Chamado;
import com.douglas.centralsupport.repositories.ChamadoRepository;
import com.douglas.centralsupport.services.exceptions.ObjectnotFoundException;

@Service
public class ChamadoService {
	  
	@Autowired 
	private ChamadoRepository repository;
	
	public Chamado findById(Integer id) {
		Optional<Chamado> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado! ID: " + id));
	}
}