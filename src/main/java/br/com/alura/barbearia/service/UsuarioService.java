package br.com.alura.barbearia.service;

import org.springframework.stereotype.Service;

import br.com.alura.barbearia.model.Usuario;
import br.com.alura.barbearia.repository.UsuarioRepository;
import br.com.alura.barbearia.service.exception.DataBaseException;

@Service
public class UsuarioService {
    
    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario post(Usuario usuario) {
        try {
            return repository.save(usuario);
        }
        catch (RuntimeException e) {
            throw new DataBaseException(e.getMessage());
        }
    }
}