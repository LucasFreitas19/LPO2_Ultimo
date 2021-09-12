package com.fundatec.aula11.service;

import com.fundatec.aula11.dominio.Contato;
import com.fundatec.aula11.repositorio.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    public Contato salvar(Contato contato_p_salvar){

        Contato salvo = contatoRepository.save(contato_p_salvar);
        return salvo;
    }

    public Contato FindById(Long id){

        Contato resultado = contatoRepository.getById(id);

        return resultado;
    }
}
