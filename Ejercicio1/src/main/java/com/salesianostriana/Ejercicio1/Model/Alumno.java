package com.salesianostriana.Ejercicio1.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
@Data
@NoArgsConstructor
public class Alumno {

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;


    private String apellido1;
    private String apellido2;
    private Long telefono;
    private String email;

    @ManyToOne
    private Direccion direccion;

    @ManyToOne
    private Curso curso;


    public Alumno(String nombre, String apellido1, String apellido2, Long telefono, String email) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.curso = curso;
    }

}
