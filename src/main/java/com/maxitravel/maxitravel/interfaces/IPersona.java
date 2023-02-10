package com.maxitravel.maxitravel.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.maxitravel.maxitravel.modelo.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona,Integer>{
    
}
