package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner (System.in);
        Rectangulo cRectangulo = new Rectangulo();
        boolean a = true; //para terminar el while
        int b; //para leer el teclado

        System.out.println("\n1-Rectangulo por defecto\n2-Definir Rectangulo");
        b = sc.nextInt();

        if(b==2){
            System.out.println("\nIngresa el Alto de un rectangulo");
            cRectangulo.setAlto(sc.nextDouble());
            System.out.println("\nIngresa el Ancho de un rectangulo");
            cRectangulo.setAncho(sc.nextDouble());
        }

        while(a){
            System.out.println("1-Mostrar alto y ancho\n2-Calcular area y perímetro\n3-Modificar alto y ancho\n4-Salir del programa");
            b = sc.nextInt();

            switch (b){
                case 1: System.out.println("Alto: " + cRectangulo.getAlto() + "\nAncho: " + cRectangulo.getAncho());
                break;
                case 2: System.out.println("Area: " + cRectangulo.calcularArea() + "\nPerímetro: " + cRectangulo.calcularPerimetro());
                break;
                case 3: System.out.println("\nIngresa el nuevo alto de un rectangulo");
                        cRectangulo.setAlto(sc.nextDouble());
                        System.out.println("\nIngresa el nuevo ancho de un rectangulo");
                        cRectangulo.setAncho(sc.nextDouble());
                break;
                case 4: a = false;
                default:
                break;
            }

        }
    }
}
