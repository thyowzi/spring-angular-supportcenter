package com.douglas.centralsupport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglas.centralsupport.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{
}
