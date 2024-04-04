package com.pcrs.cursomc.resources;

import com.pcrs.cursomc.domain.Categoria;
import com.pcrs.cursomc.repositories.CategoriaRepository;
import com.pcrs.cursomc.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService service;

    @GetMapping
    public List<Categoria> listar(){

        Categoria cat1 = new Categoria(1, "Informática");
        Categoria cat2 = new Categoria(2, "Escritório");

        List<Categoria> categorias = new ArrayList<>();
        categorias.add(cat1);
        categorias.add(cat2);

        return categorias;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> find(@PathVariable Integer id) {
       Categoria obj = service.find(id);
       return ResponseEntity.ok().body(obj);

    }

}
