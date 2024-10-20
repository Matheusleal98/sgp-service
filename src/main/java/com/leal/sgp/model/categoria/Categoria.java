package com.leal.sgp.model.categoria;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "CATEGORIA")
public class Categoria {

    @Id
    private UUID id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "IMG_URL")
    private String imagemUrl;

    public Categoria(String nome, String imagemUrl) {
        this.nome = nome;
        this.imagemUrl = imagemUrl;
    }

    public Categoria(){}

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imageUrl) {
        this.imagemUrl = imageUrl;
    }
}
