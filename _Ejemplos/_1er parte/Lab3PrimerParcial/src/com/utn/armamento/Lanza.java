package com.utn.armamento;

public class Lanza extends Arma {

  private double puntaReforzada;

  public Lanza(int danio, double puntaReforzada) {
    super(danio);
    this.puntaReforzada = puntaReforzada;
  }

  @Override
  public double getModificadorDanio() {
    return puntaReforzada;
  }

  @Override
  public String toString() {
    return "Lanza{" + super.toString() + "puntaReforzada=" + puntaReforzada + '}';
  }
}
