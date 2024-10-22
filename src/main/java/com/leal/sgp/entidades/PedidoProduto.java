package com.leal.sgp.entidades;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "PEDIDOS_PRODUTOS")
public class PedidoProduto {

    @Id
    @Column(name = "SEQ")
    private UUID seq;

    @ManyToOne
    @JoinColumn(name = "SEQ_PEDIDO", referencedColumnName = "SEQ")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "SEQ_PRODUTO", referencedColumnName = "SEQ")
    private Produto produto;

    @Column(name = "QTD_PRODUTO")
    private Integer quantidade;

    @Column(name = "VLR_UNITARIO")
    private BigDecimal precoUnitario;

    public UUID getSeq() {
        return seq;
    }

    public void setSeq(UUID seq) {
        this.seq = seq;
    }

    public Pedido getPedido(Pedido pedido) {
        return this.pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
