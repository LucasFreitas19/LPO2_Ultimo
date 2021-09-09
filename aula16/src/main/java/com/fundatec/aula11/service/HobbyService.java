package com.fundatec.aula11.service;

import com.fundatec.aula11.dominio.Hobby;
import com.fundatec.aula11.repositorio.HobbyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HobbyService {

   @Autowired
   private HobbyRepository hobbyRepository;

    public Hobby salvar(Hobby hobby_p_salvar){

        Hobby salvo = hobbyRepository.save(hobby_p_salvar);

        return salvo;
    }
}
