package com.salesianostriana.dam.Ejerci2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    @Lob
    private String desc;

    private double pvp;

    @ElementCollection
    private List<String> imagenes;

    @ManyToOne
    private Categoria categoria;

    public Producto(String nombre, String desc, double pvp, List<String> imagenes) {
        this.nombre = nombre;
        this.desc = desc;
        this.pvp = pvp;
        this.imagenes = imagenes;
    }


}
