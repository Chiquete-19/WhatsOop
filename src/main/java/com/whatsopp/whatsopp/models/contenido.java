package com.whatsopp.whatsopp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="contenido")
public class Contenido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contenido_id;

    @Column(nullable = false)
    private String contenido;

    public Long getContenido_id() {
        return contenido_id;
    }

    public void setContenido_id(Long contenido_id) {
        this.contenido_id = contenido_id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    
}
