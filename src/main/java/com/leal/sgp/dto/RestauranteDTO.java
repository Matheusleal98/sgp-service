package com.leal.sgp.dto;

import com.leal.sgp.entidades.Categoria;
import com.leal.sgp.entidades.Produto;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class RestauranteDTO {

    private UUID seq;
    private String nome;
    private String imageUrl;
    private BigDecimal valorEntrega;
    private Integer tempoEntregaMin;
    private Double avaliacao;
    private Categoria categoria;
    private List<Produto> produtos;

    public RestauranteDTO(UUID seq, String nome, String imageUrl, BigDecimal valorEntrega,
                          Integer tempoEntregaMin, Double avaliacao, Categoria categoria, List<Produto> produtos){
        this.seq = seq;
        this.nome = nome;
        this.imageUrl = imageUrl;
        this.valorEntrega = valorEntrega;
        this.tempoEntregaMin = tempoEntregaMin;
        this.avaliacao = avaliacao;
        this.categoria = categoria;
        this.produtos = produtos;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public BigDecimal getValorEntrega() {
        return valorEntrega;
    }

    public void setValorEntrega(BigDecimal valorEntrega) {
        this.valorEntrega = valorEntrega;
    }

    public Integer getTempoEntregaMin() {
        return tempoEntregaMin;
    }

    public void setTempoEntregaMin(Integer tempoEntregaMin) {
        this.tempoEntregaMin = tempoEntregaMin;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
