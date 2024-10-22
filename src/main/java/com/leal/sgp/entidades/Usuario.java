package com.leal.sgp.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "USUARIOS")
public class Usuario {

    @Id
    @Column(name = "SEQ")
    private UUID seq;

    @Column(name = "NOME_USUARIO")
    private String nome;

    @Column(name = "URL_IMG_USUARIO")
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
