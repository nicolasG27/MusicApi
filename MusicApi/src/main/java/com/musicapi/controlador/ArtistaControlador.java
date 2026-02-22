package com.musicapi.controlador;

import com.musicapi.model.Artista;
import com.musicapi.servicio.ArtistaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;





@RestController
@RequestMapping("/artistas")

public class ArtistaControlador {

    @Autowired
    private ArtistaServicio servicio;



    // Guardar artistas
    @PostMapping
    public Artista guardar(@RequestBody Artista artista){

        return servicio.guardar(artista);

    }
    // Ver a todos los artistas
    @GetMapping
    public List<Artista> obtenerTodos(){

        return servicio.obtenerTodos();

    }

    // Ver un artista en específico
    @GetMapping("/{id}")
    public Artista obtenerPorId(@PathVariable Long id){

        return servicio.obtenerPorId(id);

    }

    // Actualizar un artista

    @PutMapping("/{id}")
    public Artista actualizar(

            @PathVariable Long id,

            @RequestBody Artista artista){

        return servicio.actualizar(id, artista);

    }

    // Borrar artista
    @DeleteMapping("/{id}")
    public boolean eliminar(@PathVariable Long id){

        return servicio.eliminar(id);

    }


}