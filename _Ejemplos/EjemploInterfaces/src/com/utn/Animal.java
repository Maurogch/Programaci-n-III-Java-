package com.utn;

public abstract class Animal implements Comparable {

  private int edad;
  private char genero;
  private String nombre;

  public Animal(int edad, char genero, String nombre) {
    this.edad = edad;
    this.genero = genero;
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public char getGenero() {
    return genero;
  }

  public String getNombre() {
    return nombre;
  }

  public String respirar() {
    return "El animal respira";
  }

  public abstract String moverse();

  public abstract String dormir();

  @Override
  public int compareTo(Object o) {
    Animal otro = (Animal) o;

    if (this.edad > otro.edad) {
      return 1;
    } else if (this.edad < otro.edad) {
      return -1;
    }
    return 0;
  }

  @Override
  public String toString() {
    return  "edad=" + edad +
            ", genero=" + genero +
            ", nombre='" + nombre + '\'';
  }
}
