package com.whatsopp.whatsopp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.whatsopp.whatsopp.Dtos.ContenidoDto;
import com.whatsopp.whatsopp.Dtos.MensajeDto;
import com.whatsopp.whatsopp.models.Contenido;
import com.whatsopp.whatsopp.repository.ContenidoRepository;

@Service
public class ContenidoService {

    @Autowired
    private ContenidoRepository contenidoRepository;
    
    @Transactional
    public ContenidoDto save(Contenido contenido){
        return new ContenidoDto(contenidoRepository.save(contenido));
    }

    public ContenidoDto obtenerMensaje(MensajeDto mensaje){
        Contenido contenido = new Contenido();
        contenido.setContenido(mensaje.getContenido());
        return this.save(contenido);
    }
}
