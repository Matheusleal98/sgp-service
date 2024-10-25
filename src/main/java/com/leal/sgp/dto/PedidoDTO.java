package com.leal.sgp.dto;

import com.leal.sgp.entidades.Restaurante;
import com.leal.sgp.entidades.Usuario;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

public class PedidoDTO {

    private UUID seq;
    private Usuario usuario;
    private Restaurante restaurante;
    private BigDecimal taxaDeEntrega;
    private Integer tempoDeEntrega;
    private BigDecimal subtotalPreco;
    private BigDecimal totalPreco;
    private BigDecimal totalDesconto;
    private String status;
    private Date dataPedido;

    public UUID getSeq() {
        return seq;
    }

    public void setSeq(UUID seq) {
        this.seq = seq;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public BigDecimal getTaxaDeEntrega() {
        return taxaDeEntrega;
    }

    public void setTaxaDeEntrega(BigDecimal taxaDeEntrega) {
        this.taxaDeEntrega = taxaDeEntrega;
    }

    public Integer getTempoDeEntrega() {
        return tempoDeEntrega;
    }

    public void setTempoDeEntrega(Integer tempoDeEntrega) {
        this.tempoDeEntrega = tempoDeEntrega;
    }

    public BigDecimal getSubtotalPreco() {
        return subtotalPreco;
    }

    public void setSubtotalPreco(BigDecimal subtotalPreco) {
        this.subtotalPreco = subtotalPreco;
    }

    public BigDecimal getTotalPreco() {
        return totalPreco;
    }

    public void setTotalPreco(BigDecimal totalPreco) {
        this.totalPreco = totalPreco;
    }

    public BigDecimal getTotalDesconto() {
        return totalDesconto;
    }

    public void setTotalDesconto(BigDecimal totalDesconto) {
        this.totalDesconto = totalDesconto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }
}
