package com.utn;

/**
 * La clase Circulo modela una figura circulo
 * que posee radio y color.
 */
public class Circulo {

    private double radio;
    private String color;

    /**
     * Constructor por defecto sin argumentos.
     * Inicializa un objeto de tipo Circulo
     * con un radio de 1.0 y color rojo.
     */
    public Circulo() {
        radio = 1.0;
        color = "rojo";
    }

    /**
     * Constructor que inicializa un objeto
     * de tipo Circulo con el radio especificado
     * y color rojo por defecto.
     *
     * @param r se refiere al radio
     */
    public Circulo(double r) {
        radio = r;
        color = "rojo";
    }

    /**
     * Constructor que inicializa un objeto
     * de tipo Circulo con el radio y color
     * especificado.
     *
     * @param r se refiere al radio
     * @param c se refiere al color
     */
    public Circulo(double r, String c) {
        radio = r;
        color = c;
    }

    public double getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }

    /**
     * @return El calculo del Area del Circulo
     * usando la constante que brinda la api
     * de Java para el valor PI.
     */
    public double getArea() {
        return radio * radio * Math.PI;
    }
}
