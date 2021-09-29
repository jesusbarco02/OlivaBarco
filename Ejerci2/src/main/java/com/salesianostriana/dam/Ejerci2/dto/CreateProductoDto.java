package com.salesianostriana.dam.Ejerci2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductoDto {


    private String nombre;
    private String desc;
    private double pvp;
    private List<String> imagenes;
    private Long categoriaId;
}
