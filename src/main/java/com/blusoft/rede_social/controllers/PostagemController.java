package com.blusoft.rede_social.controllers;

import com.blusoft.rede_social.entities.Postagem;
import com.blusoft.rede_social.repositories.PostagemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/postagens")
public class PostagemController {

    private final PostagemRepository postagemRepository;

    public PostagemController(PostagemRepository postagemRepository) {
        this.postagemRepository = postagemRepository;
    }

    @GetMapping
    public List<Postagem> listarTodas() {
        return this.postagemRepository.findAll();
    }

    @PostMapping
    public Postagem criar(
            @RequestBody Postagem postagem) {
        return this.postagemRepository.save(postagem);
    }

    @GetMapping("/{id}")
    public Postagem buscarPorId(
            @PathVariable Integer id) {
        return this.postagemRepository.findById(id).get();
    }

    @DeleteMapping("/{id}")
    public void deletar(
            @PathVariable Integer id) {
        postagemRepository.deleteById(id);
    }
}