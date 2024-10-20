package com.leal.sgp.services;

import com.leal.sgp.model.categoria.Categoria;
import com.leal.sgp.model.restaurante.Restaurante;
import com.leal.sgp.repository.RestauranteRepository;
import jakarta.persistence.EntityNotFoundException;
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

    public Restaurante buscarRestaurantePorId(UUID id) {
        return this.restauranteRepository.findById(id)
                .orElse(null);
    }

    public List<Restaurante> listarRestaurantesPorCategoria(UUID categoriaId) {

        Categoria categoriaEncotrada = this.categoriaService.buscarPorId(categoriaId);

        if (categoriaEncotrada == null) {
            throw new RuntimeException("Categoria não encontrada.");
        }

        return this.restauranteRepository.findAllByCategoria(categoriaId);
    }
}
