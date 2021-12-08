package com.challengejava.challengejava.controllers;

import com.challengejava.challengejava.dao.UsuarioDAO;
import com.challengejava.challengejava.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "auth")
public class AuthController {

    @Autowired
    private UsuarioDAO usuarioDAO;

    @PostMapping(value = "register")
    public void registrar(@RequestBody Usuario usuario){
        usuarioDAO.save(usuario);


    }

    @PostMapping(value = "login")
    public boolean login(Usuario usuario){

        return true;
    }
}
