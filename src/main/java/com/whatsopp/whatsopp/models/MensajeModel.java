package com.whatsopp.whatsopp.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class MensajeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mensaje_id;

    @ManyToOne
    @JoinColumn
    private UsuarioModel remitente;

    private Date mensaje_fecha_envio;
    private String mensaje_contenido;
    public Long getMensaje_id() {
        return mensaje_id;
    }
    public void setMensaje_id(Long mensaje_id) {
        this.mensaje_id = mensaje_id;
    }
    public UsuarioModel getRemitente() {
        return remitente;
    }
    public void setRemitente(UsuarioModel remitente) {
        this.remitente = remitente;
    }
    public Date getMensaje_fecha_envio() {
        return mensaje_fecha_envio;
    }
    public void setMensaje_fecha_envio(Date mensaje_fecha_envio) {
        this.mensaje_fecha_envio = mensaje_fecha_envio;
    }
    public String getMensaje_contenido() {
        return mensaje_contenido;
    }
    public void setMensaje_contenido(String mensaje_contenido) {
        this.mensaje_contenido = mensaje_contenido;
    }
    


}
