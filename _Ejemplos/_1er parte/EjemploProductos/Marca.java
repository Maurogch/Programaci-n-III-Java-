public class Marca {

    private double descuento;
    private String nombre;

    public Marca(String nombre) {
        this.nombre = nombre;
    }

    public Marca(String nombre, double descuento) {
        this.nombre = nombre;
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
