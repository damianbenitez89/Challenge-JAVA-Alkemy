package com.challengejava.challengejava;

import com.challengejava.challengejava.dao.GeneroDAO;
import com.challengejava.challengejava.dao.PeliculaDAO;
import com.challengejava.challengejava.dao.PersonajeDAO;
import com.challengejava.challengejava.dao.UsuarioDAO;
import com.challengejava.challengejava.models.Genero;
import com.challengejava.challengejava.models.Pelicula;
import com.challengejava.challengejava.models.Personaje;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ChallengejavaApplication {

	public static void main(String[] args) {

		SpringApplication.run(ChallengejavaApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(PeliculaDAO peliculaDAO , GeneroDAO generoDAO , PersonajeDAO personajeDAO , UsuarioDAO usuarioDAO) {
		return (args) -> {
			Personaje personaje1 = new Personaje("URL:IMG","Iron Man",50,75.8,"el del metal");
			Personaje personaje2 = new Personaje("URL:IMG","HULK",43,120.8,"elv erde");
			Personaje personaje3 = new Personaje("URL:IMG","capitan America",35,75.8,"el rubio menemista");
			Personaje personaje4 = new Personaje("URL:IMG","Doctor Strange",50,74.4,"el de sherlock");

			personajeDAO.save(personaje1);
			personajeDAO.save(personaje2);
			personajeDAO.save(personaje3);
			personajeDAO.save(personaje4);

			Genero genero1 = new Genero( "Drama","URL:IMG-GENERO");
			Genero genero2 = new Genero( "Accion","URL:IMG-GENERO");
			Genero genero3 = new Genero( "Cuencia Ficcion","URL:IMG-GENERO");
			Genero genero4 = new Genero( "Infantil","URL:IMG-GENERO");

			generoDAO.save(genero1);
			generoDAO.save(genero2);
			generoDAO.save(genero3);
			generoDAO.save(genero4);


		};
	}

}
