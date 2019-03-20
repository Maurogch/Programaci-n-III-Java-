package com.company;

public class Persona {
    private Integer dni;
    private String nombre;
    private String apellido;

    public Persona(){}

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "aaaa";
    }
}
