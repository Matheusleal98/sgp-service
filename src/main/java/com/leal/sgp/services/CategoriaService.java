package com.leal.sgp.services;

import com.leal.sgp.dto.CategoriaResponseDTO;
import com.leal.sgp.entidades.Categoria;
import com.leal.sgp.entidades.Produto;
import com.leal.sgp.entidades.Restaurante;
import com.leal.sgp.repository.CategoriaRepository;
import com.leal.sgp.repository.ProdutoRepository;
import com.leal.sgp.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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

    public List<Categoria> buscarTodas() {
        return this.categoriaRepository.findAll();
    }

    public CategoriaResponseDTO buscarPorId(UUID categoriaSeq) {
        Categoria c = categoriaRepository.findById(categoriaSeq)
                .orElseThrow(() -> new IllegalArgumentException("Categoria não encontrado."));

        List<Produto> produtos = produtoRepository.findByProdutosByCategoria(c.getSeq());
        List<Restaurante> restaurantes = restauranteRepository.findByRestaurantesByCategoria(c.getSeq());

        if (produtos.isEmpty() && restaurantes.isEmpty()) {
            throw new IllegalArgumentException("Nenhum produto e restaurante disponível para essa categoria.");
        }

        CategoriaResponseDTO categoriaResponse = new CategoriaResponseDTO(c.getSeq(), c.getNome(), produtos, restaurantes);

        return categoriaResponse;
    }
}

