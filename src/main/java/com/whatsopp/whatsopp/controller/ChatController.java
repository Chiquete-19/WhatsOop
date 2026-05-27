package com.whatsopp.whatsopp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whatsopp.whatsopp.models.ChatModel;
import com.whatsopp.whatsopp.models.ChatParticipanteModel;
import com.whatsopp.whatsopp.models.UsuarioModel;
import com.whatsopp.whatsopp.service.ChatParticipanteService;
import com.whatsopp.whatsopp.service.ChatService;
import com.whatsopp.whatsopp.service.UsuarioService;
import com.whatsopp.whatsopp.Dtos.UsuarioDto;
import com.whatsopp.whatsopp.Dtos.ChatDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/chats")
public class ChatController {

    @Autowired
    private ChatService chatService;
    @Autowired
    private ChatParticipanteService chatParticipanteService;
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<ChatDto> getChats(@RequestBody UsuarioDto usuarioRequest) {
        UsuarioModel usuario =  usuarioService.getUsuarioById(usuarioRequest.getUsuario_id());
        List<ChatParticipanteModel> chatsParticipantes = chatParticipanteService.getChatParticipanteByUsuario(usuario);
        if(chatsParticipantes!=null){
            return chatsParticipantes.stream().map(chat-> new ChatDto(chat.getChat().getChat_id(),chat.getChat().getChat_nombre(),chat.getChat().getChat_tipo(),chat.getChat().getChat_fecha_ultima_modificacion())).toList();
        }
        return null;
    }
    
}
