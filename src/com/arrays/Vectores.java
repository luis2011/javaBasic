package com.arrays;

import java.util.ArrayList;


public class Vectores {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println("datos de la lista: " + lista);

        System.out.println("Vector tamaño: "+ lista.size() );

        ArrayList<String> lista2 = new ArrayList<String>();
        lista2.add("Elemento A");
        lista2.add("Elemento B");
        lista2.add("Elemento C");

//        lista2.remove("Elemento B");
//        lista2.remove(0);
        System.out.println("Contenido: " + lista2);

        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista2.get(i));
        }

        // convertir la arraylist a un array

        String array[] = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++){
            array[i] = lista2.get(i);
        }

        for(String element : array){
            System.out.println("Elemento nuevo es: "+ element);
        }

        // otra forma de recorrer una lista con la clase padre object

        System.out.println("Recorriendo con la clase objeto");
        for(Object arrayObjeto : lista2.toArray()){
            System.out.println(arrayObjeto.toString());
        }
    }
}
