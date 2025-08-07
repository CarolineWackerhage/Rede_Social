package com.blusoft.rede_social.dtos;

public class ComentarioDTO {
    private Long id;
    private Long postagemId;
    private Long usuarioId;
    private String conteudo;

    public Long getId() {
        return id;
    }

    public Long getPostagemId() {
        return postagemId;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPostagemId(Long postagemId) {
        this.postagemId = postagemId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
