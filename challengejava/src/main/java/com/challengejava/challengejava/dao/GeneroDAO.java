package com.challengejava.challengejava.dao;

import com.challengejava.challengejava.models.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface GeneroDAO extends JpaRepository<Genero,Long> {
}
