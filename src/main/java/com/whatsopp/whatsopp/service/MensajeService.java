package com.whatsopp.whatsopp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whatsopp.whatsopp.Dtos.ContenidoDto;
import com.whatsopp.whatsopp.Dtos.MensajeDto;
import com.whatsopp.whatsopp.models.Contenido;
import com.whatsopp.whatsopp.models.Mensaje;
import com.whatsopp.whatsopp.models.ids.MensajeId;
import com.whatsopp.whatsopp.repository.MensajeRepository;

@Service
public class MensajeService {
    @Autowired
    private MensajeRepository mensajeRepository;
    @Autowired
    private ContenidoService contenidoService;

    public String enviarMensaje(MensajeDto mensaje){
        ContenidoDto conteDto=contenidoService.obtenerMensaje(mensaje);
        MensajeId mensajeId=new MensajeId(conteDto.getContenido_id(),mensaje.getRemitente_id(),mensaje.getDestinatario_id());
        if (conteDto!=null) {
            Mensaje mensajeModel= new Mensaje();
            mensajeModel.setMensajeId(mensajeId);
            mensajeRepository.save(mensajeModel);
            return "bien";
        }
        return "mal";
    }
}
