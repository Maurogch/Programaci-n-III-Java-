package com.company;

public class Rebelde extends Nave {
    private boolean laser;

    public Rebelde(double salud, Arma arma, boolean laser) {
        super(salud, arma);
        this.laser = laser;
    }

    @Override
    public double atacar() {
        return laser ? arma.getDaño() : arma.getDaño()*1.7;
    }

}
