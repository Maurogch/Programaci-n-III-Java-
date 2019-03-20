package com.company;

import java.util.Scanner; //import library for Scanner

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner (System.in); //linea necesaria para leer teclado
        Ejercicios cEjercicios = new Ejercicios();
        int a;
        int b = 0;

        while(b==0){
            System.out.println("\nIngresa el número de ejercicio (1-18), 19 para salir");
            a = sc.nextInt();                 //linea que lee el teclado

            switch(a) {
                case 1: cEjercicios.Ejercicio1();
                break;
                case 2: cEjercicios.Ejercicio2();
                break;
                case 3: cEjercicios.Ejercicio3();
                break;
                case 4: cEjercicios.Ejercicio4();
                break;
                case 5: cEjercicios.Ejercicio5();
                break;
                case 6: cEjercicios.Ejercicio6();
                break;
                case 7: cEjercicios.Ejercicio7();
                break;
                case 8: cEjercicios.Ejercicio8();
                break;
                case 9: cEjercicios.Ejercicio9();
                break;
                case 10: cEjercicios.Ejercicio10();
                break;
                case 11: cEjercicios.Ejercicio11();
                break;
                case 12: cEjercicios.Ejercicio12();
                break;
                case 13: cEjercicios.Ejercicio13();
                break;
                case 14: cEjercicios.Ejercicio14();
                break;
                case 15: cEjercicios.Ejercicio15();
                break;
                case 16: cEjercicios.Ejercicio16();
                break;
                case 17: cEjercicios.Ejercicio17();
                break;
                case 18: cEjercicios.Ejercicio18();
                break;
                case 19: b=1;
                break;
                default:
                break;
            }
        }

    }

    static void ejercicio1() {  //posible crear un metodo static desde main para no crear una clase separada
        System.out.print("ads");
    }
}
