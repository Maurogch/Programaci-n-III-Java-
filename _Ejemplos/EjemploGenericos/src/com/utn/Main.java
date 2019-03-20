package com.utn;

/**
 * Descripcion del ejercicio:
 *
 * <p>Crear la clase TipoGenerico que contiene un atributo de tipo generico y expone un metodo
 * setter y getter. En el metodo main crear una instancia de tipogenerico parametrizandolo con
 * diferentes tipos e imprimir por pantalla la salida del metodo getter.
 *
 * <p>Adicionales:
 *
 * <p>Agregar el metodo equals parametrizandolo. Agregar el metodo hashCode parametrizandolo. Cree
 * el metodo statico y generico compare que retorna el resultado del metodo compareTo de los
 * argumentos pasado por parametro.
 */
public class Main {

  public static void main(String[] args) {
   /* TipoGenerico<String> tg = new TipoGenerico<>("Hello World");
    System.out.println("Impresion del getter:");
    System.out.println(tg.getT() + "\n");

    // Equals
    System.out.println("Impresion del metodo equals:");
    System.out.println(tg.equals(new TipoGenerico<>("Hello World")) + "\n");

    // HashCode
    System.out.println("Hashcode de la instancia tg: ");
    System.out.println(tg.hashCode() + "\n");
    System.out.println("Hashcode de una instancia TipoGenerico: ");
    System.out.println(new TipoGenerico<>("Hello World").hashCode() + "\n");

    // Compare
    final String t1 = "Hello World";
    final String t2 = "Hello World";
    final int rta = TipoGenerico.compare(t1, t2);
    if (rta == 0) System.out.println("t1 y t2 son iguales" + "\n");

    // Creacion de un TipoGenerico de tipo Persona que implementa Comparable.
    // Un ejercicio interesante es probar que pasa si Persona no implementa Comparable.
    TipoGenerico<Persona> tgp = new TipoGenerico<>(new Persona("Matias"));
    final Persona p1 = new Persona("a");
    final Persona p2 = new Persona("b");
    int rta1 = TipoGenerico.compare(p1, p2);
    if (rta1 > 0) {
      System.out.println("p1 es lexicograficamente mayor que p2");
    } else if (rta1 < 0) {
      System.out.println("p1 es lexicograficamente menor que p2");
    } else {
      System.out.println("p1 y p2 son iguales");
    }*/
    TipoGenerico<Double>
  }
}
