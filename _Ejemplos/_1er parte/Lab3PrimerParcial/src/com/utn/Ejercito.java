package com.utn;

import com.utn.unidad.CaballeroTeutonico;
import com.utn.unidad.Catafracta;
import com.utn.unidad.Guerrero;

public class Ejercito {

  private Guerrero[] guerreros;
  private int numeroGuerreros;

  public Ejercito() {
    this.guerreros = new Guerrero[100];
    this.numeroGuerreros = 0;
  }

  public int contarSoldadosBizantinos() {
    int unidades = 0;
    for (int i = 0; i < numeroGuerreros; i++) {
      if (guerreros[i] instanceof Catafracta) {
        unidades++;
      }
    }
    return unidades;
  }

  public int contarSoldadosTeutones() {
    int unidades = 0;
    for (int i = 0; i < numeroGuerreros; i++) {
      if (guerreros[i] instanceof CaballeroTeutonico) {
        unidades++;
      }
    }
    return unidades;
  }

  public int calcularPoderAtaqueTeuton() {
    int total = 0;
    for (int i = 0; i < numeroGuerreros; i++) {
      if (guerreros[i] instanceof CaballeroTeutonico) {
        total += guerreros[i].atacar();
      }
    }
    return total;
  }

  public int calcularPoderAtaqueBizantino() {
    int total = 0;
    for (int i = 0; i < numeroGuerreros; i++) {
      if (guerreros[i] instanceof Catafracta) {
        total += guerreros[i].atacar();
      }
    }
    return total;
  }

  public void agregarGuerrero(Guerrero guerrero) {
    if (numeroGuerreros <= 100) {
      guerreros[numeroGuerreros] = guerrero;
      numeroGuerreros++;
    }
  }

  public String imprimirGuerrero(int pos) {
    if (guerreros[pos] != null) {
      return guerreros[pos].toString();
    }
    return "No existe un guerrero en esa posicion";
  }
}
