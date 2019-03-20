package com.company;

public class Main {

    public static void main(String[] args) {
        Arma cArma1 = new Arma(10);
        Arma cArma2 = new Arma(10);
        Rebelde cRebelde = new Rebelde(100, cArma1, true);
        Aliados cAliados = new Aliados(100, cArma2,true);
    }
}
