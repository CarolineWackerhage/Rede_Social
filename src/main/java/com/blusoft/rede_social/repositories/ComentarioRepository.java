package com.blusoft.rede_social.repositories;

import com.blusoft.rede_social.entities.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface ComentarioRepository extends JpaRepository<Comentario, Integer> {
}
