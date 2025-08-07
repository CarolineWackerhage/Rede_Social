package com.blusoft.rede_social.repositories;

import com.blusoft.rede_social.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}