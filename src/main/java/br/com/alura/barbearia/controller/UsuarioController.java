package br.com.alura.barbearia.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.alura.barbearia.model.Usuario;
import br.com.alura.barbearia.service.UsuarioService;

@CrossOrigin("*")
@RequestMapping(value = "/usuarios")
@RestController
public class UsuarioController {
    
    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Usuario> post(@RequestBody Usuario usuario) {
        Usuario obj = service.post(usuario);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}