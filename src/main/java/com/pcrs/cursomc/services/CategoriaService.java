package com.pcrs.cursomc.services;

import com.pcrs.cursomc.domain.Categoria;
import com.pcrs.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElse(null);
    }
}
