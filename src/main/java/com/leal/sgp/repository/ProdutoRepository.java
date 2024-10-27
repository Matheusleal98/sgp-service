package com.leal.sgp.repository;

import com.leal.sgp.entidades.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, UUID> {

    @Query("SELECT p FROM Produto p WHERE p.categoria.seq = :categoriaSeq")
    List<Produto> findByProdutosByCategoria(UUID categoriaSeq);

    List<Produto> findByRestauranteSeqAndCategoriaSeq(UUID restauranteSeq, UUID categoriaSeq);

}
