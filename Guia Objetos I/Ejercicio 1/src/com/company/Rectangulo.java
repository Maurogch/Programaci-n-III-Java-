package com.company;

public class Rectangulo {
    double alto = 1;
    double ancho = 1;

    public Rectangulo(){}

    public Rectangulo(double alto, double ancho){
        this.alto = alto;
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double calcularArea(){
        return (alto*ancho);
    }

    public double calcularPerimetro(){
        return (2*(alto+ancho));
    }
}
