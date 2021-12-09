package com.challengejava.challengejava.controllers;

import com.challengejava.challengejava.dao.UsuarioDAO;
import com.challengejava.challengejava.models.Usuario;
import com.challengejava.challengejava.utils.JWTUtil;
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
    
    @Autowired
    private JWTUtil jwtUtil;

    @PostMapping(value = "register")
    public void registrar(@RequestBody Usuario usuario){
        usuarioDAO.crearUsuario(usuario);


    }

    @PostMapping(value = "login")
    public String login(@RequestBody Usuario usuario){
        Usuario usuarioLogueado = usuarioDAO.verificarEmailPass(usuario);

        if (usuarioLogueado != null){
            String tokenJWT = jwtUtil.create(String.valueOf(usuarioLogueado.getId()),(usuarioLogueado.getEmail()));
            return tokenJWT ;
        }
        return "FAIl";

    }
}
