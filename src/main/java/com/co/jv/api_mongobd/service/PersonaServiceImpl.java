package com.co.jv.api_mongobd.service;

import com.co.jv.api_mongobd.entity.Persona;
import com.co.jv.api_mongobd.repository.PersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonaServiceImpl implements PersonaService{
    private final PersonaRepository personaRepository;

    @Transactional
    public void save (Persona persona){
        personaRepository.save(persona);
    }

    @Transactional(readOnly = true)
    public List<Persona> findAll(){
        return personaRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Persona> findById(String id){
        return personaRepository.findById(id);
    }

    @Transactional
    public void deleteById(String id){
        personaRepository.deleteById(id);
    }
}
