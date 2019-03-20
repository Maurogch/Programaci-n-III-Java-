package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            BufferedWriter fileOut = new BufferedWriter(new FileWriter(new File("file.txt")));

            fileOut.write("Palabra");
            fileOut.newLine();
            fileOut.write("palabra2");
            fileOut.newLine();
            fileOut.write("2345");
            fileOut.newLine();
            fileOut.write("fin");
            fileOut.close();
        } catch (IOException ex) {
            System.out.println("Se produjo un error al escribir en el archivo: " + ex.getMessage());
        }

        System.out.println("Ingrese el nombre del archivo a leer: ");

        try {
            BufferedReader fileIn = new BufferedReader(new FileReader(new File(sc.next())));
            String line;
            while (!(line = fileIn.readLine()).equals("fin")) {
                System.out.println(line);
            }
            fileIn.close();
        } catch (IOException ex) {
            if (ex instanceof FileNotFoundException) { //FileNotFound es una subclase de IOException, por lo que no es necesario                                                                capturar ambas excepciones con |
                System.out.println("El archivo no fue encontrado: " + ex.getMessage());
            } else {
                System.out.println("Hubo un error al leer el archivo: " + ex.getMessage());
            }
        }
    }
}
