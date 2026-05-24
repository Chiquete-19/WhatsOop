package com.whatsopp.whatsopp.Dtos;

import java.util.Optional;

import com.whatsopp.whatsopp.models.Contenido;

public class ContenidoDto {
    private Long contenido_id;
    private String contenido;

    public ContenidoDto(){
    }
    public ContenidoDto(Contenido contenido){
        this.contenido_id = contenido.getContenido_id();
        this.contenido = contenido.getContenido();
    }

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
