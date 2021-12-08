package com.challengejava.challengejava.controllers;

import com.challengejava.challengejava.dao.PeliculaDAO;
import com.challengejava.challengejava.models.Genero;
import com.challengejava.challengejava.models.Pelicula;
import com.challengejava.challengejava.models.Personaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/")
public class PeliculaController {

    @Autowired
    private PeliculaDAO peliculaDAO;

    @PostMapping(value = "crearPelicual")
    public void guardarPelicula(@RequestBody Pelicula pelicula){
        peliculaDAO.save(pelicula);
    }

    @GetMapping(value = "movies")
    public List<Pelicula>getPeliculas() {

        return peliculaDAO.findAll();
    }
    @DeleteMapping(value = "eliminarPelicula/{id}")
    public void eliminarPelicula(@PathVariable("id") Long id){
        peliculaDAO.deleteById(id);

    }

}
