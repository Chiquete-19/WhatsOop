package com.whatsopp.whatsopp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.whatsopp.whatsopp.models.ChatModel;

@Repository
public interface ChatRepository extends CrudRepository<ChatModel, Long> {
    
}
