package com.leal.sgp.services;

import com.leal.sgp.entidades.Produto;
import com.leal.sgp.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarProdutosComDesconto() {

        List<Produto> todosProdutos = produtoRepository.findAll();

        List<Produto> produtosDesconto = todosProdutos.stream()
                .filter(produto -> produto.getDesconto() > 0)
                .sorted(Comparator.comparing(Produto::getDesconto).reversed())
                .collect(Collectors.toList());

        return produtosDesconto;
    }
}
