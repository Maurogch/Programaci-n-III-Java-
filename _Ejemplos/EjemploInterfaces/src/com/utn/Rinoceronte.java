package com.utn;

public class Rinoceronte extends Animal implements Hostil {

  public Rinoceronte(int edad, char genero, String nombre) {
    super(edad, genero, nombre);
  }

  @Override
  public String moverse() {
    return "Me muevo tranquilo";
  }

  @Override
  public String dormir() {
    return "Duermo acostado";
  }

  @Override
  public String cazar() {
    return "Voy a cazarte si me siento amenazado";
  }

  @Override
  public String serDepredador() {
    return "Soy depredador si estoy en peligro";
  }

  @Override
  public String toString() {
    return "Rinoceronte{" + super.toString() + "}";
  }
}
