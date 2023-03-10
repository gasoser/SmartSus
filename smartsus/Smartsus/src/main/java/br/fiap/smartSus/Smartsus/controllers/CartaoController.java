package br.fiap.smartSus.Smartsus.controllers;

import br.fiap.smartSus.Smartsus.model.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/usuarios/teste")    
public class CartaoController {

    @PostMapping
    public ResponseEntity<CartaoModel> cadastrarCartaoTeste() {
        CartaoModel cartaoModel = new CartaoModel("1234 5678 1234 5678", "Carthanos", "2022-03-10" , '1', "123.456.789-10", "123");

        return ResponseEntity.ok(cartaoModel);
    }
}
