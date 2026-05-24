package com.whatsopp.whatsopp.Dtos;

public class MensajeDto {
    private String contenido;
    private Long remitente_id;
    private Long destinatario_id;
    
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public Long getRemitente_id() {
        return remitente_id;
    }
    public void setRemitente_id(Long remitente_id) {
        this.remitente_id = remitente_id;
    }
    public Long getDestinatario_id() {
        return destinatario_id;
    }
    public void setDestinatario_id(Long destinatario_id) {
        this.destinatario_id = destinatario_id;
    }

    
}
