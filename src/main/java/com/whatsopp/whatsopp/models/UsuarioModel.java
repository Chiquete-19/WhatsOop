package com.whatsopp.whatsopp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long usuario_id;

    private String usuario_nombre;
    private Long usuario_telefono;
    private String email;
    private String password;
    
    public Long getUsuario_id() {
        return usuario_id;
    }
    public void setUsuario_id(Long usuario_id) {
        this.usuario_id = usuario_id;
    }
    public String getUsuario_nombre() {
        return usuario_nombre;
    }
    public void setUsuario_nombre(String usuario_nombre) {
        this.usuario_nombre = usuario_nombre;
    }
    public Long getUsuario_telefono() {
        return usuario_telefono;
    }
    public void setUsuario_telefono(Long usuario_telefono) {
        this.usuario_telefono = usuario_telefono;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    
}
