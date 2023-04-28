package br.com.alura.barbearia.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
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

    @Column(name = "preferencia_contato")
    private String preferenciaContato;

    private String horario;

    @Column(name = "receber_novidade")
    private String receberNovidade;
}