package com.utn;

public abstract class Canino extends Animal {

  public Canino(int edad, char genero, String nombre) {
    super(edad, genero, nombre);
  }

  @Override
  public String moverse() {
    return "Me muevo con mis 4 patas";
  }

  @Override
  public String dormir() {
    return "Duermo acostado sobre el suelo";
  }

  public String moverseEnManada() {
    return "Me muevo junto con la manada";
  }
}
