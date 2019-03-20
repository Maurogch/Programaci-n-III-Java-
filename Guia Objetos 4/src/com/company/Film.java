package com.company;

public class Film {
    private String titulo;
    private String genero;
    private int fechaLanzamiento;
    private int duracion;
    private String audiencia;
    private String paisOrigen;
    private String descripcion;
    private int stock;

    public Film(){}

    public Film(String titulo, String genero, int fechaLanzamiento, int duracion, String audiencia, String paisOrigen, String descripcion, int stock) {
        this.titulo = titulo;
        this.genero = genero;
        this.fechaLanzamiento = fechaLanzamiento;
        this.duracion = duracion;
        this.audiencia = audiencia;
        this.paisOrigen = paisOrigen;
        this.descripcion = descripcion;
        this.stock = stock;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Film{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", duracion=" + duracion +
                ", audiencia='" + audiencia + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", stock=" + stock +
                '}';
    }
}
