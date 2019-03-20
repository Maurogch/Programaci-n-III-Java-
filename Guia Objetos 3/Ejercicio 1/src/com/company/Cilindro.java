package com.company;

public class Cilindro extends Circulo {
    private double altura = 1;

    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularVolumen(){
        return super.calcularArea()*altura;
    }

    @Override
    public double calcularArea(){
        return (2*3.14*radio*altura)+(2*super.calcularArea());
    }

    public void mostrarDatos(){
        System.out.println("Radio: " + radio + "\nAltura: " + altura + "\nArea:" +
                calcularArea() + "\nVolumen: " + calcularVolumen());
    }

    @Override
    public String toString(){
        return "Cilindro: subclase de " + Circulo.class.toString() + "\naltura= " + altura;
    }
}
