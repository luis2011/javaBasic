package com.mapas;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {

        Map<String, String> personas = new HashMap<>();

        personas.put("29679898M", "Nombre Apellido 1");
        personas.put("29679898L", "Nombre Apellido 2");
        personas.put("29679898P", "Nombre Apellido 3");

        System.out.println(personas);

        for (String key : personas.keySet()){
            System.out.println(key);
        }

        for (String value : personas.values()){
            System.out.println(value);
        }

        for(Map.Entry<String, String> pair : personas.entrySet()){
            System.out.println(pair.getKey()+ " / "+ pair.getValue());
        }
    }
}
