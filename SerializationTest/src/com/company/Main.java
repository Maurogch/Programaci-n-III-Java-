package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        File file = new File("Datos");
        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;
        Persona cPersona = new Persona("John", "algo", new Direccion("Artigas", 1982));

        //Write
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));

            objectOutputStream.writeObject(cPersona);
            objectOutputStream.writeObject(null); //null for End of File
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        //Read
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            Object aux = objectInputStream.readObject();

            while (aux != null) {
                if (aux instanceof Persona) {
                    System.out.println(aux);
                    aux = objectInputStream.readObject();
                }
            }
        } catch (IOException ex) {
            if (ex instanceof StreamCorruptedException) System.out.print("Stream Corrupted Exception: ");
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
