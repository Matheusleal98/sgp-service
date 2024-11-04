package com.leal.sgp.controller;

import com.leal.sgp.dto.ProdutoDTO;
import com.leal.sgp.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/desconto")
    public ResponseEntity<?> listarProdutosComDesconto() {
        List<ProdutoDTO> produtos = this.produtoService.listarProdutosComDesconto();
        return ResponseEntity.ok(produtos);
    }

    @GetMapping("/{seq}")
    public ResponseEntity<?> buscarPorSeq(@PathVariable UUID seq){
        ProdutoDTO produto = this.produtoService.getProdutoBySeq(seq);

        return ResponseEntity.ok(produto);
    }
}
