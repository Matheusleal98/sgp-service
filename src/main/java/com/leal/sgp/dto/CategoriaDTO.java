package com.leal.sgp.dto;

import com.leal.sgp.entidades.Produto;
import com.leal.sgp.entidades.Restaurante;

import java.util.List;
import java.util.UUID;

public class CategoriaDTO {

    private UUID categoriaSeq;
    private String nomeCategoria;
    private String imageUrl;
    private List<RestauranteDTO> restaurantes;

    public CategoriaDTO(UUID categoriaSeq, String nomeCategoria, String imageUrl, List<RestauranteDTO> restaurantes) {
        this.categoriaSeq = categoriaSeq;
        this.nomeCategoria = nomeCategoria;
        this.imageUrl = imageUrl;
        this.restaurantes = restaurantes;
    }

    public CategoriaDTO(UUID categoriaSeq, String nomeCategoria, String imageUrl){
        this.categoriaSeq = categoriaSeq;
        this.nomeCategoria = nomeCategoria;
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public UUID getCategoriaSeq() {
        return categoriaSeq;
    }

    public void setCategoriaSeq(UUID categoriaSeq) {
        this.categoriaSeq = categoriaSeq;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public List<RestauranteDTO> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(List<RestauranteDTO> restaurantes) {
        this.restaurantes = restaurantes;
    }
}
