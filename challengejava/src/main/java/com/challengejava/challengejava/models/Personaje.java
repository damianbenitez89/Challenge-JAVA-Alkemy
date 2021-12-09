package com.challengejava.challengejava.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Personaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;
    @Column
    private String imagen;
    @Column
    private String nombre;
    @Column
    private int edad;
    @Column
    private Double peso;
    @Column
    private String historia;

    @ManyToMany(mappedBy = "personajes")
    private List<Pelicula> peliculas= new ArrayList<Pelicula>();

    public Personaje() {}

    public Personaje(String imagen, String nombre, int edad, Double peso, String historia) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;

    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getImagen() {return imagen;}
    public void setImagen(String imagen) {this.imagen = imagen;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}

    public Double getPeso() {return peso;}
    public void setPeso(Double peso) {this.peso = peso;}

    public String getHistoria() {return historia;}
    public void setHistoria(String historia) {this.historia = historia;}

    public List<Pelicula> getPeliculas() {return peliculas;}
    public void setPeliculas(List<Pelicula> peliculas) {this.peliculas = peliculas;}
}
