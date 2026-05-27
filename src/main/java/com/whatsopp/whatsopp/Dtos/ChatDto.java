package com.whatsopp.whatsopp.Dtos;

public class ChatDto {

    private Long chat_id;
    private String chat_nombre;
    private String chat_tipo;
    private String chat_fecha_ultima_actualizacion;

    public ChatDto(){

    }

    public ChatDto(Long chat_id, String chat_nombre, String chat_tipo, String chat_fecha_ultima_actualizacion) {
        this.chat_id = chat_id;
        this.chat_nombre = chat_nombre;
        this.chat_tipo = chat_tipo;
        this.chat_fecha_ultima_actualizacion = chat_fecha_ultima_actualizacion;
    }

    public Long getChat_id() {
        return chat_id;
    }

    public void setChat_id(Long chat_id) {
        this.chat_id = chat_id;
    }

    public String getChat_nombre() {
        return chat_nombre;
    }

    public void setChat_nombre(String chat_nombre) {
        this.chat_nombre = chat_nombre;
    }

    public String getChat_tipo() {
        return chat_tipo;
    }

    public void setChat_tipo(String chat_tipo) {
        this.chat_tipo = chat_tipo;
    }

    public String getChat_fecha_ultima_actualizacion() {
        return chat_fecha_ultima_actualizacion;
    }

    public void setChat_fecha_ultima_actualizacion(String chat_fecha_ultima_actualizacion) {
        this.chat_fecha_ultima_actualizacion = chat_fecha_ultima_actualizacion;
    }
    
}
