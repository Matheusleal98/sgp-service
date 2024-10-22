package com.leal.sgp.entidades;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "PEDIDOS")
public class Pedido {

    @Id
    @Column(name = "SEQ_PEDIDO")
    private UUID seq;

    @ManyToOne
    @JoinColumn(name = "SEQ_USUARIO", referencedColumnName = "SEQ_USUARIO")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "SEQ_RESTAURANTE", referencedColumnName = "SEQ_RESTAURANTE")
    private Restaurante restaurante;

    @Column(name = "VL_ENTREGA")
    private BigDecimal taxaDeEntrega;

    @Column(name = "DTHR_ENTREGA")
    private Integer tempoDeEntrega;

    @Column(name = "VL_SUBTOTAL")
    private BigDecimal subtotalPreco;

    @Column(name = "VL_TOTAL")
    private BigDecimal totalPreco;

    @Column(name = "VL_DESCONTO")
    private BigDecimal totalDesconto;

    @Column(name = "STATUS_PEDIDO")
    private String status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DTHR_PEDIDO")
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
