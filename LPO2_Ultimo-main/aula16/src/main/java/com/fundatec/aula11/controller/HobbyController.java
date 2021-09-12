package com.fundatec.aula11.controller;

import com.fundatec.aula11.dominio.Hobby;
import com.fundatec.aula11.service.HobbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class HobbyController {

    @Autowired
    private HobbyService hobbyService;

    @PostMapping
    public ResponseEntity<Hobby> save(@RequestBody Hobby request){

        Hobby resultado = hobbyService.salvar(request);

        return new ResponseEntity<>(resultado, HttpStatus.CREATED);
    }
}
