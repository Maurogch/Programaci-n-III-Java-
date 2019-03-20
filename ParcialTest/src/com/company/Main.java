package com.company;

public class Main {

    public static void main(String[] args) {
        Gato cGato = new Gato();
        Animal cGato2 = new Gato();

        cGato.mostrar();
        cGato2.mostrar();
        ((Gato) cGato2).mostrar2();
    }
}
