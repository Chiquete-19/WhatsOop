package com.whatsopp.whatsopp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whatsopp.whatsopp.Dtos.ContenidoDto;
import com.whatsopp.whatsopp.Dtos.MensajeDto;
import com.whatsopp.whatsopp.models.Mensaje;
import com.whatsopp.whatsopp.service.MensajeService;

@RestController
@RequestMapping("/mensajes")
public class MensajeController {

    @Autowired
    private MensajeService mensajeService;

    @PostMapping("/enviar")
    public String enviarMensaje(@RequestBody MensajeDto mensaje){
        String resultado=mensajeService.enviarMensaje(mensaje);
        if("bien".equals(resultado)){

            return "Mensaje enviado correctamente";
        }
        return "mal";
    }
}
