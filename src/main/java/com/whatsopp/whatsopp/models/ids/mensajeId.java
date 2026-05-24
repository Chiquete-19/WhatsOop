package com.whatsopp.whatsopp.models.ids;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class MensajeId implements Serializable {
    private Long contenido_id;
    private Long remitente_id;
    private Long destinatario_id;

    public MensajeId(){
        
    }

    public MensajeId(Long contenido_id, Long remitente, Long destinatario){
        this.contenido_id=contenido_id;
        this.remitente_id=remitente;
        this.destinatario_id=destinatario;
    }

    public Long getContenido_id() {
        return contenido_id;
    }

    public void setContenido_id(Long contenido_id) {
        this.contenido_id = contenido_id;
    }

    public Long getRemitente() {
        return remitente_id;
    }

    public void setRemitente(Long remitente) {
        this.remitente_id = remitente;
    }

    public Long getDestinatario() {
        return destinatario_id;
    }

    public void setDestinatario(Long destinatario) {
        this.destinatario_id = destinatario;
    }

    
}
