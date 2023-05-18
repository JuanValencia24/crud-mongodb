package com.co.jv.api_mongobd.service;

import com.co.jv.api_mongobd.entity.Persona;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface PersonaService {


    void save(Persona persona);
    List<Persona> findAll();

    Optional<Persona> findById(String id);

     void deleteById(String id);
}
