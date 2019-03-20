package com.company;

public class Aliados extends Nave {
    private boolean protones;

    public Aliados(double salud, Arma arma, boolean protones) {
        super(salud, arma);
        this.protones = protones;
    }

    @Override
    public double atacar() {
        return protones ? arma.getDaño() : arma.getDaño()*1.5;
    }
}
