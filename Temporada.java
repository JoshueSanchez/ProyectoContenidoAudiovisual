package com.audiovisual;

import java.util.ArrayList;
import java.util.List;

public class Temporada {

    private int numero;
    private List<Episodio> episodios;

    public Temporada(int numero) {
        this.numero = numero;
        this.episodios = new ArrayList<>();
    }

    public void agregarEpisodio(String titulo, int duracionMinutos) {
        Episodio episodio = new Episodio(titulo, duracionMinutos);
        episodios.add(episodio);
    }

    public int getNumero() {
        return numero;
    }

    public List<Episodio> getEpisodios() {
        return new ArrayList<>(episodios);
    }

    public void mostrarInformacion() {
        System.out.println("Temporada: " + numero);
        System.out.println("Cantidad de episodios: " + episodios.size());

        for (Episodio episodio : episodios) {
            episodio.mostrarInformacion();
        }
    }
}
