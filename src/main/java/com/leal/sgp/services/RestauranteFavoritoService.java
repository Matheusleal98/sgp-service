package com.leal.sgp.services;

import com.leal.sgp.repository.RestauranteFavoritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestauranteFavoritoService {

    @Autowired
    private RestauranteFavoritoRepository restauranteFavoritoRepository;
}
