package com.blusoft.rede_social.dtos;

import com.blusoft.rede_social.entities.Usuario;

public class UsuarioResponseDTO {
    private String nome;
    private String email;

    public UsuarioResponseDTO(Usuario usuario) {
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}