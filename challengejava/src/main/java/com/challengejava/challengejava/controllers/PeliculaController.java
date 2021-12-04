package com.challengejava.challengejava.controllers;

import com.challengejava.challengejava.models.Genero;
import com.challengejava.challengejava.models.Pelicula;
import com.challengejava.challengejava.models.Personaje;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PeliculaController {


    public List<Genero> getGeneros(){
        List<Genero> generos = new ArrayList<>();

        Genero genero1 = new Genero("Drama","img");
        Genero genero2 = new Genero("Ciencia Ficcion","img");
        Genero genero3 = new Genero("Terror","img");
        Genero genero4 = new Genero("infantil","img");

        generos.add(genero1);
        generos.add(genero2);
        generos.add(genero3);
        generos.add(genero4);


        return generos;
    }


    @RequestMapping(value = "movies")
    public List<Pelicula>getPeliculas() {
        List<Pelicula> peliculas = new ArrayList<>();

        personajeController personaje = new personajeController();


        Pelicula pelicula1 =new Pelicula("img","Forest Gump","1904",5, personaje.getPersonaje(),getGeneros());

        peliculas.add(pelicula1);
        return peliculas;
    }

}
