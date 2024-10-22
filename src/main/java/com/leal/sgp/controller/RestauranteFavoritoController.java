package com.leal.sgp.controller;

import com.leal.sgp.entidades.RestauranteFavorito;
import com.leal.sgp.services.RestauranteFavoritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/favoritos")
public class RestauranteFavoritoController {

    @Autowired
    private RestauranteFavoritoService restauranteFavoritoService;

    @PostMapping
    public ResponseEntity<RestauranteFavorito> adicionarFavorito(@RequestParam UUID seqUsuario, @RequestParam UUID seqRestaurante) {
        RestauranteFavorito favorito = restauranteFavoritoService.adicionarFavorito(seqUsuario,seqRestaurante);
        return ResponseEntity.ok(favorito);
    }

    @DeleteMapping("/{favorito}")
    public ResponseEntity<Void> removerFavorito(@RequestParam UUID seqUsuario, @PathVariable UUID favorito) {
        restauranteFavoritoService.removerFavorito(seqUsuario,favorito);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("{usuario}")
    public ResponseEntity<List<RestauranteFavorito>> listarFavoritos(@PathVariable UUID usuario) {
        List<RestauranteFavorito> favoritos = restauranteFavoritoService.listarFavoritos(usuario);
        return ResponseEntity.ok(favoritos);
    }
}
