package com.leal.sgp.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "PRODUTOS")
public class Produto {

    @Id
    @Column(name = "SEQ")
    private UUID seq;

    @Column(name = "NOME_PRODUTO")
    private String nome;

    @Column(name = "DESC_PRODUTO")
    private String descricao;

    @Column(name = "URL_IMAGEM_PRODUTO")
    private String imagemUrl;

    @Column(name = "VLR_PRECO_PRODUTO")
    private BigDecimal preco;

    @Column(name = "DESCONTO_PRODUTO")
    private int desconto;

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
}
