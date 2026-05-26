package com.whatsopp.whatsopp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whatsopp.whatsopp.models.ChatModel;
import com.whatsopp.whatsopp.service.ChatParticipanteService;
import com.whatsopp.whatsopp.service.ChatService;
import com.whatsopp.whatsopp.Dtos.UsuarioDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/chats")
public class ChatController {

    @Autowired
    private ChatService chatService;
    @Autowired
    private ChatParticipanteService chatParticipanteService;

    @GetMapping
    public List<ChatModel> getChats(@RequestBody UsuarioDto usuario) {
        chatParticipanteService.getChatParticipanteByUsuario_Id(usuario.getUsuario_id());
        chatService.getChatsByUsuario_Id(usuario.getUsuario_id());
        return null;
    }
    
}
