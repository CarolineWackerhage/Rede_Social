package com.blusoft.rede_social.controllers;

import com.blusoft.rede_social.entities.Curtida;
import com.blusoft.rede_social.repositories.CurtidaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curtidas")
public class CurtidaController {

    private final CurtidaRepository curtidaRepository;

    public CurtidaController(CurtidaRepository curtidaRepository) {
        this.curtidaRepository = curtidaRepository;
    }

    @GetMapping
    public List<Curtida> listarTodas() {
        return this.curtidaRepository.findAll();
    }

    @PostMapping
    public Curtida criar(
            @RequestBody Curtida curtida) {
        return this.curtidaRepository.save(curtida);
    }

    @GetMapping("/{id}")
    public Curtida buscarPorId(
            @PathVariable Integer id) {
        return this.curtidaRepository.findById(id).get();
    }

    @DeleteMapping("/{id}")
    public void deletar(
            @PathVariable Integer id) {
        curtidaRepository.deleteById(id);
    }
}