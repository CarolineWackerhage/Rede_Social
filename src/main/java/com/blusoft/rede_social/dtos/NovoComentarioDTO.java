package com.blusoft.rede_social.dtos;

public class NovoComentarioDTO {
    private Long postagemId;
    private Long usuarioId;
    private String conteudo;

    public Long getPostagemId() {
        return postagemId;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public String getConteudo() {
        return conteudo;
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
