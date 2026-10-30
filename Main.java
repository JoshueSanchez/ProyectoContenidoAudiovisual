package com.audiovisual;

public class Main {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Leonardo DiCaprio", 49, "Estadounidense");
        Actor actor2 = new Actor("Joseph Gordon-Levitt", 43, "Estadounidense");

        Pelicula pelicula = new Pelicula(
                "El Origen",
                148,
                "Ciencia ficción",
                "Christopher Nolan"
        );

        pelicula.agregarActor(actor1);
        pelicula.agregarActor(actor2);

        System.out.println("=== PELÍCULA ===");
        pelicula.mostrarInformacion();

        System.out.println();

        SerieDeTV serie = new SerieDeTV(
                "Stranger Things",
                50,
                "Ciencia ficción",
                2
        );

        Temporada temporada1 = new Temporada(1);
        temporada1.agregarEpisodio("Capítulo 1", 48);
        temporada1.agregarEpisodio("Capítulo 2", 52);

        serie.agregarTemporada(temporada1);

        System.out.println("=== SERIE DE TV ===");
        serie.mostrarInformacion();
        temporada1.mostrarInformacion();

        System.out.println();

        Documental documental = new Documental(
                "Planeta Tierra",
                60,
                "Naturaleza",
                "Vida salvaje",
                "David Attenborough"
        );

        System.out.println("=== DOCUMENTAL ===");
        documental.mostrarInformacion();
    }
}