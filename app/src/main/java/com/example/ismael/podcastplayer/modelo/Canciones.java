package com.example.ismael.podcastplayer.modelo;

import java.util.List;

/**
 * Created by Ismael on 10/02/2018.
 */

public class Canciones extends ColeccionGenerica<Cancion>{

    private List<Cancion> canciones;

    public Canciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public <T> void add(T cancion){
        canciones.add((Cancion) cancion);
    }

    @Override
    public Cancion get(int index){
        return (Cancion) canciones.get(index);
    }

    @Override
    public int size(){
        return canciones.size();
    }
}