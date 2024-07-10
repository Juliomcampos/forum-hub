package br.com.alura.forum_hub.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    private String autor;
    private String curso;

    private LocalDateTime dataCriacao;

    @Enumerated(EnumType.STRING)
    private StatusDoTopico status = StatusDoTopico.NAO_RESPONDIDO;

    boolean ativo;

    public Topico(DadosCriarTopico dados) {
        this.ativo = true;
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.autor = dados.autor();
        this.curso = dados.curso();
        this.dataCriacao = LocalDateTime.now(); // Definindo a data de criação
        this.status = StatusDoTopico.NAO_RESPONDIDO; // Definindo o status inicial
    }

    public void atualizarInformacoes(DadosAtualizacaoTopico dados) {
        if (dados.mensagem() != null) {
            this.mensagem = dados.mensagem();
        }
        if (dados.curso() != null) {
            this.curso = dados.curso();
        }
        if (dados.titulo() != null) {
            this.titulo = dados.titulo();
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}