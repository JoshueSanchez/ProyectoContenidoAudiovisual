package com.audiovisual;

public class Episodio {

    private String titulo;
    private int duracionMinutos;

    public Episodio(String titulo, int duracionMinutos) {
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void mostrarInformacion() {
        System.out.println("Episodio: " + titulo);
        System.out.println("Duración: " + duracionMinutos + " minutos");
    }
}