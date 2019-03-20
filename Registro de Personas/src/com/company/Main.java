package com.company;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        int opcionElegida;
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        Map<Integer, Persona> personas = new TreeMap<Integer, Persona>();

        while (!exit) {
            System.out.println("1- Agregar nueva persona");
            System.out.println("2- Buscar persona");
            System.out.println("3- Salir");
            opcionElegida = sc.nextInt();

            switch (opcionElegida) {
                case 1:
                    Persona cPersona = new Persona();
                    System.out.println("Ingrese DNI: ");
                    cPersona.setDni(sc.nextInt());
                    System.out.println("Ingrese Nombre: ");
                    cPersona.setNombre(sc.next());
                    System.out.println("Ingrese Apellido: ");
                    cPersona.setApellido(sc.next());

                    personas.put(cPersona.getDni(), cPersona);
                    break;

                case 2:
                    System.out.println("Ingrese DNI: ");
                    Persona cPersona2 = personas.get(sc.nextInt());
                    if(cPersona2!=null){System.out.println(cPersona2.toString());}
                    else {System.out.println("Persona inexistente");}
                    break;

                case 3:
                    exit = true;
                    break;

                default:
                    System.out.println("Ingrese valor nuevamente");
            }
        }
    }
}
