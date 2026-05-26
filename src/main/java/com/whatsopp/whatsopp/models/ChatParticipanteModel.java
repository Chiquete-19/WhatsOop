package com.whatsopp.whatsopp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ChatParticipanteModel {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long chat_participante_id;
    @ManyToOne
    @JoinColumn(name="chat")
    private ChatModel chat;
    @ManyToOne
    @JoinColumn(name="usuario")
    private UsuarioModel usuario;

    public Long getChat_participante_id() {
        return chat_participante_id;
    }
    public void setChat_participante_id(Long chat_participante_id) {
        this.chat_participante_id = chat_participante_id;
    }
    public ChatModel getChat() {
        return chat;
    }
    public void setChat(ChatModel chat) {
        this.chat = chat;
    }
    public UsuarioModel getUsuario_id() {
        return usuario;
    }
    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }

    
}
