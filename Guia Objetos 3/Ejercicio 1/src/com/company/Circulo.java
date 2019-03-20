package com.company;

public class Circulo {
    protected double radio = 1;
    private String color = "Rojo";

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double calcularArea(){
        return radio*radio*3.14;
    }

    public void mostrarDatos(){
        System.out.println("Radio: " + radio + "\nColor: " + color);
    }
}
