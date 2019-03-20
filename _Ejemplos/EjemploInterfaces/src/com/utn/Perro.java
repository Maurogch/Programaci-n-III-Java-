package com.utn;

public class Perro extends Canino implements Entrenado {

  public Perro(int edad, char genero, String nombre) {
    super(edad, genero, nombre);
  }

  @Override
  public String serDosil() {
    return "Soy un animal dosil";
  }

  @Override
  public String obedecer() {
    return "Obedezco a mi amo";
  }

  @Override
  public String traerPelota() {
    return "Llevo la pelota a mi amo";
  }

  @Override
  public String darLaPata() {
    return "Saludo a los humanos";
  }

  @Override
  public String toString() {
    return "Perro{" + super.toString() + "}";
  }
}
