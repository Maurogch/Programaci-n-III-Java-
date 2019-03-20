package com.utn.armamento;

public class EspadaLarga extends Arma {

  private boolean filoExtremo;
  private double aceroForjado;

  public EspadaLarga(int danio, boolean filoExtremo, double aceroForjado) {
    super(danio);
    this.filoExtremo = filoExtremo;
    this.aceroForjado = aceroForjado;
  }

  @Override
  public double getModificadorDanio() {
    if (filoExtremo) {
      return aceroForjado + 1.1;
    }
    return aceroForjado;
  }

  @Override
  public String toString() {
    return "EspadaLarga{"
        + super.toString()
        + "filoExtremo="
        + filoExtremo
        + ", aceroForjado="
        + aceroForjado
        + '}';
  }
}
