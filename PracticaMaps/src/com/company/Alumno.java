package com.company;

public class Alumno {
    private int legajo;
    private String nombre;
    private int dni;

    public Alumno(int legajo, String nombre, int dni) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.dni = dni;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public boolean equals(Object cAlumno){
        boolean flag;
        if (!(cAlumno instanceof Alumno)){
            return false;
        }
        return this.dni == ((Alumno)cAlumno).getDni();
    }

    @Override
    public int hashCode(){
        int result = Integer.hashCode(legajo);
        result = 31 * result + nombre.hashCode();
        result = 31 * result + Integer.hashCode(dni);
        return result;
    }
}
