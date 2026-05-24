package com.whatsopp.whatsopp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.whatsopp.whatsopp.repository.MensajeRepository;

public class MensajeService {
    @Autowired
    private MensajeRepository mensajeRepository;
}
