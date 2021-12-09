package com.challengejava.challengejava.controllers;

import com.challengejava.challengejava.repositories.PersonajeRepository;
import com.challengejava.challengejava.models.Personaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class PersonajeController {

    @Autowired
    private PersonajeRepository personajeDAO ;

    @PostMapping(value="characters")
    public void guardar(@RequestBody Personaje personaje){

        personajeDAO.save(personaje);
    }

    @GetMapping(value = "characters")
    public List<Personaje> getPersonaje(){
        return personajeDAO.findAll();
    }

    @DeleteMapping(value = "borrar/{id}")
    public void eliminar(@PathVariable("id") Long id){
        personajeDAO.deleteById(id);
    }

    @PutMapping(value = "actualizar")
    public void actualizar(@RequestBody Personaje personaje){
         personajeDAO.save(personaje);

    }
}
