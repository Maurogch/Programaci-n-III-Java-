package com.company;

import java.time.LocalDateTime;
import java.util.UUID;

public class Factura {
    private UUID cUuid = UUID.randomUUID(); // Creating a random UUID (Universally unique identifier)
    private double montoTotal;
    private LocalDateTime fecha = LocalDateTime.now();
    private Cliente cCliente;
    private ItemVenta[] ItemVentas;

    public Factura(Cliente cCliente, ItemVenta[] itemVentas) {
        this.cCliente = cCliente;
        ItemVentas = itemVentas;
    }

    public Factura(double montoTotal, Cliente cCliente,) {
        this.montoTotal = montoTotal;
        this.cCliente = cCliente;
    }

    public double montoDescuento(){
        return montoTotal - (montoTotal * cCliente.getDescuento() / 100);
    }

    public void calcularMonto() {
        for(int i=0; i<ItemVentas.length; i++){
            montoTotal += ItemVentas[i].getPrecioUnitario();
        }
    }

    public void mostrarDatos(){
        calcularMonto();
        System.out.println("FACTURA:\n ID: " + cUuid.toString() + "\n Fecha: " + fecha + "\n Monto: $" + montoTotal + "\n Monto con descuento: $" + montoDescuento());
        cCliente.mostrarDatos();
    }




}
