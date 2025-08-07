package com.blusoft.rede_social.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String texto;
    private LocalDate dataCriacao;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Usuario autor;

    @ManyToOne
    @JoinColumn(name = "postagem_id")
    private Postagem postagem;

    public Integer getId() {
        return id;
    }

    public Postagem getPostagem() {
        return postagem;
    }

    public Usuario getAutor() {
        return autor;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public String getTexto() {
        return texto;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public void setPostagem(Postagem postagem) {
        this.postagem = postagem;
    }
}