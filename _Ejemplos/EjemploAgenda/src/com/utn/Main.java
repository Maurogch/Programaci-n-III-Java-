package com.utn;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

  private static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    Agenda agenda = new Agenda(new HashMap<>());
    bienvenida(agenda);
  }

  static void bienvenida(Agenda a) {
    System.out.println();
    System.out.println("== Agenda ==");
    System.out.println("1. Agregar");
    System.out.println("2. Buscar telefono");
    System.out.println("3. Eliminar contacto");
    System.out.println("4. Editar telefono");
    System.out.println("5. Mostrar todos");
    System.out.println("6. Salir");

    int seleccion = scan.nextInt();

    switch (seleccion) {
      case 1:
        agregar(a);
        bienvenida(a);
        break;
      case 2:
        buscarTelefono(a);
        bienvenida(a);
        break;
      case 3:
        System.out.println("Implementalo ;)");
        bienvenida(a);
        break;
      case 4:
        System.out.println("Implementalo ;)");
        bienvenida(a);
        break;
      case 5:
        a.getAgenda().forEach((key, value) -> System.out.println(key + " " + value));
        bienvenida(a);
        break;
      case 6:
        break;
    }
  }

  static void agregar(Agenda a) {
    System.out.println();
    System.out.println("== Agregar ==");
    System.out.println("Ingrese nombre: ");
    String nombre = scan.next();

    System.out.println("Ingrese apellido: ");
    String apellido = scan.next();

    System.out.println("Ingrese prefijo: ");
    int prefijo = scan.nextInt();

    System.out.println("Ingrese area: ");
    int area = scan.nextInt();

    System.out.println("Ingrese numero: ");
    int numero = scan.nextInt();

    Contacto c = new Contacto(nombre, apellido);
    Telefono t = new Telefono(prefijo, area, numero);

    a.agregarContacto(c, t);
    System.out.println("Contacto agregado!");
    System.out.println();
    bienvenida(a);
  }

  static void buscarTelefono(Agenda a) {
    System.out.println();
    System.out.println("== Buscar telefono ==");

    System.out.println("Ingrese nombre: ");
    String nombre = scan.next();

    System.out.println("Ingrese apellido: ");
    String apellido = scan.next();

    try {
      Telefono t = a.buscarTelefono(new Contacto(nombre, apellido));
      System.out.println("El telefono del contacto es: " + t);
      System.out.println();
      bienvenida(a);
    } catch (TelefonoNoEncontradoException e) {
      System.out.println(e.getMessage());
      System.out.println();
      buscarTelefono(a);
    }
  }
}
