package com.leal.sgp.entidades;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "CATEGORIAS")
public class Categoria {

    @Id
    @Column(name = "SEQ_CATEGORIA")
    private UUID seq;

    @Column(name = "NOME_CATEGORIA")
    private String nome;

    @Column(name = "IMG_URL_CATEGORIA")
    private String imagemUrl;

    @Transient
    private List<Produto> produtos;

    @Transient
    private List<Restaurante> restaurantes;

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
}
