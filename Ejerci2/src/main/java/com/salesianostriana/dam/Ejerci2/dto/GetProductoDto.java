package com.salesianostriana.dam.Ejerci2.dto;

import com.salesianostriana.dam.Ejerci2.model.Categoria;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetProductoDto {

    private String nombre;
    private String desc;
    private List<String> imagenes;
    private Categoria categoria;

}
