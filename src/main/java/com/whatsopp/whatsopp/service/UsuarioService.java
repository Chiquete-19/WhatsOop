package com.whatsopp.whatsopp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whatsopp.whatsopp.models.UsuarioModel;
import com.whatsopp.whatsopp.repository.UsuarioRepository;
@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public UsuarioModel getUsuarioById(Long usuario_id){
        return repository.findById(usuario_id).orElseThrow();
    }
}
