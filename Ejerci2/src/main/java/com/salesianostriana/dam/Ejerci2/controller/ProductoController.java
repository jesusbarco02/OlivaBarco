package com.salesianostriana.dam.Ejerci2.controller;

import com.salesianostriana.dam.Ejerci2.dto.ProductoDtoConverter;
import com.salesianostriana.dam.Ejerci2.model.CategoriaRepository;
import com.salesianostriana.dam.Ejerci2.model.Producto;
import com.salesianostriana.dam.Ejerci2.model.ProductoRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/producto")
public class ProductoController {

    private final ProductoRepository repository;

    private final ProductoDtoConverter dtoConverter;
    private final CategoriaRepository categoriaRepository;



        @PostMapping("/")
        public ResponseEntity<Producto> create(@RequestBody Producto producto) {

            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(repository.save(producto));

        }






}
