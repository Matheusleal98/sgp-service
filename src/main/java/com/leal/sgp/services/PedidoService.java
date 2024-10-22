package com.leal.sgp.services;

import com.leal.sgp.entidades.Pedido;
import com.leal.sgp.entidades.PedidoProduto;
import com.leal.sgp.entidades.Produto;
import com.leal.sgp.entidades.Usuario;
import com.leal.sgp.repository.PedidoRepository;
import com.leal.sgp.repository.ProdutoRepository;
import com.leal.sgp.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public Pedido criarPedido(UUID seqUsuario, List<UUID> seqProdutos, List<Integer> quantidades) {
        Pedido pedido = new Pedido();
        Usuario usuarioPedido = usuarioRepository.findById(seqUsuario)
                .orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado."));

        pedido.setUsuario(usuarioPedido);

        List<PedidoProduto> pedidoProdutos = new ArrayList<>();
        for (int i = 0; i < seqProdutos.size(); i++) {
            UUID seqProduto = seqProdutos.get(i);
            Integer quantidade = quantidades.get(i);

            Produto produto = produtoRepository.findById(seqProduto)
                    .orElseThrow(() -> new IllegalArgumentException("Produto não encontrado."));

            PedidoProduto pedidoProduto = new PedidoProduto();
            pedidoProduto.getPedido(pedido);
            pedidoProduto.setProduto(produto);
            pedidoProduto.setQuantidade(quantidade);
            pedidoProduto.setPrecoUnitario(produto.getPreco());

            pedidoProdutos.add(pedidoProduto);
        }

        pedidoRepository.save(pedido);
        return pedido;
    }
}
