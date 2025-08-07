package com.blusoft.rede_social.controllers;

import com.blusoft.rede_social.entities.Comentario;
import com.blusoft.rede_social.repositories.ComentarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {

    private final ComentarioRepository comentarioRepository;

    public ComentarioController(ComentarioRepository comentarioRepository) {
        this.comentarioRepository = comentarioRepository;
    }

    @GetMapping
    public List<Comentario> listarTodos() {
        return this.comentarioRepository.findAll();
    }

    @PostMapping
    public Comentario criar(
            @RequestBody Comentario comentario) {
        return this.comentarioRepository.save(comentario);
    }

    @GetMapping("/{id}")
    public Comentario buscarPorId(
            @PathVariable Integer id) {
        return this.comentarioRepository.findById(id).get();
    }

    @DeleteMapping("/{id}")
    public void deletar(
            @PathVariable Integer id) {
        comentarioRepository.deleteById(id);
    }
}
