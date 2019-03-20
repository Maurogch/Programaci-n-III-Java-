package com.utn.unidad;

import com.utn.armamento.Arma;

public abstract class Guerrero {

  private Arma arma;
  private int salud;

  public Guerrero(Arma arma) {
    this.arma = arma;
    this.salud = 100;
  }

  public int atacar() {
    return arma.atacar();
  }

  public void recibirAtaque(int danio) {
    this.salud = this.salud - danio;
  }

  @Override
  public String toString() {
    return "arma=" + arma + ", salud=" + salud;
  }
}
