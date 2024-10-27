package com.leal.sgp.services;

import com.leal.sgp.dto.CategoriaDTO;
import com.leal.sgp.dto.RestauranteDTO;
import com.leal.sgp.entidades.Categoria;
import com.leal.sgp.entidades.Produto;
import com.leal.sgp.entidades.Restaurante;
import com.leal.sgp.exception.NotFoundException;
import com.leal.sgp.repository.CategoriaRepository;
import com.leal.sgp.repository.ProdutoRepository;
import com.leal.sgp.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private RestauranteRepository restauranteRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Categoria> ListarCategorias() {
        return this.categoriaRepository.findAll();
    }

    public CategoriaDTO consultarCategoriaComSeq(UUID categoriaSeq) {
        Categoria categoria = categoriaRepository.findById(categoriaSeq)
                .orElseThrow(() -> new NotFoundException("Categoria não encontrada."));

        List<Restaurante> restaurantes = restauranteRepository.findByCategoriaSeq(categoriaSeq);
        List<RestauranteDTO> restaurantesDTO = new ArrayList<>();

        for (Restaurante restaurante : restaurantes) {
            List<Produto> produtos = produtoRepository.findByRestauranteSeqAndCategoriaSeq(restaurante.getSeq(), categoriaSeq);

            RestauranteDTO restauranteDTO = new RestauranteDTO(
                    restaurante.getSeq(),
                    restaurante.getNome(),
                    restaurante.getImagemUrl(),
                    restaurante.getValorEntrega(),
                    restaurante.getTempoEntregaMin(),
                    restaurante.getAvaliacao(),
                    produtos
            );

            restaurantesDTO.add(restauranteDTO);
        }

        return new CategoriaDTO(categoria.getSeq(), categoria.getNome(), categoria.getImagemUrl(), restaurantesDTO);
    }
}

