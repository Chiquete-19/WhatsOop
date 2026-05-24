package com.whatsopp.whatsopp.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import com.whatsopp.whatsopp.models.ids.MensajeId;

@Entity
@Table(name="mensaje")
public class Mensaje {
    @EmbeddedId
    private MensajeId mensajeId;
    
    private String c;
}
