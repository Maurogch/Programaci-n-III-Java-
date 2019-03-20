package com.company;

public class Main {

    public static void main(String[] args) {
        Cliente cCliente = new Cliente("Juan", 'M');
        Cuenta cCuenta = new Cuenta(cCliente, 1000);

        cCuenta.mostrarDatos();
        cCuenta.depositar(200);
        cCuenta.mostrarDatos();
        cCuenta.extraer(170);
        cCuenta.mostrarDatos();
        cCuenta.extraer(3030);
        cCuenta.mostrarDatos();
        cCuenta.extraer(5000);

        System.out.println("\nOperaciones realizadas:");
        for (String ops : cCuenta.getOperaciones()) {
            if (ops != null) System.out.println(ops);
        }

    }
}
