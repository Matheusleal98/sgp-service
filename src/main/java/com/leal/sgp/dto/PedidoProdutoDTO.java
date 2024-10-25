package com.leal.sgp.dto;

import com.leal.sgp.entidades.Pedido;
import com.leal.sgp.entidades.Produto;

import java.util.UUID;

public class PedidoProdutoDTO {

    private UUID seq;
    private Pedido pedido;
    private Produto produto;
    private Integer quantidade;

    public UUID getSeq() {
        return seq;
    }

    public void setSeq(UUID seq) {
        this.seq = seq;
    }

    public Pedido getPedido() {
        return pedido;
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
}
