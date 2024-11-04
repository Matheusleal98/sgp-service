package com.leal.sgp.services;

import com.leal.sgp.dto.ProdutoDTO;
import com.leal.sgp.dto.RestauranteDTO;
import com.leal.sgp.entidades.Produto;
import com.leal.sgp.entidades.Restaurante;
import com.leal.sgp.exception.NotFoundException;
import com.leal.sgp.repository.ProdutoRepository;
import com.leal.sgp.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

        List<Produto> produtos = this.restauranteRepository.findProdutosByRestauranteSeq(restaurante.getSeq());

        RestauranteDTO restauranteDTO = new RestauranteDTO(restaurante.getSeq(),restaurante.getNome(),restaurante.getImagemUrl(),restaurante.getValorEntrega(),restaurante.getTempoEntregaMin(),restaurante.getAvaliacao(),produtos);

        return restauranteDTO;
    }

    public List<RestauranteDTO> listarRestauranteComAvaliacao() {

        List<RestauranteDTO> restaurantesDto = restauranteRepository.findAll().stream()
                .filter(resaturante -> resaturante.getAvaliacao() > 0)
                .map(restaurante -> new RestauranteDTO(
                        restaurante.getSeq(),
                        restaurante.getNome(),
                        restaurante.getImagemUrl(),
                        restaurante.getValorEntrega(),
                        restaurante.getTempoEntregaMin(),
                        restaurante.getAvaliacao()))
                .collect(Collectors.toList());

        return restaurantesDto;

    }

    public List<ProdutoDTO> listarProdutosByRestaurante(UUID seq) {
        List<Produto> produtos = this.restauranteRepository.findProdutosByRestauranteSeq(seq);

        return produtos.stream()
                .map(produto -> new ProdutoDTO(
                        produto.getSeq(),
                        produto.getNome(),
                        produto.getDescricao(),
                        produto.getImagemUrl(),
                        produto.getPreco().doubleValue(),
                        produto.getDesconto(),
                        produto.getRestaurante(),
                        produto.getCategoria()
                ))
                .collect(Collectors.toList());
    }
}
