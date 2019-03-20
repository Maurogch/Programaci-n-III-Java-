package com.company;

import java.util.UUID;

public class Cuenta {
    private static final int MAX_OPS = 10;

    private UUID id = UUID.randomUUID();
    private double balance;
    private Cliente cCliente;
    private int contadorOperaciones = 0;
    private String operaciones[] = new String[MAX_OPS];


    public Cuenta(Cliente cCliente, double balance) {
        this.balance = balance;
        this.cCliente = cCliente;
    }

    public String[] getOperaciones() {
        return operaciones;
    }

    public void depositar(double monto){
        documentarDeposito(monto);
        balance += monto;
    }

    public void extraer(double monto){
        if((balance-monto >= -2000)){
            balance -= monto;
            documentarExtraccion(monto);
        }
        else System.out.println("Saldo insuficiente");
    }

    public void mostrarDatos(){
        cCliente.mostrarDatos();
        System.out.println("Balance: $" + balance);
    }

    private void documentarDeposito(double monto) {
        if (contadorOperaciones == MAX_OPS) {
            contadorOperaciones = 0;
        }
        operaciones[contadorOperaciones] = "El cliente " + cCliente.getNombre() + ", depositó " + monto;
        contadorOperaciones++;
    }

    private void documentarExtraccion(double monto) {
        if (contadorOperaciones == MAX_OPS) {
            contadorOperaciones = 0;
        }
        operaciones[contadorOperaciones] = "El cliente" + cCliente.getNombre() + ", retiró " + monto;
        contadorOperaciones++;
    }
}
