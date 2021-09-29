package com.salesianostriana.Ejercicio1;

import com.salesianostriana.Ejercicio1.Dto.AlumnoDtoConverter;
import com.salesianostriana.Ejercicio1.Model.AlumnoRepositorio;
import com.salesianostriana.Ejercicio1.Model.CursoRepositorio;
import com.salesianostriana.Ejercicio1.Model.Direccion;
import com.salesianostriana.Ejercicio1.Model.DireccionRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio1Application.class, args);
	}

	public CommandLineRunner crearAlumno (AlumnoRepositorio AlumnoRepositorio) {

		return args -> {
			final AlumnoRepositorio alumnoRepositorio;
			final AlumnoDtoConverter alumnoDtoConverter;
			final CursoRepositorio cursoRepositorio;
			final DireccionRepositorio direccionRepositorio;
		};
	}

}


