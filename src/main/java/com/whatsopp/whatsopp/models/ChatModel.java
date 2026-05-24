package com.whatsopp.whatsopp.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ChatModel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long chat_id;
    private Date chat_fecha_creacion;
    private String chat_nombre;
    public Long getChat_id() {
        return chat_id;
    }
    public void setChat_id(Long chat_id) {
        this.chat_id = chat_id;
    }
    public Date getChat_fecha_creacion() {
        return chat_fecha_creacion;
    }
    public void setChat_fecha_creacion(Date chat_fecha_creacion) {
        this.chat_fecha_creacion = chat_fecha_creacion;
    }
    public String getChat_nombre() {
        return chat_nombre;
    }
    public void setChat_nombre(String chat_nombre) {
        this.chat_nombre = chat_nombre;
    }
    
    
}
