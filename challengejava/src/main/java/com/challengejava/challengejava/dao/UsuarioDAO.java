package com.challengejava.challengejava.dao;

import com.challengejava.challengejava.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface UsuarioDAO  {

    Usuario verificarEmailPass(Usuario usuario);

    void crearUsuario(Usuario usuario);
}
