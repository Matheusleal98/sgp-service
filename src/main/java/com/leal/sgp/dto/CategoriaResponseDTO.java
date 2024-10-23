package com.leal.sgp.dto;

import com.leal.sgp.entidades.Produto;
import com.leal.sgp.entidades.Restaurante;

import java.util.List;
import java.util.UUID;

public class CategoriaResponseDTO {

    private UUID categoriaSeq;
    private String nomeCategoria;
    private List<Produto> produtos;
    private List<Restaurante> restaurantes;

    public CategoriaResponseDTO(UUID categoriaSeq, String nomeCategoria, List<Produto> produtos, List<Restaurante> restaurantes) {
        this.categoriaSeq = categoriaSeq;
        this.nomeCategoria = nomeCategoria;
        this.produtos = produtos;
        this.restaurantes = restaurantes;
    }

    public UUID getCategoriaSeq() {
        return categoriaSeq;
    }

    public void setCategoriaSeq(UUID categoriaSeq) {
        this.categoriaSeq = categoriaSeq;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(List<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
    }
}
