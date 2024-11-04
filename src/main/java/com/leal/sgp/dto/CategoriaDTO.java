package com.leal.sgp.dto;

import com.leal.sgp.entidades.Produto;
import com.leal.sgp.entidades.Restaurante;

import java.util.List;
import java.util.UUID;

public class CategoriaDTO {

    private UUID seq;
    private String nome;
    private String imagemUrl;
    private List<Restaurante> restaurantes;
    private List<Produto> produtos;

    public CategoriaDTO(UUID seq, String nome, String imagemUrl, List<Restaurante> restaurantes, List<Produto> produtos) {
        this.seq = seq;
        this.nome = nome;
        this.imagemUrl = imagemUrl;
        this.restaurantes = restaurantes;
        this.produtos = produtos;
    }

    public CategoriaDTO(UUID seq, String nome, String imagemUrl){
        this.seq = seq;
        this.nome = nome;
        this.imagemUrl = imagemUrl;
    }

    public UUID getSeq() {
        return seq;
    }

    public void setSeq(UUID seq) {
        this.seq = seq;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }

    public List<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(List<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
