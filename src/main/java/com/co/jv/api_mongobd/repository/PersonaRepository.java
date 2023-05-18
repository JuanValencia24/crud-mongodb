package com.co.jv.api_mongobd.repository;

import com.co.jv.api_mongobd.entity.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends MongoRepository<Persona,String> {
}
