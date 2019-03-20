package com.utn;

public abstract class Felino extends Animal {

  public Felino(int edad, char genero, String nombre) {
    super(edad, genero, nombre);
  }

  // Implemento este metodo en la clase
  // abstracta porque es un comportamiento
  // general de los felinos. Me ahorro implementarlo
  // en cada subclase concreta.
  @Override
  public String moverse() {
    return "Puedo correr agilmente";
  }

  @Override
  public String dormir() {
    return "Duermo acostado";
  }

  public String serAgil() {
    return "Puedo trepar lo que sea";
  }
}
