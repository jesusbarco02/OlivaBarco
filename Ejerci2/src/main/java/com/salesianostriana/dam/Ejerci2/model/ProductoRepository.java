package com.salesianostriana.dam.Ejerci2.model;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository
        extends JpaRepository<Producto, Long> {
}