package com.musicapi.servicio;

import com.musicapi.model.Artista;
import com.musicapi.repositorio.ArtistaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistaServicio {

    @Autowired
    private ArtistaRepositorio repositorio;



    public Artista guardar(Artista artista){

        return repositorio.guardar(artista);

    }



    public List<Artista> obtenerTodos(){

        return repositorio.obtenerTodos();

    }



    public Artista obtenerPorId(Long id){

        return repositorio.obtenerPorId(id);

    }



    public boolean eliminar(Long id){

        return repositorio.eliminar(id);

    }



    public Artista actualizar(Long id, Artista artista){

        return repositorio.actualizar(id, artista);

    }

}