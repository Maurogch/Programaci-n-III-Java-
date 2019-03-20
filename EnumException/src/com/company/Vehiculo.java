package com.company;

public class Vehiculo {
    private MarcaDeVehiculo marca;
    private String matricula;

    public enum MarcaDeVehiculo{
        FORD,
        TOYOTA,
        SUSUKI,
        RENAULT,
        SEAT;
    }

    public Vehiculo(MarcaDeVehiculo marca, String matricula) {
        this.marca = marca;
        this.matricula = matricula;
    }

    public MarcaDeVehiculo getMarca() {
        return marca;
    }

    public void setMarca(MarcaDeVehiculo marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
