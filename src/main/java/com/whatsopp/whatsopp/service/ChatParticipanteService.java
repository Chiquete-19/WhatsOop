package com.whatsopp.whatsopp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whatsopp.whatsopp.models.ChatParticipanteModel;
import com.whatsopp.whatsopp.repository.ChatParticipanteRepository;

@Service
public class ChatParticipanteService {

    @Autowired
    private ChatParticipanteRepository repository;

    public List<ChatParticipanteModel> getChatParticipanteByUsuario_Id(Long usuario_id){
        return repository.findByUsuario_Id(usuario_id);
    }
}
