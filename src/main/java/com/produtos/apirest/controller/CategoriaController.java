package com.produtos.apirest.controller;

import com.produtos.apirest.model.Categoria;
import com.produtos.apirest.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public ResponseEntity getCategorias() {
        return ResponseEntity.ok(categoriaRepository.findAll());
    }

    @PostMapping()
    public ResponseEntity adicionarCategoria(@RequestBody Categoria categoria) {
        categoriaRepository.save(categoria);
        return ResponseEntity.ok(categoria);
    }
}
