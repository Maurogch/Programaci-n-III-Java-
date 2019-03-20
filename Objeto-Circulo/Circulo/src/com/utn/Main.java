package com.utn;

public class Main {

    public static void main(String[] args) {

        // Declara un objeto circulo1 llamando al constructor por defecto que inicializa con radio 1 y color rojo.
        Circulo circulo1 = new Circulo();

        // Imprimo por pantalla las propiedades del objeto circulo1
        System.out.println("El color del objeto circulo1 es, " + circulo1.getColor() + ", el radio es, " + circulo1.getRadio() + ", y el area es, " + circulo1.getArea());

        // Declara un objeto circulo2 llamando al constructor que inicializa con un radio especifico  y color rojo.
        Circulo circulo2 = new Circulo(20.0);

        // Imprimo por pantalla las propiedades del objeto circulo2
        System.out.println("El color del objeto circulo2 es, " + circulo2.getColor() + ", el radio es, " + circulo2.getRadio() + ", y el area es, " + circulo2.getArea());

        // Declara un objeto circulo1 llamando al constructor por defecto que inicializa con radio 1 y color rojo.
        Circulo circulo3 = new Circulo(30.0, "azul");

        // Imprimo por pantalla las propiedades del objeto circulo3
        System.out.println("El color del objeto circulo3 es, " + circulo3.getColor() + ", el radio es, " + circulo3.getRadio() + ", y el area es, " + circulo3.getArea());
    }
}
