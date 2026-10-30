package com.audiovisual;

import java.util.ArrayList;
import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {

    private int numeroEpisodios;
    private List<Temporada> temporadas;

    public SerieDeTV(String titulo, int duracionMinutos, String genero, int numeroEpisodios) {
        super(titulo, duracionMinutos, genero);
        this.numeroEpisodios = numeroEpisodios;
        this.temporadas = new ArrayList<>();
    }

    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }

    public List<Temporada> getTemporadas() {
        return new ArrayList<>(temporadas);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de episodios: " + numeroEpisodios);
        System.out.println("Número de temporadas: " + temporadas.size());
    }
}
