package com.whatsopp.whatsopp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.whatsopp.whatsopp.models.ChatParticipanteModel;
import com.whatsopp.whatsopp.models.UsuarioModel;

@Repository
public interface ChatParticipanteRepository extends CrudRepository<ChatParticipanteModel,Long>{


    public List<ChatParticipanteModel>findByUsuario(UsuarioModel usuario);
}
