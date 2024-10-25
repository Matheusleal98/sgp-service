package com.leal.sgp.controller;

import com.leal.sgp.dto.RestauranteDTO;
import com.leal.sgp.entidades.Restaurante;
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

    @GetMapping("/${restauranteSeq}")
    public ResponseEntity<?> getRestaurante(@PathVariable UUID restauranteSeq) {
        try {
            RestauranteDTO restaurante = this.restauranteService.getRestaurante(restauranteSeq);
            return ResponseEntity.ok(restaurante);
        } catch (NotFoundException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    public ResponseEntity<List<Restaurante>> listarRestauranteComAvaliacao() {
        return (ResponseEntity<List<Restaurante>>) this.restauranteService.listarRestauranteComAvaliacao();
    }

}
