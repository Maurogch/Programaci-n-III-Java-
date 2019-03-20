package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo(Vehiculo.MarcaDeVehiculo.FORD, "GHS456");
        List<Cliente> clientes = new LinkedList<Cliente>();
        clientes.add(new Cliente("Perez Daniel"));
        Cliente cCliente = null;

        System.out.println(vehiculo.getMarca());

        vehiculo.setMarca(Vehiculo.MarcaDeVehiculo.RENAULT);

        System.out.println(vehiculo.getMarca());

        try{ //try-catch no son necesarios ya que este escenario nunca va a crear un NullPointereEception
            for(Cliente cCliente2 : clientes){
                if (cCliente2.getNombre().equals("Perez Juan")) {
                    cCliente = cCliente2;
                }
            }
            if (cCliente==null){
                throw new NotExistException("Cliente no enconrtado"); //Excepcion creada por usuario, extiende RunTimeException
            }
        }catch (NullPointerException ex){
            System.out.println("Error: " + ex.getMessage());
        }

        System.out.println(cCliente.getNombre());

    }
}
