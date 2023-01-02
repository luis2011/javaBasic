package com.listas;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {
        List<String> nombres = new ArrayList<String>();

        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");

        System.out.println(nombres);

        for(String nombre : nombres){
            System.out.println(nombre);
        }

        // trabajando con objetos
        List<Coche> coches = new ArrayList<>();

        coches.add( new Coche("Honda civic")); // add new car a la ArrayList
        coches.add( new Coche("Ford Fiesta"));
        coches.add( new Coche("Fiat Palio"));

        System.out.println(coches);

        for (Coche coche : coches){
            System.out.println(coche);
        }
    }
}
