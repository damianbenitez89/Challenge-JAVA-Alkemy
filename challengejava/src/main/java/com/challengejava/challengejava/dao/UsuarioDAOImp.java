package com.challengejava.challengejava.dao;

import com.challengejava.challengejava.models.Usuario;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UsuarioDAOImp implements UsuarioDAO{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Usuario verificarEmailPass(Usuario usuario) {
        String query = "FROM Usuario WHERE email = :email and password = :password";

         List<Usuario>lista = entityManager.createQuery(query)
                 .setParameter("email", usuario.getEmail())
                 .setParameter("password",usuario.getContraseña())
                 .getResultList();

         if(lista.isEmpty()) {
             return null;
         }
         return lista.get(0);
    }

    @Override
    public void crearUsuario(Usuario usuario) {
        entityManager.merge(usuario);
    }
}
