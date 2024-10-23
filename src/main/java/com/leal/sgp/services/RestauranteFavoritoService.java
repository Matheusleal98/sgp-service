package com.leal.sgp.services;

import com.leal.sgp.entidades.Restaurante;
import com.leal.sgp.entidades.RestauranteFavorito;
import com.leal.sgp.entidades.Usuario;
import com.leal.sgp.repository.RestauranteFavoritoRepository;
import com.leal.sgp.repository.RestauranteRepository;
import com.leal.sgp.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class RestauranteFavoritoService {

    @Autowired
    private RestauranteFavoritoRepository restauranteFavoritoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RestauranteRepository restauranteRepository;

//    public RestauranteFavorito adicionarFavorito(UUID seqUsuario, UUID seqRestaurante) {
//        if (restauranteFavoritoRepository.existsByUsuario_SeqAndRestaurante_Seq(seqUsuario,seqRestaurante)){
//            throw new IllegalArgumentException("Restaurante já está nos favoritos.");
//        }
//
//        Usuario usuario = usuarioRepository.findById(seqUsuario)
//                .orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado."));
//        Restaurante restaurante = restauranteRepository.findById(seqRestaurante)
//                .orElseThrow(() -> new IllegalArgumentException("Restaurante não encontrado."));
//
//        RestauranteFavorito favorito = new RestauranteFavorito();
//        favorito.setSeqUsuario(usuario);
//        favorito.setSeqRestaurante(restaurante);
////        favorito.setDataAdicao(LocalDateTime.now());
//
//        return restauranteFavoritoRepository.save(favorito);
//    }
//
//    public void removerFavorito(UUID seqUsuario, UUID seqRestauranteFavorito) {
//
//        RestauranteFavorito favorito = restauranteFavoritoRepository.findById(seqRestauranteFavorito)
//                .orElseThrow(() -> new IllegalArgumentException("Restaurante favorito não encontrado."));
//
//        if (!favorito.getSeqUsuario().getSeq().equals(seqUsuario)) {
//            throw new IllegalArgumentException("Usuário não autorizado a remover este restaurante favorito.");
//        }
//
//        restauranteFavoritoRepository.delete(favorito);
//    }
//
//    public List<RestauranteFavorito> listarFavoritos(UUID seqUsuario) {
//        return restauranteFavoritoRepository.findBySeqUsuario(seqUsuario);
//    }
}
