package com.whatsopp.whatsopp.Dtos;

public class UsuarioDto {

    private Long usuario_id;
    private Long usuario_telefono;
    
    public UsuarioDto(){

    }

    public UsuarioDto(Long usuario_id, Long usuario_telefono) {
        this.usuario_id = usuario_id;
        this.usuario_telefono = usuario_telefono;
    }

    public Long getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Long usuario_id) {
        this.usuario_id = usuario_id;
    }

    public Long getUsuario_telefono() {
        return usuario_telefono;
    }

    public void setUsuario_telefono(Long usuario_telefono) {
        this.usuario_telefono = usuario_telefono;
    }
}
