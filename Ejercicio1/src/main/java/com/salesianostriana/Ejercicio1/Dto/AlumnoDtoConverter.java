package com.salesianostriana.Ejercicio1.Dto;

import com.salesianostriana.Ejercicio1.Model.Alumno;
import org.springframework.stereotype.Component;

@Component
public class AlumnoDtoConverter {

    public Alumno createAlumnoDtoToAlumno(CreateAlumnoDto c) {
        return new Alumno(
                c.getNombre(),
                c.getApellido1(),
                c.getApellido2(),
                c.getTelefono(),
                c.getEmail()

        );
    }





}
