package com.brenoricco.cursomc.services;

import java.util.Optional;

import com.brenoricco.cursomc.domains.Categoria;
import com.brenoricco.cursomc.repositories.CategoriaRepository;
import com.brenoricco.cursomc.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() ->
            new ObjectNotFoundException("Objeto não encontrado! Id: " + id +
                                        ", Tipo: " + Categoria.class.getName()));
    }

}
