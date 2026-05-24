package com.whatsopp.whatsopp.models;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import com.whatsopp.whatsopp.models.ids.mensajeId;

@Entity
@Table(name="mensaje")
public class mensaje {
    @EmbeddedId
    private mensajeId mensajeId;
    
}
