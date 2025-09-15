package com.Raphael.Prova.Controller;

import com.Raphael.Prova.ENTITY.Estudante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/Estudante")
public class Controuller {
    @Autowired
    private Service estudanteService;
    private Service estudanteService1;

    @GetMapping
    public List<Estudante> findAll() {
        return estudanteService1
    }
    @RequestMapping
        public  Estudante criar (@RequestMapping){
        return estudanteService();

    }
    @DeleteMapping
    public Estudante

}