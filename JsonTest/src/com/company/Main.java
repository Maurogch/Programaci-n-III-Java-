package com.company;

import com.google.gson.Gson;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        File file = new File("Datos2.json");
        Persona cPersona = new Persona("John", new Direccion("Artigas", 1982));
        Gson gson = new Gson();

        //Write
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

            gson.toJson(cPersona, Persona.class, bufferedWriter);
            bufferedWriter.close();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        //Read
        try {
            if(file.length()==0) throw new RuntimeException();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            Persona cPersona2 = gson.fromJson(bufferedReader, Persona.class);

            bufferedReader.close();
            System.out.println(cPersona2);
        }catch (IOException ex){
            if(ex instanceof FileNotFoundException){
                System.out.println(ex.getMessage());
            }
            System.out.println(ex.getMessage());
        }catch (RuntimeException ex){  //ejemplo de como pueden haber dos catch, no es necesario en este caso ya que el texto de error puede ser puesto derecho en el throw new [throw new RuntimeException("text error")]
            System.out.println("Error: El archivo está vacio");
        }
    }
}
