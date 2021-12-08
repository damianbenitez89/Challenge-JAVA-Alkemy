package com.challengejava.challengejava.dao;

import com.challengejava.challengejava.models.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonajeDAO extends JpaRepository<Personaje,Long> {
}
