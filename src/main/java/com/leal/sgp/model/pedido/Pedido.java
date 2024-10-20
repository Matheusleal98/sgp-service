package com.leal.sgp.model.pedido;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "PEDIDOS")
public class Pedido {

    @Id
    private UUID id;
    @Column(name = "TX_ENT", precision = 10, scale = 2)
    private BigDecimal taxaEntrega;
    @Column(name = "TP_ENT_MIN")
    private int tempoEntrega;
    @Column(name = "SUBT_PRECO", precision = 10, scale = 2)
    private BigDecimal subtotalPrice;
    @Column(name = "T_DESCONTO", precision = 10, scale = 2)
    private BigDecimal totalDesconto;
    @Column(name = "STATUS")
    private String status;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_PEDIDO")
    private Date dataPedido;

    public Pedido(){}

    public Pedido(BigDecimal taxaEntrega, int tempoEntrega,
                  BigDecimal subtotalPrice, BigDecimal totalDesconto,
                  String status, Date dataPedido) {
        this.taxaEntrega = taxaEntrega;
        this.tempoEntrega = tempoEntrega;
        this.subtotalPrice = subtotalPrice;
        this.totalDesconto = totalDesconto;
        this.status = status;
        this.dataPedido = dataPedido;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BigDecimal getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(BigDecimal taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    public int getTempoEntrega() {
        return tempoEntrega;
    }

    public void setTempoEntrega(int tempoEntrega) {
        this.tempoEntrega = tempoEntrega;
    }

    public BigDecimal getSubtotalPrice() {
        return subtotalPrice;
    }

    public void setSubtotalPrice(BigDecimal subtotalPrice) {
        this.subtotalPrice = subtotalPrice;
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
