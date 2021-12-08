package com.challengejava.challengejava.dao;

import com.challengejava.challengejava.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDAO extends JpaRepository<Usuario,Long> {
}
