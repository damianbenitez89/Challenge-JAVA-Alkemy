package com.challengejava.challengejava.controllers;

import com.challengejava.challengejava.models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @RequestMapping(value = "/auth/register")
    public void registrar(Usuario usuario){

    }

    @RequestMapping(value = "/auth/login")
    public boolean login(Usuario usuario){

        return true;
    }
}
