package com.leal.sgp.services;

import com.leal.sgp.entidades.Categoria;
import com.leal.sgp.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> buscarTodas() {
        return this.categoriaRepository.findAll();
    }

    public Categoria buscarPorId(UUID seq) {
        return this.categoriaRepository.findById(seq)
                .orElse(null);
    }
}

