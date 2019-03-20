package com.company;

public class Main {

    public static void main(String[] args) {
        int cantEstudiantes=0;
        int cantStaff=0;
        int totalIngresos=0;

        Persona [] cPersonas = new Persona[8];

        cPersonas[0] = new Estudiante(33666001, "Waylon", "Dalton","La Pampa 3542",2010, 1200, Carreras.TEXTIL);
        cPersonas[1] = new Estudiante(33366002,"Justine", "Henderson","Independencia 1253",2011,1300, Carreras.ADMINISTRACION);
        cPersonas[2] = new Estudiante(33666003,"Abdullah", "Lang", "Mendoza 2546", 2010, 1500, Carreras.INTERIORISMO);
        cPersonas[3] = new Estudiante(33666004, "Marcus", "Cruz", "Uruguay 5523", 2013,1400, Carreras.PROGRAMACION);

        cPersonas[4] = new Staff(27555001, "Thalia","Cobb", "Córdoba 2543", 15000, "Día");
        cPersonas[5] = new Staff(27555001, "Mathias", "Little","Irigoyen 784", 15000, "Noche");
        cPersonas[6] = new Staff(27392789, "Juan", "Perez", "Unacalle 398", 15000, "Día");
        cPersonas[7] = new Staff(32948932, "John", "Doe", "Otracalle 323", 15000, "Noche");

        for(int i=0; i<cPersonas.length; i++){
            if(cPersonas[i] instanceof Estudiante){
                cantEstudiantes++;
                Estudiante cEstudiante = (Estudiante)cPersonas[i];
                totalIngresos += cEstudiante.getCoutaMensual();
            }
            else cantStaff++;
        }

        System.out.println("Cantidad de Estudiantes: " + cantEstudiantes);
        System.out.println("Cantidad de Staff: " + cantStaff);
        System.out.println("Total de Ingresos: $" + totalIngresos);


    }
}
