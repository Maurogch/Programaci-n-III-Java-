package banco;

import java.util.Objects;

public class Cliente {

    private Long idCliente;
    private String nombre;
    private String dni;

    public Cliente(Long idCliente, String nombre, String dni) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.dni = dni;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    //No olvidarse de implementar el método equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(idCliente, cliente.idCliente) &&
                Objects.equals(nombre, cliente.nombre) &&
                Objects.equals(dni, cliente.dni);
    }

    //No olvidarse de implementar el método hashCode()
    @Override
    public int hashCode() {

        return Objects.hash(idCliente, nombre, dni);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
