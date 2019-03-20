public class Main {

    public static void main(String[] args) {

        Marca dia = new Marca("Dia", 0.10);
        Marca marolio = new Marca("Marolio", 0.20);

        Producto producto1 = new Producto(2.99, dia);
        Producto producto2 = new Producto(10.00, marolio);


        Producto[] productos = new Producto[3];
        productos[0] = producto1;
        productos[1] = producto2;

        double total = 0.0;
        for (int i = 0; i < productos.length; i++) {
            total += productos[i].getPrecio() * (1 - productos[i].getMarca().getDescuento());
        }


        System.out.println(total);
    }
}
