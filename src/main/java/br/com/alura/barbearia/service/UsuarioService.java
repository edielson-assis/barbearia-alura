package br.com.alura.barbearia.service;

import org.springframework.stereotype.Service;

import br.com.alura.barbearia.model.Usuario;
import br.com.alura.barbearia.repository.UsuarioRepository;
import br.com.alura.barbearia.service.exception.DataBaseException;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UsuarioService {
    
    private final UsuarioRepository repository;

    public Usuario post(Usuario usuario) {
        try {
            return repository.save(usuario);
        }
        catch (RuntimeException e) {
            throw new DataBaseException(e.getMessage());
        }
    }
}