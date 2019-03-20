package com.company;
import java.util.Scanner;
import java.lang.Math; //import para conseguir el valor de PI y usar funcion de raiz


public class Ejercicios {
    private Scanner sc = new Scanner (System.in);

    public void Ejercicio1(){
        int N = 6;
        double A = 1.5;
        char C = 'c';

        System.out.println ("N = " + N + "\nA = " + A + "\nC = " + C);
        System.out.println ("N + A = " + (N+A) + "\nA - N = " + (A-N) + "\nValor numérico de C = " + ((int)C));
    }

    public void Ejercicio2(){
        int X = 4;
        int Y = 6;
        double N = 1.5;
        double M = 2.6;

        System.out.print("X * Y + N - M = ");
        System.out.println(X+Y+N-M);
    }

    public void Ejercicio3(){
        int N = 6;

        int i = (N + 77 - 3) * 2;

        System.out.print(i);
    }

    public void Ejercicio4(){
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;

        B += C;
        C += A;
        A += D;
        D += B;

        System.out.printf("A: %d\nB: %d\nC: %d\nD: %d\n", A, B, C, D);
    }

    public void Ejercicio5(){
        System.out.println("Ingresa un número entero ");
        int A = sc.nextInt();

        if(A%2==0){
            System.out.println("A es par");
        }else System.out.println("A es impar");
    }

    public void Ejercicio6(){
        System.out.println("Ingresa un número entero ");
        int B = sc.nextInt();

        if(B>=0){
            System.out.println("B es positivo");
        }else System.out.println("B es negativo");
    }

    public void Ejercicio7(){
        System.out.println("Ingresa un número entero ");
        int C = sc.nextInt();

        if(C%2==0) System.out.print("C es par, ");  // no usar corchetes cuando hay una sola linea
        else System.out.print("C es impar, ");

        System.out.print(C>=0 ? "positivo, " : "negativo, ");   //forma alternativa de usar if else con solo dos posibles soluciones

        System.out.print(C%5==0 ? "multiplo de 5, " : "no es multiplo de 5, ");

        System.out.print(C % 10 == 0 ? "es multiplo de 10, " : "no es multiplo de 10, ");

        System.out.println(C>100 ? "y es mayor a 100." : "y es menor a 100.");
    }

    public void Ejercicio8(){
        System.out.print("Ingrese su nombre: ");
        String a = sc.next();                         //para leer string del teclado debe ser next() no nextint()
        System.out.println("\nBuenos días, " + a);
    }

    public void Ejercicio9(){
        System.out.println("Ingresa un número entero ");
        int a = sc.nextInt();

        System.out.printf("El doble es: %d, el triple es: %d", (a*2), (a*3));  //uso de printf
    }

    public void Ejercicio10(){
        System.out.println("Ingrese temperatura en grados Fahrenheit");
        double a = sc.nextDouble();

        System.out.println("Temperatura en grados Celcius: " + (a-32)/1.8);
    }

    public void Ejercicio11(){
        System.out.println("Ingrese el radio de una circunferencia");
        double r = sc.nextDouble();

        System.out.printf("La longitud es: %f y el area es: %f\n", r*2, r*r*Math.PI);
    }

    public void Ejercicio12(){
        System.out.println("Ingrese la velocidad en km/h");
        double v = sc.nextDouble();

        System.out.println("La velocidad en m/s es: " + v*1000/3600);
    }

    public void Ejercicio13(){
        System.out.println("Ingrese el cateto 1 de un triangulo");
        double a = sc.nextDouble();
        System.out.println("Ingrese el cateto 2 de un triangulo");
        double b = sc.nextDouble();

        System.out.println("La hipotenusa del triangulo es: " + Math.sqrt((a*a)+(b*b))); // Math.sqrt es raiz, necesita libretia math
    }

    public void Ejercicio14(){
        System.out.println("Ingrese radio de una esfera en metros");
        double r = sc.nextDouble();

        System.out.println("El volúmen de la esfera es: " + (4*Math.PI*r*r*r)/3 + " metros cuadrados.");
    }

    public void Ejercicio15(){
        System.out.println("Ingrese el lado 1 de un triangulo");
        double a = sc.nextDouble();
        System.out.println("Ingrese el lado 2 de un triangulo");
        double b = sc.nextDouble();
        System.out.println("Ingrese el lado 2 de un triangulo");
        double c = sc.nextDouble();
        double s = (a+b+c)/2; //semiperimetro del triangulo

        System.out.println("El area del triangulo es: " + Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }

    public void Ejercicio16(){
        System.out.println("Ingresa un número entero de tres cifras");
        String a = sc.next();
        char [] digitos = a.toCharArray();

        System.out.printf("Digito 1: %c\n" + "Digito 2: %c\nDigito 3: %c\n", digitos[0], digitos[1], digitos[2]);
    }

    public void Ejercicio17(){
        System.out.println("Ingresa un número entero de cinco cifras");
        int a = sc.nextInt();
        System.out.println("Digitos pares: ");

        while (a > 0){
            int digito = a % 10;
            if (digito%2 == 0) System.out.println(digito);
            a /= 10;
        }
    }

    public void Ejercicio18(){
        System.out.println("Ingresa hora");
        int h = sc.nextInt();
        System.out.println("Ingresa minutos");
        int m = sc.nextInt();
        System.out.println("Ingresa segundos");
        int s = sc.nextInt();

        if((h>=0 && h<=24) && (m>=0 && m<60) && (s>=0 && s<60)) {
            System.out.print("Hora Valida: ");
            System.out.printf("%d:%d:%d\n", h, m, s);
        }else  System.out.println("Hora invalida");
    }
}
