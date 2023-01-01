package com.Interfaces;

import com.tiposClases.Coche;

public class IntefacesMain {

    public static void main(String[] args) {

        ICocheService service1 = new CocheServiceClassicImpl();
        ICocheService service2 = new CocheServiceSportImpl();

        Coche coche1 = service1.crearCocheDemo();
        Coche coche2 = service2.crearCocheDemo();
    }

}
