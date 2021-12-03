package com.challengejava.challengejava.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;
    private String name;
    private String imagen;

    @ManyToMany(mappedBy = "generos")
    private List<Pelicula> peliculas = new ArrayList<Pelicula>();

    public Genero() {
    }

    public Genero(String name, String imagen, List<Pelicula> peliculas) {
        this.name = name;
        this.imagen = imagen;
        this.peliculas = peliculas;
    }
}
