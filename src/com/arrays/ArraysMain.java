package com.arrays;

public class ArraysMain {

    public static void main(String[] args) {

        String nombre1 = "nombre1";
        String nombre2 = "nombre2";
        String nombre3 = "nombre3";

        String[] nombres = new String[3];

        String[] nombres2 = new String[]{nombre1, nombre2, nombre3};

        int[] numeros = new int[5];

        Coche[] coches = new Coche[5];

        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

    }
}
