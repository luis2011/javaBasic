package com.Interfaces;

import com.tiposClases.Coche;
import com.tiposClases.CocheHibrido;

public class CocheServiceSportImpl  implements ICocheService{

    @Override
    public Coche crearCocheDemo() {
        System.out.println("creando coche de carreras");

        return new CocheHibrido();
    }
}
