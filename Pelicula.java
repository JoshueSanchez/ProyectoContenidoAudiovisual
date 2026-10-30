
package com.audiovisual;

import java.util.ArrayList;
import java.util.List;

public class Pelicula extends ContenidoAudiovisual {

    private String director;
    private List<Actor> actores;

    public Pelicula(String titulo, int duracionMinutos,
                   String genero, String director) {
        super(titulo, duracionMinutos, genero);
        this.director = director;
        this.actores = new ArrayList<>();
    }

    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    public List<Actor> getActores() {
        return new ArrayList<>(actores);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Director: " + director);
        System.out.println("Actores:");
        for (Actor actor : actores) {
            System.out.println("- " + actor.getNombre());
        }
    }
}

