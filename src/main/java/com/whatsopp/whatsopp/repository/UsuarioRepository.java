package com.whatsopp.whatsopp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.whatsopp.whatsopp.models.UsuarioModel;
@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel,Long> {

}
