package br.fiap.smartSus.Smartsus.controllers;

import br.fiap.smartSus.Smartsus.model.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/usuarios/teste")    
public class ClinicaController {

    @PostMapping
    public ResponseEntity<ClinicaModel> cadastrarClinicaTeste() {
        ClinicaModel clinicaoModel = new ClinicaModel("FIAP CLINICA", "cardiologista","61.282.051/0001-48", "98.99", '1');

        return ResponseEntity.ok(clinicaoModel);
    }
}


