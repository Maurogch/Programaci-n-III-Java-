package banco;

import banco.exception.ClienteNoExisteException;

import java.util.HashMap;
import java.util.Map;

public class Banco {

    /**
     * Key = nombre del cliente
     * Value = cliente
     */
    private Map<String,Cliente> clientes = new HashMap<>();

    public Banco() {

    }

    /**
     * Retorna un cliente si existe
     * @param nombre
     * @return {@link Cliente}
     * @throws ClienteNoExisteException
     */
    public Cliente getCliente(String nombre) throws ClienteNoExisteException {
        if (clientes.containsKey(nombre)) {
            return clientes.get(nombre);
        }
        throw new ClienteNoExisteException("No existe el cliente");
    }

    public void addCliente(String nombre, Cliente cliente) {
        clientes.put(nombre, cliente);
    }

}
