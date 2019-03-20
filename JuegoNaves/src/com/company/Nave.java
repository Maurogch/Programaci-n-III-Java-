package com.company;

public abstract class Nave {
    protected double salud;
    protected Arma arma;

    public Nave(double salud, Arma arma) {
        this.salud = salud;
        this.arma = arma;
    }

    public abstract double atacar();

    public void recibirAtque(double ataque){
        salud -= ataque;
    }
}
