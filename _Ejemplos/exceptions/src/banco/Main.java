package banco;

import banco.exception.ClienteNoExisteException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(1L, "Lennard Lenny", "29873442");
        Cliente cliente2 = new Cliente(2L, "Carlson Carl", "30723765");
        Cliente cliente3 = new Cliente(2L, "Carlson Carl", "30723765");

        Banco banco = new Banco();
        banco.addCliente(cliente1.getNombre(), cliente1);
        banco.addCliente(cliente2.getNombre(), cliente1);

        try {
            banco.getCliente("Perez Juana");
        } catch (ClienteNoExisteException e) {
            System.out.println(e.getMessage());
        }
        /*

        Set<Cliente> clientes = new HashSet<>();

        clientes.add(cliente1);
        System.out.println(clientes.add(cliente2));
        System.out.println(clientes.add(cliente3));

        for(Cliente t : clientes){
            System.out.println(t);
        }*/


    }
}
