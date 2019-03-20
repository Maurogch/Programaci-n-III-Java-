package com.utn.unidad;

import com.utn.armamento.Arma;

public class CaballeroTeutonico extends Guerrero {

  public CaballeroTeutonico(Arma arma) {
    super(arma);
  }

  @Override
  public String toString() {
    return "CaballeroTeutonico{" + super.toString() + '}';
  }
}
