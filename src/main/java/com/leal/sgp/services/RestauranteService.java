package com.leal.sgp.services;

import com.leal.sgp.entidades.Categoria;
import com.leal.sgp.entidades.Restaurante;
import com.leal.sgp.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RestauranteService {

    @Autowired
    private RestauranteRepository restauranteRepository;
    @Autowired
    private CategoriaService categoriaService;

    public Restaurante buscarRestaurantePorId(UUID seq) {
        return this.restauranteRepository.findById(seq)
                .orElse(null);
    }

    public List<Restaurante> listarRestaurantesPorCategoria(UUID seqCategoria) {

        Categoria categoriaEncotrada = this.categoriaService.buscarPorId(seqCategoria);

        if (categoriaEncotrada == null) {
            throw new RuntimeException("Categoria não encontrada.");
        }

        return this.restauranteRepository.findAllByCategoria(seqCategoria);
    }
}
