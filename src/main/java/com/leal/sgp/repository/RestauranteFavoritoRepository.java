package com.leal.sgp.repository;

import com.leal.sgp.entidades.RestauranteFavorito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RestauranteFavoritoRepository extends JpaRepository<RestauranteFavorito, UUID> {

    List<RestauranteFavorito> findByUsuario_Seq(UUID usuario);

    boolean existsByUsuario_SeqAndRestaurante_Seq(UUID usuario, UUID restaurante);
}
