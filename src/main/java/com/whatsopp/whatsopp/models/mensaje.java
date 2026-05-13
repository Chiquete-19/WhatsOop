package com.whatsopp.whatsopp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mensaje")
public class mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mensaje_id;

    @Id
    private Long mensaje_remitente;

    @Id
    private Long mensaje_destinatario;

    @Column(nullable = false)
    private Long mensaje_contenido;

    public Long getMensaje_id() {
        return mensaje_id;
    }

    public void setMensaje_id(Long mensaje_id) {
        this.mensaje_id = mensaje_id;
    }

    public Long getMensaje_remitente() {
        return mensaje_remitente;
    }

    public void setMensaje_remitente(Long mensaje_remitente) {
        this.mensaje_remitente = mensaje_remitente;
    }

    public Long getMensaje_destinatario() {
        return mensaje_destinatario;
    }

    public void setMensaje_destinatario(Long mensaje_destinatario) {
        this.mensaje_destinatario = mensaje_destinatario;
    }

    public Long getMensaje_contenido() {
        return mensaje_contenido;
    }

    public void setMensaje_contenido(Long mensaje_contenido) {
        this.mensaje_contenido = mensaje_contenido;
    }

    
}
