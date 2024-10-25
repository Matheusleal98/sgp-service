package com.leal.sgp.controller;

import com.leal.sgp.entidades.Produto;
import com.leal.sgp.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<Produto>> listarProdutosComDesconto() {
        return (ResponseEntity<List<Produto>>) this.produtoService.listarProdutosComDesconto();
    }
}
