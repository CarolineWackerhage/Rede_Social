package com.blusoft.rede_social.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Postagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String conteudo;
    private LocalDate dataCriacao;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Usuario autor;

    @OneToMany(mappedBy = "postagem", cascade = CascadeType.ALL)
    private List<Comentario> comentarios;

    @OneToMany(mappedBy = "postagem", cascade = CascadeType.ALL)
    private List<Curtida> curtidas;

    public List<Curtida> getCurtidas() {
        return curtidas;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public Usuario getAutor() {
        return autor;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public String getConteudo() {
        return conteudo;
    }

    public Integer getId() {
        return id;
    }

    public void setCurtidas(List<Curtida> curtidas) {
        this.curtidas = curtidas;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}