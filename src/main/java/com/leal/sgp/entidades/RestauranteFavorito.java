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
    private Usuario seqUsuario;

    @ManyToOne
    @JoinColumn(name = "SEQ_RESTAURANTE", referencedColumnName = "SEQ")
    private Restaurante seqRestaurante;

    public UUID getSeq() {
        return seq;
    }

    public void setSeq(UUID seq) {
        this.seq = seq;
    }

    public Usuario getSeqUsuario() {
        return seqUsuario;
    }

    public void setSeqUsuario(Usuario seqUsuario) {
        this.seqUsuario = seqUsuario;
    }

    public Restaurante getSeqRestaurante() {
        return seqRestaurante;
    }

    public void setSeqRestaurante(Restaurante seqRestaurante) {
        this.seqRestaurante = seqRestaurante;
    }
}
