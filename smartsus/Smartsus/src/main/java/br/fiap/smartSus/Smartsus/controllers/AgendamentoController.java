package br.fiap.smartSus.Smartsus.controllers;

import br.fiap.smartSus.Smartsus.model.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/usuarios/teste")    
public class AgendamentoController {

    @PostMapping
    public ResponseEntity<AgendamentoModel> cadastrarCartaoTeste() {
        AgendamentoModel agendamentoModel = new AgendamentoModel( "Fiap Clinica", "98.99", "01/01/2024" ,1, 1, 1);

        return ResponseEntity.ok(agendamentoModel);
    }
}