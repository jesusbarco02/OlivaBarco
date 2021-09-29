package com.salesianostriana.Ejercicio1.Dto;

import com.salesianostriana.Ejercicio1.Model.Alumno;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class CreateAlumnoDto {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private Long telefono;
    private String email;
    private Long direccionId;




    public GetAlumnoDto alumnoToGetAlumnoDto(Alumno a) {

        GetAlumnoDto result = new GetAlumnoDto();
        result.setNombre(a.getNombre());
        result.setApellidos(String.format("%s (%s)",a.getApellido1(),getApellido2()));
        result.setTelefono(a.getTelefono());
        result.setEmail(a.getEmail());
        result.setCurso(a.getCurso());
        result.setDireccion(a.getDireccion());

        return result;
    }
}


