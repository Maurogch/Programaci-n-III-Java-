package com.utn;

public class Leon extends Felino implements Hostil {

  private boolean melena;

  public Leon(int edad, char genero, String nombre) {
    super(edad, genero, nombre);
    // Si el genero es masculino el leon tiene melena.
    this.melena = genero == 'M' || genero == 'm';
  }

  @Override
  public String cazar() {
    return null;
  }

  @Override
  public String serDepredador() {
    return null;
  }

  public boolean isMelena() {
    return melena;
  }

  @Override
  public String toString() {
    return "Leon{melena=" + this.melena + " " + super.toString() + "}";
  }
}
