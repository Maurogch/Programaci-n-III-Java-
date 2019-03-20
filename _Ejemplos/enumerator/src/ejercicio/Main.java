package ejercicio;

public class Main {

    public static void main(String[] args) {
        /*Vehiculo vehiculo = new Vehiculo("JOD 323", Vehiculo.MarcaDeVehiculo.SUZUKI);

        //Getters de vehiculo
        System.out.println("Matricula: " + vehiculo.getMatricula());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("----------------------------");


        //Métodos comunes de todos los enum

        //1) Método values(): retorna un array con todos los valores declarados en el enum
        Vehiculo.MarcaDeVehiculo[] marcasDisponibles = Vehiculo.MarcaDeVehiculo.values();
        for (int i=0; i<marcasDisponibles.length; i++) {
            System.out.println("values() [" + i + "] = " + marcasDisponibles[i]);
        }

        System.out.println("----------------------------");
        //2) Método valueOf(): retorna el enum asociado al nombre
        System.out.println("valueOf(FORD) = " + Vehiculo.MarcaDeVehiculo.valueOf("FORD"));
*/
        System.out.println(TipoDeMadera.CAOBA.getColor());
    }
}
