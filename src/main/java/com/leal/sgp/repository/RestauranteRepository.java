package com.leal.sgp.repository;

import com.leal.sgp.entidades.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, UUID> {

    @Query("SELECT r FROM Restaurante r WHERE r.categoria.seq = :categoriaSeq")
    List<Restaurante> findByRestaurantesByCategoria(UUID categoriaSeq);
}
