package com.utn;

public class Main {

  public static void main(String[] args) {
    Animal leon = new Leon(14, 'M', "Leonidas");
    Animal perro = new Perro(7, 'M', "Firulais");
    Animal gato = new Gato(3, 'F', "Pelusa");
    Animal rinoceronte = new Rinoceronte(2, 'M', "Rino");
    Animal perra = new Perro(1, 'F', "Wendy");
    Animal perraDos = new Perro(2, 'F', "Blanca");
    Animal lobo = new Lobo(6, 'M', "Alfa");

    // Almaceno en un array de tipo Entrenado
    // a las variables de tipo Perro que implementan esa interfaz.
    Entrenado[] entrenados = new Entrenado[2];
    entrenados[0] = (Entrenado) perra;
    entrenados[1] = (Entrenado) perraDos;

    System.out.println("\n=== Ejemplo de impresion de objetos: ===");
    System.out.println(leon);
    System.out.println(perro);
    System.out.println(gato);
    System.out.println(perra);
    System.out.println(rinoceronte);
    
    System.out.println("\n=== Ejemplo de impresion de comportamientos: ===");
    // Casteo la variable perra que es de tipo Animal a Perro, para de esta forma acceder al comportamiento definido en la clase Perro.
    // Tambien puedo castear al tipo de la interfaz que contiene el metodo darLaPata, en este caso Entrenado.
    System.out.println(perra.getNombre() + ": " + ((Entrenado) perra).darLaPata());
    System.out.println(perra.getNombre() + ": " + ((Perro) perra).traerPelota());
    System.out.println(lobo.getNombre() + ": " + ((Lobo) lobo).cazar());

    System.out.println("\n=== Ejemplo de comparaciones: ===");
    System.out.println(comparadorDeAnimales(leon, perro));
    System.out.println(comparadorDeAnimales(rinoceronte, perra));
    System.out.println(comparadorDeAnimales(gato, perro));
  }

  private static String comparadorDeAnimales(Object o1, Object o2) {
    if (o1 instanceof Animal && o2 instanceof Animal) {
      Animal a1 = (Animal) o1;
      Animal a2 = (Animal) o2;
      int rta = a1.compareTo(a2);

      if (rta > 0) return a1.getNombre() + " es mayor que " + a2.getNombre();
      if (rta < 0) return a1.getNombre() + " es menor que " + a2.getNombre();
      return a1.getNombre() + " y " + a2.getNombre() + " tienen la misma edad";

    } else {
      return "No es posible comparar los objetos";
    }
  }
}
