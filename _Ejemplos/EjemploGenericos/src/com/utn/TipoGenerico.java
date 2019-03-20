package com.utn;

import java.util.Objects;

public class TipoGenerico<T extends Integer> {

  private T t;

  public TipoGenerico(T t) {
    this.t = t;
  }

  public T getT() {
    return t;
  }

  public void setT(T t) {
    this.t = t;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TipoGenerico<T> that = (TipoGenerico<T>) o;
    return this.getT().equals(that.getT());
  }

  /**
   * Hashcode en una sola linea, no es de lo mas eficiente pero cumple con su proposito. Es
   * recomendable implementarlo de la forma que se explica en la teoria.
   *
   * @return un entero que representa el valor de hash del objeto.
   */
  @Override
  public int hashCode() {
    return Objects.hash(t);
  }

  /**
   * En este metodo restrinjo el tipo T para que unicamente pueda ser utilizado si y solo si T
   * implementa la interfaz Comparable. De esta forma me aseguro que T va a tener implementado el
   * metodo compareTo.
   *
   * @param t1 el tipo que invoca la comparacion.
   * @param t2 el tipo con el que t1 se va a comparar.
   * @param <T> tipo parametrizado
   * @return retorna un entero siguiendo el contrato especificado en Comparable
   */
  public static <T extends Comparable<T>> int compare(T t1, T t2) {
    return t1.compareTo(t2);
  }
}
