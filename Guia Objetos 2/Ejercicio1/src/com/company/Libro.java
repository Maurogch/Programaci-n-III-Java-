package com.company;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor[] cAutores;

    public Libro(String titulo, double precio, int stock, Autor[] cAutores) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.cAutores = cAutores;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void mostrarAutores(){
        for(int i=0; i<cAutores.length; i++){
            System.out.println("Autor: " + cAutores[i].getNombre() + " " + cAutores[i].getApellido() + "\nEmail: " + cAutores[i].getEmail() + "\nGenero: " + cAutores[i].getGenero());
        }
    }

    public void mostrarLibro(){
        System.out.println("Titulo: " + titulo + "\nPrecio: $" + precio + "\nStock: " + stock);
    }

    public void mostrarLibroAutor(){
        mostrarLibro();
        System.out.println("De los autores:");
        mostrarAutores();
    }


}

