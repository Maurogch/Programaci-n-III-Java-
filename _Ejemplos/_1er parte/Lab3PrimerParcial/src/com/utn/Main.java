package com.utn;

import com.utn.armamento.EspadaLarga;
import com.utn.armamento.Lanza;
import com.utn.unidad.CaballeroTeutonico;
import com.utn.unidad.Catafracta;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

  public static void main(String[] args) {
    Ejercito ejercito = new Ejercito();

    for (int i = 0; i < 20; i++) {
      ejercito.agregarGuerrero(
          new CaballeroTeutonico(
              new EspadaLarga(12, ThreadLocalRandom.current().nextBoolean(), 1.2)));
    }

    for (int i = 0; i < 30; i++) {
      ejercito.agregarGuerrero(new Catafracta(new Lanza(12, 1.2), false));
    }

    System.out.println("Poder ataque Bizantino: " + ejercito.calcularPoderAtaqueBizantino());
    System.out.println("Poder ataque Teuton: " + ejercito.calcularPoderAtaqueTeuton());
    System.out.println("Soldados Bizantinos: " + ejercito.contarSoldadosBizantinos());
    System.out.println("Soldados Teutones: " + ejercito.contarSoldadosTeutones());

    System.out.println("\nGuerrero en posicion 10: \n" + ejercito.imprimirGuerrero(10));
    System.out.println("\nGuerrero en posicion 31: \n" + ejercito.imprimirGuerrero(31));
    System.out.println("\nGuerrero en posicion 98: \n" + ejercito.imprimirGuerrero(98));
  }
}
