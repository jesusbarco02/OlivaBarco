package com.salesianostriana.Ejercicio1.Dto;

import com.salesianostriana.Ejercicio1.Model.Curso;
import com.salesianostriana.Ejercicio1.Model.Direccion;
import lombok.*;

@Data
@NoArgsConstructor @AllArgsConstructor
@Builder

public class GetAlumnoDto {

    private String nombre;
    private String apellidos;
    private String email;
    private Curso curso;
    private Direccion direccion;
    private Long telefono;


}
