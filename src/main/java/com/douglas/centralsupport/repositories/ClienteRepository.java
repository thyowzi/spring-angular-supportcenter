package com.douglas.centralsupport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglas.centralsupport.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
}
