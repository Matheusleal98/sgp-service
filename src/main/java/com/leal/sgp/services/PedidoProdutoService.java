package com.leal.sgp.services;

import com.leal.sgp.dto.PedidoProdutoDTO;
import com.leal.sgp.entidades.PedidoProduto;
import com.leal.sgp.repository.PedidoProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoProdutoService {

    @Autowired
    private PedidoProdutoRepository pedidoProdutoRepository;

    public PedidoProduto criar(PedidoProdutoDTO dto) {
        PedidoProduto pedidoProduto = new PedidoProduto();
        popularDados(pedidoProduto,dto);

        return pedidoProduto;
    }

    public void popularDados(PedidoProduto pedidoProduto, PedidoProdutoDTO dto) {
        pedidoProduto.setPedido(dto.getPedido());
        pedidoProduto.setProduto(dto.getProduto());
        pedidoProduto.setQuantidade(dto.getQuantidade());
    }

    public void salvar(PedidoProduto pedidoProduto) {
        pedidoProdutoRepository.save(pedidoProduto);
    }
}
