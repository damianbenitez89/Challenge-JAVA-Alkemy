package com.challengejava.challengejava.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;
    @Column
    private String nombre;
    @Column
    private String email;
    @Column
    private String contraceña;

}
