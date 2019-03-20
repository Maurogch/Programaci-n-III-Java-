package com.utn;

public class Telefono {

  private int codigoArea;
  private int prefijo;
  private int numero;

  public Telefono(int codigoArea, int prefijo, int numero) {
    this.codigoArea = codigoArea;
    this.prefijo = prefijo;
    this.numero = numero;
  }

  public int getCodigoArea() {
    return codigoArea;
  }

  public int getPrefijo() {
    return prefijo;
  }

  public int getNumero() {
    return numero;
  }

  @Override
  public String toString() {
    return " Telefono: +" + codigoArea + "(" + prefijo + ")" + numero;
  }
}
