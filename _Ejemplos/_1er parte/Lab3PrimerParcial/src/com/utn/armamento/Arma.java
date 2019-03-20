package com.utn.armamento;

public abstract class Arma {

  protected int danio;

  public Arma(int danio) {
    this.danio = danio;
  }

  public int getDanioTotal() {
    return (int) (danio * getModificadorDanio());
  }

  public int atacar() {
    return getDanioTotal();
  }

  protected abstract double getModificadorDanio();

  @Override
  public String toString() {
    return "daño=" + danio + ", dañoT=" + getDanioTotal() + " ";
  }
}
