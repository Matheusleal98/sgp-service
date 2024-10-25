package com.leal.sgp.repository;

import com.leal.sgp.entidades.PedidoProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PedidoProdutoRepository extends JpaRepository<PedidoProduto, UUID> {
}
