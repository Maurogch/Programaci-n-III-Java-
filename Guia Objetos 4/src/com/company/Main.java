package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        VideoClub videoClub = new VideoClub();
        Film cFilm = new Film();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int opcion;

        System.out.println("Carga de film exitosa: " + videoClub.agregarFilm(new Film("Lo que el Viento se Llevo", Genero.AVENTURA, 1988, 60,
                Audiencia.PG_13, "USA", "Descripción", 3)));
        System.out.println("Carga de film exitosa: " + videoClub.agregarFilm(new Film("Gladiador", Genero.DRAMA, 2000, 60,
                Audiencia.R, "USA", "Descripción", 3)));

        while (!exit){
            System.out.println("1 -Agregar nuevo Film\n2 -Buscar Film\n 3- Chequear stock Film\n4- Alquilar");

            switch (opcion){
                case 1:
                    agregarFilm(videoClub);
                    break;
                case 2:
                    String titulo;
                    cFilm = videoClub.buscarFilm("Gladiador");
                    if(cFilm!=null){
                        System.out.println(cFilm.toString());
                    } else {System.out.println("Film inexistente");}
                    break;
                case 3:

            }
        }


    }

    public static void agregarFilm(VideoClub videoClub){
        Scanner sc = new Scanner(System.out);
        private String titulo;
        private String genero;
        private int fechaLanzamiento;
        private int duracion;
        private String audiencia;
        private String paisOrigen;
        private String descripcion;
        private int stock;

        System.out.print("Ingrese titulo: ");
        titulo = sc.next();
        System.out.print("\nIngrese género: ");
        genero = sc.next();
        System.out.print("\nIngrese fecha de lanzamiento: ");
        fechaLanzamiento = sc.nextInt();
        System.out.print("\nIngrese duración: ");
        duracion = sc.nextInt();
        System.out.print("\nIngrese audiencia: ");
        audiencia = sc.next();
        System.out.print("\nIngrese país de orígen: ");
        paisOrigen = sc.next();
        System.out.print("\nIngrese una descrición: ");
        descripcion = sc.next();
        System.out.print("\nIngrese stock inicial: ");
        stock = sc.nextInt();
        System.out.print("\n");

        if(videoClub.agregarFilm(new Film(titulo, genero, fechaLanzamiento, duracion, audiencia, paisOrigen, descripcion, stock))){
            System.out.println("Carga de film exitosa");
        } else System.out.println("Carga de film no exitosa (film ya existente)");
    }
}

