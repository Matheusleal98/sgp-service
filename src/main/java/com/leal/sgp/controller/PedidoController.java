package com.leal.sgp.controller;

import com.leal.sgp.entidades.Pedido;
import com.leal.sgp.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

//    @PostMapping
//    public ResponseEntity<Pedido> criarPedido(@RequestParam UUID usuario, @RequestBody List<UUID> produtos, @RequestBody List<Integer> quantidades) {
//        Pedido pedido = pedidoService.criarPedido(usuario,produtos,quantidades);
//        return ResponseEntity.ok(pedido);
//    }
}
