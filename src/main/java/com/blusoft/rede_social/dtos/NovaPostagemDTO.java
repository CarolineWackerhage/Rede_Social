package com.blusoft.rede_social.dtos;

import java.time.LocalDate;

public class NovaPostagemDTO {
    private Long usuarioId;
    private String conteudo;
    private LocalDate data;

    public Long getUsuarioId() {
        return usuarioId;
    }

    public String getConteudo() {
        return conteudo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
