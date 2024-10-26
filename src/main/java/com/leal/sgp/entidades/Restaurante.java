package com.leal.sgp.entidades;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "RESTAURANTES")
public class Restaurante {

    @Id
    @Column(name = "SEQ_RESTAURANTE")
    private UUID seq;

    @Column(name = "NOME_RESTAURANTE")
    private String nome;

    @Column(name = "IMAGEM_URL_RESTAURANTE")
    private String imagemUrl;

    @Column(name = "VL_ENTREGA")
    private BigDecimal valorEntrega;

    @Column(name = "MIN_ENTREGA")
    private Integer tempoEntregaMin;

    @Column(name = "AVALIACAO")
    private double avaliacao;

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

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
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

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
