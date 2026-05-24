package com.whatsopp.whatsopp.repository;

import org.springframework.data.repository.CrudRepository;

import com.whatsopp.whatsopp.models.Mensaje;
import com.whatsopp.whatsopp.models.ids.MensajeId;

public interface MensajeRepository extends CrudRepository<Mensaje, MensajeId> {
    
}
