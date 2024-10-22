package com.leal.sgp.controller;

import com.leal.sgp.entidades.Restaurante;
import com.leal.sgp.services.RestauranteService;
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
@RequestMapping("/restaurante")
public class RestauranteController {

    @Autowired
    private RestauranteService restauranteService;

    @GetMapping("/categoria/{seqCategoria}")
    public ResponseEntity<?> buscarRestaurantesPorCategoria(@PathVariable UUID seqCategoria) {
        try {
            List<Restaurante> restaurantes = this.restauranteService.listarRestaurantesPorCategoria(seqCategoria);

            if (restaurantes.isEmpty()) {
                return ResponseEntity.badRequest().body("Nenhum restaurante encontrado para a categoria: " + seqCategoria);
            }

            return ResponseEntity.ok(restaurantes);
        } catch (RuntimeException ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
        }
    }


}
