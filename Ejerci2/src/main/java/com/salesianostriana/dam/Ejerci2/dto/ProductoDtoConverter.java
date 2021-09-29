package com.salesianostriana.dam.Ejerci2.dto;

import com.salesianostriana.dam.Ejerci2.model.Producto;

public class ProductoDtoConverter {

    public Producto createProductoDtoToProducto (Producto p) {
        return new Producto(
                p.getNombre(),
                p.getDesc(),
                p.getPvp(),
                p.getImagenes()
        );
    }

    public GetProductoDto monumentoToGetMonumentoDto(Producto p) {

        GetProductoDto result = new GetProductoDto();
        result.setNombre(p.getNombre());
        result.setDesc(p.getDesc());
        result.setImagenes(p.getImagenes());

        return result;
    }


}
