package com.company;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private transient String thing; //var that will not be stored in a file
    private Direccion direccion;
    private static final long serialVersionUID = 4L; //manual declaration, must be increased manually, if this line is not used IDE will implement it automatically, and recalculate it for every change in the class

    public Persona(String nombre, String thing, Direccion direccion) {
        this.nombre = nombre;
        this.thing = thing;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", thing='" + thing + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}
