package com.leal.sgp.model.restaurante;

import com.leal.sgp.model.categoria.Categoria;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "RESTAURANTES")
public class Restaurante {

    @Id
    private UUID id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "IMG_URL")
    private String imagemUrl;
    @Column(name = "VLR_ENTREGA")
    private BigDecimal valorEntrega;
    @Column(name = "MIN_ENTREGA")
    private Integer tempoEntregaMin;
    @Column(name = "AVALIACAO")
    private double avaliacao;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Restaurante(){}

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
}
