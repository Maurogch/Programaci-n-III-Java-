package com.utn.unidad;

import com.utn.armamento.Arma;

public class Catafracta extends Guerrero {

  private boolean armaduraReforzada;

  public Catafracta(Arma arma, boolean armaduraReforzada) {
    super(arma);
    this.armaduraReforzada = armaduraReforzada;
  }

  @Override
  public String toString() {
    return "Catafracta{" + super.toString() + ", armaduraReforzada=" + armaduraReforzada + '}';
  }
}
