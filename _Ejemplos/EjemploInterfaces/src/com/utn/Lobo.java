package com.utn;

public class Lobo extends Canino implements Hostil {

  public Lobo(int edad, char genero, String nombre) {
    super(edad, genero, nombre);
  }

  @Override
  public String cazar() {
    return "Soy un habil cazador";
  }

  @Override
  public String serDepredador() {
    return "Soy un depredador temido";
  }

  @Override
  public String toString() {
    return "Lobo{" + super.toString() + "}";
  }
}
