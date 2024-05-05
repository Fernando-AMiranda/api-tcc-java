package com.example.crud.controllers;

import com.example.crud.dtos.CepInfoDTO;
import com.example.crud.dtos.RespostaRotinaDTO;
import com.example.crud.entities.CepData;
import com.example.crud.services.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cep")
public class CepController {

    @Autowired
    private CepService service;

    @GetMapping
    public ResponseEntity<RespostaRotinaDTO> getAllCeps() {

        return ResponseEntity.ok(  service.rotinaInserirCeps());
    }

}
