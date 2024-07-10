package br.com.alura.forum_hub.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record DadosCriarTopico(
        @NotNull
        String titulo,
        @NotNull
        String mensagem,
        @NotNull
        String autor,
        @NotBlank
        String curso){
}
