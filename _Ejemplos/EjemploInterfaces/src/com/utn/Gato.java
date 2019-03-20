package com.utn;

public class Gato extends Felino implements Domestico {

  public Gato(int edad, char genero, String nombre) {
    super(edad, genero, nombre);
  }

  @Override
  public String serDosil() {
    return "Soy dosil cuando quiero";
  }

  @Override
  public String obedecer() {
    return "Ja! mejor obeceme vos a mi humano";
  }

  @Override
  public String toString() {
    return "Gato{" + super.toString() + "}";
  }
}
