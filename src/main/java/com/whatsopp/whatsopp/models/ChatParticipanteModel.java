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
    @JoinColumn(name="chat_id")
    private ChatModel chat_id;
    @ManyToOne
    @JoinColumn(name="usuario_id")
    private UsuarioModel usuario_id;
}
