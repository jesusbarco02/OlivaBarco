package com.salesianostriana.Ejercicio1.Controller;

import com.salesianostriana.Ejercicio1.Dto.AlumnoDtoConverter;
import com.salesianostriana.Ejercicio1.Dto.CreateAlumnoDto;
import com.salesianostriana.Ejercicio1.Dto.GetAlumnoDto;
import com.salesianostriana.Ejercicio1.Model.Alumno;
import com.salesianostriana.Ejercicio1.Model.AlumnoRepositorio;
import com.salesianostriana.Ejercicio1.Model.Curso;
import com.salesianostriana.Ejercicio1.Model.CursoRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/alumno")
public class AlumnoController {

    private final AlumnoRepositorio alumnoRepositorio;
    private final AlumnoDtoConverter dtoConverter;
    private final CursoRepositorio cursoRepositorio;

    @GetMapping("/")
    public ResponseEntity<List<Alumno>> findAll() {

        return ResponseEntity
                .ok()
                .body(alumnoRepositorio.findAll());

    }

    @PostMapping("/")
    //public ResponseEntity<Monumento> create(@RequestBody Monumento nuevo) {
    public ResponseEntity<Alumno> create(@RequestBody CreateAlumnoDto dto) {



        Alumno nuevo = dtoConverter.createAlumnoDtoToAlumno(dto);




        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(alumnoRepositorio.save(nuevo));

    }


}
