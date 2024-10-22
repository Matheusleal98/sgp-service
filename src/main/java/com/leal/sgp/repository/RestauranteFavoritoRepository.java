package com.leal.sgp.repository;

import com.leal.sgp.entidades.RestauranteFavorito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RestauranteFavoritoRepository extends JpaRepository<RestauranteFavorito, UUID> {
}
