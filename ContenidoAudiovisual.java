
package com.audiovisual;

public class ContenidoAudiovisual {
    private String titulo;
    private int duracionMinutos;
    private String genero;

    public ContenidoAudiovisual(String titulo, int duracionMinutos, String genero) {
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public String getGenero() {
        return genero;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Duración: " + duracionMinutos + " minutos");
        System.out.println("Género: " + genero);
    }

}


