package com.musicapi.model;


public class Artista {

    private String nombre;
    private Boolean solitsta; // true: solista, false: grupo
    private String generoPrincipal;

    public Artista(String nombre, Boolean solitsta, String generoPrincipal) {
        this.nombre = nombre;
        this.solitsta = solitsta;
        this.generoPrincipal = generoPrincipal;
    }


    private Long artistaId; // no se manda en el request, se genera al guardar

    public Long getArtistaId() {
        return artistaId;
    }

    public void setArtistaId(Long artistaId) {
        this.artistaId = artistaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getSolitsta() {
        return solitsta;
    }

    public void setSolitsta(Boolean solitsta) {
        this.solitsta = solitsta;
    }

    public String getGeneroPrincipal() {
        return generoPrincipal;
    }

    public void setGeneroPrincipal(String generoPrincipal) {
        this.generoPrincipal = generoPrincipal;
    }
}
