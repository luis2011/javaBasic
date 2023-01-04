package com.mapas;

import java.util.HashMap;
import java.util.Map;

public class HasMapMain {
    public static void main(String[] args) {

        HashMap<String, Integer> mapa = new HashMap<>();
        //array["clave1"] = 10
        mapa.put("clave1" , 10);
        mapa.put("clave2" , 20);
        mapa.put("clave3" , 30);

        System.out.println(mapa.toString());
        System.out.println(mapa.get("clave1"));

        mapa.replace("clave1",50);
        System.out.println(mapa.get("clave1"));

        // mapa.remove("clave1");
        // System.out.println(mapa.toString());

        // RECORRER EL HASHMAP
        for(Map.Entry element : mapa.entrySet()){
            System.out.println("Elemento clave es :" + element.getKey());
            System.out.println("Elemento valor es :" + element.getValue());
        }

    }
}
