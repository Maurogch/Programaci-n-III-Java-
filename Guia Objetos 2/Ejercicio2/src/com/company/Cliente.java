package com.company;
import java.util.UUID; //import necesario para UUID

public class Cliente {
    private UUID cUuid = UUID.randomUUID(); // Creating a random UUID (Universally unique identifier)
    private String uuid = cUuid.toString(); // uuid to string
    private String nombre;
    private String email;
    private double descuento = 0;

    public Cliente(String nombre, String email, double descuento) {
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void mostrarDatos(){
        System.out.println("CLIENTE:\n ID: " + uuid + "\n Nombre: " + nombre + "\n Email: " + email + "\n Descuento: " + descuento);
    }


}
