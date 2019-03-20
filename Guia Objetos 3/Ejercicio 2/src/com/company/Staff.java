package com.company;

public class Staff extends Persona {
    private double salario;
    private String turno;

    public Staff(int dni, String nombre, String apellido, String direccion, double salario, String turno) {
        super(dni, nombre, apellido, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public double salarioAnual(){
        return salario*12;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + " " + apellido + "\nDni: " + dni + "\nDirección: " + direccion +
                "\nSalario mensual: $" + salario + "Turno: " + turno + "\n";
    }
}
