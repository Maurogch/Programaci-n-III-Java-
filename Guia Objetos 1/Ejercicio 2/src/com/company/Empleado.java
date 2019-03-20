package com.company;

public class Empleado {
    int dni;
    String nombre;
    String apellido;
    double salario;

    public Empleado(int dni, String nombre, String apellido, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double salarioAnual(){
        return (salario*12);
    }

    public void aumentarSalario(double procentaje){
        this.salario
    }
}
