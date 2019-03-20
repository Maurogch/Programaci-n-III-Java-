package com.company;

import java.util.UUID;

public class ItemVenta {
    private UUID cUuid = UUID.randomUUID();
    private String nombre;
    private String descripcion;
    private double precioUnitario;

    public double getPrecioUnitario() {
        return precioUnitario;
    }
}
