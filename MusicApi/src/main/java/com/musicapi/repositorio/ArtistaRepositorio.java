package com.musicapi.repositorio;

import com.musicapi.model.Artista;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArtistaRepositorio {

    private List<Artista> artistas = new ArrayList<>();
    private int contadorId = 1;

    public Artista guardar(Artista artista){
        artista.setArtistaId((long) contadorId);
        contadorId++;
        artistas.add(artista);

        return artista;
    }

    public List<Artista> obtenerTodos(){return artistas;}


    // Obtener por id
    public Artista obtenerPorId(Long id){
        for(Artista artista : artistas){

            if(artista.getArtistaId().equals(id)){
                return artista;

            }
        }

        return null;
    }

    public boolean eliminar(Long id){
        Artista artista = obtenerPorId(id);

        if(artista != null){

            artistas.remove(artista);
            return true;
        }
        return false;
    }

    public Artista actualizar(Long id, Artista artistaActualizado){
        Artista artista = obtenerPorId(id);

        if(artista != null){

            artista.setNombre(artistaActualizado.getNombre());
            artista.setSolitsta(artistaActualizado.getSolitsta());
            artista.setGeneroPrincipal(artistaActualizado.getGeneroPrincipal());

            return artista;
        }

        return null;

    }

}