package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Autor cAutores[] = new Autor[5];
        cAutores[0] = new Autor("James", "Jones", "jjones@email.com", 'M');
        cAutores[1] = new Autor("Oscar", "Grizzard", "oscargrizzard@email.com", 'M');
        cAutores[2] = new Autor("Dewayne", "Gail", "dewaynegail@email.com", 'M');
        cAutores[3] = new Autor("Sebastian", "Flohr", "sebastianflohr@email.com", 'M');
        cAutores[4] = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');

        Libro cLibro = new Libro("Effective Java", 450, 150, cAutores);

        cLibro.setPrecio(500);
        cLibro.setStock((cLibro.getStock()+50));

        cLibro.mostrarLibroAutor();
    }
}
