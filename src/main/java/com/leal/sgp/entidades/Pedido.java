package com.leal.sgp.entidades;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "PEDIDOS")
public class Pedido {

    @Id
    @Column(name = "SEQ")
    private UUID seq;

    @ManyToOne
    @JoinColumn(name = "SEQ_USUARIO", referencedColumnName = "SEQ")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "SEQ_RESTAURANTE", referencedColumnName = "SEQ")
    private Restaurante restaurante;

    @Column(name = "VLR_TAXA_ENTREGA")
    private BigDecimal taxaEntrega;

    @Column(name = "DTHR_ENTREGA")
    private Integer tempoEntrega;

    @Column(name = "VLR_SUBTOTAL_PEDIDO")
    private BigDecimal subtotalPreco;

    @Column(name = "VLR_TOTAL_PEDIDO")
    private BigDecimal totalPreco;

    @Column(name = "VLR_DESCONTO")
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

    public BigDecimal getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(BigDecimal taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    public Integer getTempoEntrega() {
        return tempoEntrega;
    }

    public void setTempoEntrega(Integer tempoEntrega) {
        this.tempoEntrega = tempoEntrega;
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
