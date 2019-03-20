package com.company;

public class Gato extends Animal {
    private int var3;

    public Gato(int var1, int var3) {
        super(var1);
        this.var3 = var3;
    }

    public void mostrar(){
        System.out.println("gato");
    }

    public void mostrar2(){
        System.out.println("gato2");
    }
}
