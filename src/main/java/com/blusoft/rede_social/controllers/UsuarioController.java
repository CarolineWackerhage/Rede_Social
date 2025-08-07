package com.blusoft.rede_social.controllers;

import com.blusoft.rede_social.dtos.NovoUsuarioDTO;
import com.blusoft.rede_social.entities.Usuario;
import com.blusoft.rede_social.repositories.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping
    public List<Usuario> listarTodos() {
        return this.usuarioRepository.findAll();
    }


    @PostMapping
    public Usuario criar(
            @RequestBody NovoUsuarioDTO dto) {
        Usuario usuario = new Usuario();
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setDataCadastro(LocalDate.now());
        return this.usuarioRepository.save(usuario);
    }


//    @PostMapping
//    public Usuario criar(
//            @RequestBody Usuario usuario) {
//        usuario.setDataCadastro(LocalDate.now());
//        this.usuarioRepository.save(usuario);
//        return usuario;
//    }


    @GetMapping("/{id}")
    public Usuario buscarPorId(
            @PathVariable Integer id) {
        return this.usuarioRepository.findById(id).get();
    }

    @DeleteMapping("/{id}")
    public void deletar(
            @PathVariable Integer id) {
        usuarioRepository.deleteById(id);
    }
}