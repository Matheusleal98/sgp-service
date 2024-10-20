package com.leal.sgp.controller;

import com.leal.sgp.model.categoria.Categoria;
import com.leal.sgp.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public ResponseEntity<?> buscarTodas() {
        List<Categoria> categorias = categoriaService.buscarTodas();

        /**
         * Verifica se a lista está vazia e retorna uma respota adequada.
         */
        if (categorias.isEmpty()) {
            return new ResponseEntity<>("Nenhuma categoria encontrada.", HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(categorias, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable UUID id) {
        Categoria categoriaEncontrada = this.categoriaService.buscarPorId(id);

        /**
        * verifica se possui e retorna à categoria ou NULL
        */
        if (categoriaEncontrada == null) {
            return new ResponseEntity<>("Categoria não encontrada com id " + id, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(categoriaEncontrada, HttpStatus.OK);
    }
}
