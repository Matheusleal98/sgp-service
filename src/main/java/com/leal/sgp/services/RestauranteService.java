package com.leal.sgp.services;

import com.leal.sgp.dto.RestauranteDTO;
import com.leal.sgp.entidades.Produto;
import com.leal.sgp.entidades.Restaurante;
import com.leal.sgp.exception.NotFoundException;
import com.leal.sgp.repository.ProdutoRepository;
import com.leal.sgp.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class RestauranteService {

    @Autowired
    private RestauranteRepository restauranteRepository;

    @Autowired
    private ProdutoRepository produtoRepository;


    public RestauranteDTO getRestaurante(UUID seq) {

        Restaurante restaurante = restauranteRepository.findById(seq)
                .orElseThrow(() -> new NotFoundException("Restaurante não encontrado."));

        List<Produto> produtos = produtoRepository.findByProdutosByCategoria(restaurante.getSeq());

        RestauranteDTO restauranteDTO = new RestauranteDTO(restaurante.getSeq(),restaurante.getNome(),restaurante.getImagemUrl(),restaurante.getValorEntrega(),restaurante.getTempoEntregaMin(),restaurante.getAvaliacao(),restaurante.getCategoria(),produtos);

        return restauranteDTO;
    }

    public List<Restaurante> listarRestauranteComAvaliacao() {

        List<Restaurante> todosRestaurante = restauranteRepository.findAll();

        List<Restaurante> restaurantesAvaliacao = todosRestaurante.stream()
                .filter(restaurante -> restaurante.getAvaliacao() > 0)
                .sorted(Comparator.comparing(Restaurante::getAvaliacao).reversed())
                .collect(Collectors.toList());

        return restaurantesAvaliacao;
    }

}
