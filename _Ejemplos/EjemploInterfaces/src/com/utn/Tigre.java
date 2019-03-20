package com.utn;

public class Tigre extends Felino implements Hostil {

  public Tigre(int edad, char genero, String nombre) {
    super(edad, genero, nombre);
  }

  @Override
  public String cazar() {
    return "Soy un cazador nato";
  }

  @Override
  public String serDepredador() {
    return "Soy un depredador temido";
  }

  @Override
  public String toString() {
    return "Tigre{" + super.toString() + "}";
  }
}
