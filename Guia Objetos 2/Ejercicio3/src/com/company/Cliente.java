package com.company;
import java.util.UUID;

public class Cliente {
    private UUID id = UUID.randomUUID();
    private String nombre;
    private char genero;

    public Cliente(String nombre, char genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarDatos(){
        System.out.println("ID: " + id.toString() + "\nNombre: " + nombre + "\nGenero: " + genero);
    }
}
