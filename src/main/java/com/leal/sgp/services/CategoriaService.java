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

    public List<CategoriaDTO> ListarCategorias() {

        List<Categoria> categorias = null;
        categorias = this.categoriaRepository.findAll();

        List<CategoriaDTO> categoriasDto = new ArrayList<>();

        for (Categoria categoria : categorias) {
             CategoriaDTO categoriaDTO = new CategoriaDTO(
                     categoria.getSeq(),
                     categoria.getNome(),
                     categoria.getImagemUrl()
             );

            categoriasDto.add(categoriaDTO);
        }

        return categoriasDto;
    }

    public CategoriaDTO consultarCategoriaComSeq(UUID categoriaSeq) {
        Categoria categoria = categoriaRepository.findById(categoriaSeq)
                .orElseThrow(() -> new NotFoundException("Categoria não encontrada."));

        List<Restaurante> restaurantes = this.restauranteRepository.findByRestaurantesByCategoriaSeq(categoria.getSeq());
        List<Produto> produtos = this.produtoRepository.findByProdutosByCategoria(categoria.getSeq());

        return new CategoriaDTO(
                categoria.getSeq(),
                categoria.getNome(),
                categoria.getImagemUrl(),
                restaurantes,
                produtos);
    }
}

