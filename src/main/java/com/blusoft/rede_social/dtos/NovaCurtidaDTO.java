package com.blusoft.rede_social.dtos;

public class NovaCurtidaDTO {
    private Long postagemId;
    private Long usuarioId;

    public Long getPostagemId() {
        return postagemId;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setPostagemId(Long postagemId) {
        this.postagemId = postagemId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }
}
