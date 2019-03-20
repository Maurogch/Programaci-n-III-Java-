package com.company;

public class Estudiante extends Persona{
    private int añoIngreso;
    private double coutaMensual;
    private String carrera;

    public Estudiante(int dni, String nombre, String apellido, String direccion, int añoIngreso, double coutaMensual, String carrera) {
        super(dni, nombre, apellido, direccion);
        this.añoIngreso = añoIngreso;
        this.coutaMensual = coutaMensual;
        this.carrera = carrera;
    }

    public double getCoutaMensual() {
        return coutaMensual;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellido + "\nDni: " + dni + "\nDirección: " + direccion +
                "\nCarrera: " + carrera + "Cutoa mensual: $" + coutaMensual + "\n";
    }
}
