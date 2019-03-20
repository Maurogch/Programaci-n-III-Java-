package com.company;

abstract class Animal {
    protected String nombre;

    public Animal(){}

    public Animal(String nombre){
        this.nombre = nombre;
    }

    public void comer(){}

    abstract void emitirSonido();
}
