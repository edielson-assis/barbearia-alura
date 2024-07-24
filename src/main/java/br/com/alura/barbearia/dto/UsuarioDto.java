package br.com.alura.barbearia.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record UsuarioDto(

    @NotBlank(message = "{nome.obrigatorio}") 
    @Pattern(regexp = "^[a-zA-ZÀ-ÿ\\s]+$", message = "{campo.letras}")
    @Size(min = 3, message = "'${validatedValue}' precisa ter, pelo menos, {min} caracteres.")
    String nomeSobrenome,

    @NotBlank(message = "{email.obrigatorio}") 
    @Email(message = "{email.invalido}") 
    String email,

    @NotBlank(message = "{telefone.obrigatorio}")
    @Pattern(regexp = "^(\\+\\d{1,2}\\s?)?(\\(\\d{2}\\)\\s?)?(\\d{4,5}-?\\d{4})$", message = "{telefone.numeros}")
    String telefone,

    @NotBlank(message = "{campo.obrigatorio}")
    String mensagem,

    @NotBlank(message = "{campo.obrigatorio}")
    String preferenciaContato,

    @NotBlank(message = "{campo.obrigatorio}")
    String horario,

    @NotBlank(message = "{campo.obrigatorio}")
    String receberNovidade) {}