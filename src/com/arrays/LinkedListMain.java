package com.arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {

        /**
         * Diferencia entre ArrayList y LinkedList
         * ArrayList : mas rapido para almacenar y buscar datos
         * LinkedList : mas rapido para modificar datos
         * con linkedlist para sistemas lifo - fifo
         */

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Element A");
        lista.add("Element B");
        lista.add("Element C");

        // podemos convertir un arrayList a un linklist con su cantidad de registros
        LinkedList<String> listaEnlazada = new LinkedList<String>(lista);



    }
}
