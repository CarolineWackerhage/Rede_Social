package com.blusoft.rede_social.entities;

import jakarta.persistence.*;

@Entity
public class Curtida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "postagem_id")
    private Postagem postagem;

    public Integer getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Postagem getPostagem() {
        return postagem;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setPostagem(Postagem postagem) {
        this.postagem = postagem;
    }
}
