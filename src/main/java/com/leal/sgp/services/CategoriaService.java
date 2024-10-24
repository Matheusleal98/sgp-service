package com.leal.sgp.services;

import com.leal.sgp.dto.CategoriaDTO;
import com.leal.sgp.entidades.Categoria;
import com.leal.sgp.entidades.Produto;
import com.leal.sgp.entidades.Restaurante;
import com.leal.sgp.exception.NotFoundException;
import com.leal.sgp.repository.CategoriaRepository;
import com.leal.sgp.repository.ProdutoRepository;
import com.leal.sgp.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    public CategoriaDTO buscarPorId(UUID categoriaSeq) {
        Categoria c = categoriaRepository.findById(categoriaSeq)
                .orElseThrow(() -> new NotFoundException("Categoria não encontrado."));

        List<Produto> produtos = produtoRepository.findByProdutosByCategoria(c.getSeq());
        List<Restaurante> restaurantes = restauranteRepository.findByRestaurantesByCategoria(c.getSeq());

        CategoriaDTO categoriaDTO = new CategoriaDTO(c.getSeq(), c.getNome(), produtos, restaurantes);

        return categoriaDTO;
    }
}

