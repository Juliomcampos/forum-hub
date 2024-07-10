package br.com.alura.forum_hub.topico;


import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoTopico(
        String mensagem,
        String curso,
        String titulo){
}
