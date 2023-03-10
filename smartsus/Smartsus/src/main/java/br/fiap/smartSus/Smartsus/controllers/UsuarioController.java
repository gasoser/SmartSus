package br.fiap.smartSus.Smartsus.controllers;

import br.fiap.smartSus.Smartsus.model.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/usuarios/teste")    
public class UsuarioController<T extends UsuarioModel> {
    

    @PostMapping
    public ResponseEntity<UsuarioModel> cadastrarUsuarioTeste() {
        UsuarioModel usuarioModel = new UsuarioModel("usuario@teste.com", "senha123","(99) 99999-9999", "1");

        return ResponseEntity.ok(usuarioModel);
    }
}



