package com.company;

import javafx.scene.effect.SepiaTone;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class VideoClub {
    private Set<Film> films = new HashSet();

    public boolean agregarFilm(Film cFilm){
        return films.add(cFilm);
    }

    public Film buscarFilm(String titulo){
        Iterator<Film> iterator = films.iterator();

        while (iterator.hasNext()){
            if(iterator.next().getTitulo().equals(titulo)){
                return iterator.next();
            }
        }
        return null;
    }
}
