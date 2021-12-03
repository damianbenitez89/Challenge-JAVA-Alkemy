package com.challengejava.challengejava.controllers;

import com.challengejava.challengejava.models.Personaje;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class personajeController {

    @RequestMapping(value = "characters")
    public List<Personaje> getPersonaje(){

        List<Personaje>personajes = new ArrayList<>();

        Personaje personaje1 = new Personaje("imagen","Iron Man",50,75.3,"viejo trolo");
        Personaje personaje2 = new Personaje("imagen","hulk",35,150.0,"viejo verde");
        Personaje personaje3 = new Personaje("imagen","capitan america",40,81.3," gaspi");

        personajes.add(personaje1);
        personajes.add(personaje2);
        personajes.add(personaje3);

        return personajes;
    }
}
