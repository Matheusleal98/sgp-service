package com.leal.sgp.services;

import com.leal.sgp.dto.ProdutoDTO;
import com.leal.sgp.entidades.Produto;
import com.leal.sgp.exception.NotFoundException;
import com.leal.sgp.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoDTO> listarProdutosComDesconto() {
        List<Produto> produtos = this.produtoRepository.findByProdutosWithDesconto();

        return produtos.stream()
                .map(this::mapearParaProdutoDTO)
                .collect(Collectors.toList());
    }

    public ProdutoDTO mapearParaProdutoDTO(Produto produto) {
        return new ProdutoDTO(
                produto.getSeq(),
                produto.getNome(),
                produto.getDescricao(),
                produto.getImagemUrl(),
                produto.getPreco().doubleValue(),
                produto.getDesconto(),
                produto.getRestaurante(),
                produto.getCategoria()
        );
    }

    public ProdutoDTO getProdutoBySeq(UUID seq) {
        Produto produto = produtoRepository.findById(seq)
                .orElseThrow(() -> new NotFoundException("Peoduto não encontrado."));

        return new ProdutoDTO(
                produto.getSeq(),
                produto.getNome(),
                produto.getDescricao(),
                produto.getImagemUrl(),
                produto.getPreco().doubleValue(),
                produto.getDesconto(),
                produto.getRestaurante(),
                produto.getCategoria());
    }
}
