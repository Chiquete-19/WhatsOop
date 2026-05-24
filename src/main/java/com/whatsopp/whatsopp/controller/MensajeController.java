package com.whatsopp.whatsopp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whatsopp.whatsopp.Dtos.MensajeDto;
import com.whatsopp.whatsopp.models.Mensaje;

@RestController
@RequestMapping("/mensajes")
public class MensajeController {

    @PostMapping("/enviar")
    public String enviarMensaje(@RequestBody MensajeDto mensaje){
            
        return "";
    }
}
