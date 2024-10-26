package com.leal.sgp.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "CATEGORIAS")
public class Categoria {

    @Id
    @Column(name = "SEQ_CATEGORIA")
    private UUID seq;

    @Column(name = "NOME_CATEGORIA")
    private String nome;

    @Column(name = "IMAGEM_URL_CATEGORIA")
    private String imagemUrl;


    public UUID getSeq() {
        return seq;
    }

    public void setSeq(UUID seq) {
        this.seq = seq;
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

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }
}
