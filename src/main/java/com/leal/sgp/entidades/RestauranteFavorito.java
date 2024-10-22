package com.leal.sgp.entidades;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "RESTAURANTE_FAVORITO")
public class RestauranteFavorito {

    @Id
    @Column(name = "SEQ")
    private UUID seq;

    @ManyToOne
    @JoinColumn(name = "SEQ_USUARIO", referencedColumnName = "SEQ")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "SEQ_RESTAURANTE", referencedColumnName = "SEQ")
    private Restaurante restaurante;

    public UUID getSeq() {
        return seq;
    }

    public void setSeq(UUID seq) {
        this.seq = seq;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
}
