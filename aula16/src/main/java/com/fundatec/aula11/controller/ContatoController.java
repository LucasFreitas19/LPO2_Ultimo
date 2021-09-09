package com.fundatec.aula11.controller;

import com.fundatec.aula11.dominio.Contato;
import com.fundatec.aula11.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ContatoController {

    @Autowired
    private ContatoService contatoService;

    @PostMapping("contato")
    public ResponseEntity<Contato> salvar(@RequestBody Contato contato_body){

        Contato resultado = contatoService.salvar(contato_body);

        return new ResponseEntity<>(resultado, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    private ResponseEntity<Contato> findById(@PathVariable Long id){

        Contato resultado = contatoService.FindById(id);

        return new ResponseEntity<>(resultado,HttpStatus.OK);
    }

}
