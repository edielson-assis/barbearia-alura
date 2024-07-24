package br.com.alura.barbearia.controller;

import java.net.URI;

import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.alura.barbearia.dto.UsuarioDto;
import br.com.alura.barbearia.model.Usuario;
import br.com.alura.barbearia.service.UsuarioService;
import lombok.AllArgsConstructor;

@RequestMapping(value = "/usuarios")
@AllArgsConstructor
@RestController
public class UsuarioController {
    
    private final UsuarioService service;

    @PostMapping
    public ResponseEntity<UsuarioDto> post(@RequestBody UsuarioDto usuarioDto) {
        Usuario usuario = new Usuario();
        BeanUtils.copyProperties(usuarioDto, usuario);
        service.post(usuario);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}").buildAndExpand(usuario.getId()).toUri();
        return ResponseEntity.created(uri).body(usuarioDto);
    }
}