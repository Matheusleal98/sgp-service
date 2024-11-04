package com.leal.sgp.controller;

import com.leal.sgp.dto.ProdutoDTO;
import com.leal.sgp.dto.RestauranteDTO;
import com.leal.sgp.exception.NotFoundException;
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

    @GetMapping("/{seq}")
    public ResponseEntity<?> getRestaurante(@PathVariable UUID seq) {
        try {
            RestauranteDTO restaurante = this.restauranteService.getRestaurante(seq);
            return ResponseEntity.ok(restaurante);
        } catch (NotFoundException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/recomendado")
    public ResponseEntity<?> listarRestaurantesRecomendado() {
        List<RestauranteDTO> restaurantes = this.restauranteService.listarRestauranteComAvaliacao();

        return ResponseEntity.ok(restaurantes);
    }

    @GetMapping("/{seq}/produtos")
    public ResponseEntity<?> listarProdutosByRestaurante(@PathVariable UUID seq) {
        List<ProdutoDTO> produtos = this.restauranteService.listarProdutosByRestaurante(seq);

        return ResponseEntity.ok(produtos);
    }

}
