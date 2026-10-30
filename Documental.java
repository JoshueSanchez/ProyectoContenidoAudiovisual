package com.audiovisual;

public class Documental extends ContenidoAudiovisual {

    private String tema;
    private String investigador;

    public Documental(String titulo, int duracionMinutos, String genero,
                      String tema, String investigador) {
        super(titulo, duracionMinutos, genero);
        this.tema = tema;
        this.investigador = investigador;
    }

    public String getTema() {
        return tema;
    }

    public String getInvestigador() {
        return investigador;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tema: " + tema);
        System.out.println("Investigador: " + investigador);
    }
}
