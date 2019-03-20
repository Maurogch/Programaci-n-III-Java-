public class Producto {

    private double precio;
    private Marca marca;

    public Producto(double precio, Marca marca) {
        this.precio = precio;
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
