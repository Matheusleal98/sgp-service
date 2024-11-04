package com.leal.sgp.dto;

import com.leal.sgp.entidades.Categoria;
import com.leal.sgp.entidades.Restaurante;

import java.util.UUID;

public class ProdutoDTO {

    private UUID seq;
    private String nome;
    private String descricao;
    private String imagemUrl;
    private double preco;
    private int desconto;
    private Restaurante restaurante;
    private Categoria categoria;

    public ProdutoDTO(UUID seq, String nome, String descricao, String imagemUrl, double preco, int desconto, Restaurante restaurante, Categoria categoria) {
        this.seq = seq;
        this.nome = nome;
        this.descricao = descricao;
        this.imagemUrl = imagemUrl;
        this.preco = preco;
        this.desconto = desconto;
        this.restaurante = restaurante;
        this.categoria = categoria;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
