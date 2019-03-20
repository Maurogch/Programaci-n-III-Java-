package ejercicio;

public class Vehiculo {

    private String matricula;
    private MarcaDeVehiculo marca;

    /**
     * Podemos declarar el enum dentro de la clase Vehiculo o fuera
     * de la misma
     */
    enum MarcaDeVehiculo {
        FORD,
        TOYOTA,
        SUZUKI,
        RENAULT,
        SEAT;
    }

    public Vehiculo() {
    }

    public Vehiculo(String matricula, MarcaDeVehiculo marca) {
        this.matricula = matricula;
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public MarcaDeVehiculo getMarca() {
        return marca;
    }

    public void setMarca(MarcaDeVehiculo marca) {
        this.marca = marca;
    }
}
