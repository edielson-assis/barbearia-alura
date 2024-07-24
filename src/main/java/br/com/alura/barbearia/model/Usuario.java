package br.com.alura.barbearia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_sobrenome", nullable = false)
    private String nomeSobrenome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String mensagem;

    @Column(name = "preferencia_contato", nullable = false)
    private String preferenciaContato;

    @Column(nullable = false)
    private String horario;

    @Column(name = "receber_novidade", nullable = false)
    private String receberNovidade;
}