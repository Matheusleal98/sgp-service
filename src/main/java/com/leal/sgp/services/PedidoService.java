package com.leal.sgp.services;

import com.leal.sgp.dto.PedidoDTO;
import com.leal.sgp.dto.PedidoProdutoDTO;
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
import java.util.Date;
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

    @Autowired
    private PedidoProdutoService pedidoProdutoService;

    public void criarPedido(UUID seqUsuario, List<UUID> seqProdutos, List<Integer> quantidades) {

        /*
        * Verificar se o usuário está logado no sistema
        * criar um novo pedido
        * percorrer a lista de produtos e validar se os produtos são do mesmo restaurante
        * chamar o método criar da classe PedidoProduto para salvar no banco
        *
        * */

//        List<PedidoProduto> pedidoProdutos = new ArrayList<>();
//        for (int i = 0; i < seqProdutos.size(); i++) {
//            UUID seqProduto = seqProdutos.get(i);
//            Integer quantidade = quantidades.get(i);
//
//            Produto produto = produtoRepository.findById(seqProduto)
//                    .orElseThrow(() -> new IllegalArgumentException("Produto não encontrado."));
//
        //PedidoProdutoDTO pedidoProdutoDTO = PedidoProdutoDTO();
//            pedidoProduto = pedidoProdutoService.criar(pedidoProdutoDTO)
//
//            pedidoProdutos.add(pedidoProduto);
//        }
    }

    public void popularDados(Pedido pedido, PedidoDTO dto) {
        pedido.setUsuario(dto.getUsuario());
        pedido.setRestaurante(dto.getRestaurante());
        pedido.setTaxaDeEntrega(dto.getTaxaDeEntrega());
        pedido.setTempoDeEntrega(dto.getTempoDeEntrega());
        pedido.setSubtotalPreco(dto.getSubtotalPreco());
        pedido.setTotalPreco(dto.getTotalPreco());
        pedido.setStatus(dto.getStatus());
        pedido.setDataPedido(new Date());
    }
}
