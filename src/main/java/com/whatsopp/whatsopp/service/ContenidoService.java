package com.whatsopp.whatsopp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.whatsopp.whatsopp.Dtos.ContenidoDto;
import com.whatsopp.whatsopp.models.Contenido;
import com.whatsopp.whatsopp.repository.ContenidoRepository;


public class ContenidoService {

    @Autowired
    private ContenidoRepository contenidoRepository;
    
    @Transactional
    public ContenidoDto save(Contenido contenido){
        return new ContenidoDto(contenidoRepository.save(contenido));
    }
}
