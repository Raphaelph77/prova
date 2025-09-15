package com.Raphael.Prova.Service;

import com.Raphael.Prova.ENTITY.Estudante;
import com.Raphael.Prova.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class service {
    @Autowired
    private Repository repository;

    public Estudante criarEstudante(Estudante estudante) {
        return repository.save(estudante);
    }

    public List<Estudante> findAll() {
        return repository.findAll();
    }

}