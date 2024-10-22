package com.leal.sgp.repository;

import com.leal.sgp.entidades.RestauranteFavorito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RestauranteFavoritoRepository extends JpaRepository<RestauranteFavorito, UUID> {

    List<RestauranteFavorito> findBySeqUsuario(UUID seqUsuario);

    boolean existsBySeqUsuarioAndSeqRestaurante(UUID seqUsuario, UUID seqRestaurante);
}
