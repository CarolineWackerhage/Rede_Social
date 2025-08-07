package com.blusoft.rede_social.dtos;


public class CurtidaDTO {
    private Long id;
    private Long postagemId;
    private Long usuarioId;

    public Long getId() {
        return id;
    }

    public Long getPostagemId() {
        return postagemId;
    }

    public Long getUsuarioId() {
        return usuarioId;
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
}
