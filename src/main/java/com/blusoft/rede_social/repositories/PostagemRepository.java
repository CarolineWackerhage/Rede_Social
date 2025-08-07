package com.blusoft.rede_social.repositories;

import com.blusoft.rede_social.entities.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface PostagemRepository extends JpaRepository<Postagem, Integer> {
}