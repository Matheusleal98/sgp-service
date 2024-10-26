package com.leal.sgp.entidades;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "PRODUTOS")
public class Produto {

    @Id
    @Column(name = "SEQ_PRODUTO")
    private UUID seq;

    @Column(name = "NOME_PRODUTO")
    private String nome;

    @Column(name = "DESC_PRODUTO")
    private String descricao;

    @Column(name = "IMAGEM_URL_PRODUTO")
    private String imagemUrl;

    @Column(name = "PRECO")
    private BigDecimal preco;

    @Column(name = "DESCONTO")
    private int desconto;

    @ManyToOne
    @JoinColumn(name = "SEQ_RESTAURANTE")
    private Restaurante restaurante;

    @ManyToOne
    @JoinColumn(name = "SEQ_CATEGORIA")
    private Categoria categoria;

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

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
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
