package com.Interfaces;

import com.tiposClases.Coche;
import com.tiposClases.CocheElectrico;

public class CocheServiceClassicImpl implements ICocheService{


    @Override
    public Coche crearCocheDemo() {

        System.out.println("creando coche clasico");
        return new CocheElectrico();
    }
}
