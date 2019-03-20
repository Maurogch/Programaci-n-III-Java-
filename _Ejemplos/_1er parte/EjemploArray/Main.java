package array_ejemplo;

public class Main {

    public static void main(String[] args) {

        //EJEMPLO 1: single array
        int[] myPrimitiveArray = new int[2];
        myPrimitiveArray[0] = 1;

        System.out.println();
        System.out.println("El tamaño del arreglo de primitivas es: " + myPrimitiveArray.length);

        for (int i = 0; i < myPrimitiveArray.length; i++) {
            System.out.println("Posición " + i + " = " + myPrimitiveArray[i]);
        }


        //EJEMPLO 2: single object array
        String [] myObjectArray = new String[2];

        String a = "hola";
        myObjectArray[0] = a;

        System.out.println("El tamaño del arreglo de objetos es: " + myObjectArray.length);

        for (int i = 0; i < myObjectArray.length; i++) {
            System.out.println("Posición " + i + " = " + myObjectArray[i]);
        }

        System.out.println();

        //EJEMPLO 3: two dimension array
        int [][] twoDimensionArray = new int[3][];
        twoDimensionArray[0] = new int[2];
        twoDimensionArray[1] = new int[3];

        for (int i = 0; i < twoDimensionArray.length; i++) {
            for (int j = 0; j < twoDimensionArray[i].length; j++) {
                System.out.println("Posición " + i + "-" + j + " = " + twoDimensionArray[i][j]);
            }

        }
    }
}
