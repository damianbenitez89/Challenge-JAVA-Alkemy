package com.challengejava.challengejava.dao;

import com.challengejava.challengejava.models.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PeliculaDAO extends JpaRepository<Pelicula,Long> {
}
