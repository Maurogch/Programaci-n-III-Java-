package com.company;

public abstract class Persona {
    protected int dni;
    protected String nombre;
    protected String apellido;
    protected String direccion;

    public Persona(int dni, String nombre, String apellido, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }
}
