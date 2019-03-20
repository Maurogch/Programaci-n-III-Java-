package com.company;

public class Main {

    public static void main(String[] args) {
        Cliente cCliente = new Cliente("Juan Perez", "juanperez@gmail.com", 20);
        Factura cFactura = new Factura(270, cCliente);

        cFactura.mostrarDatos();


    }
}

