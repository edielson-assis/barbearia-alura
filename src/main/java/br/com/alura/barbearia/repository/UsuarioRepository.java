package br.com.alura.barbearia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.barbearia.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}