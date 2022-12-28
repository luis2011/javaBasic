package com.tiposClases;

public class CocheElectrico extends  Coche{

    String motorElectrico;

    public CocheElectrico(){}

    public CocheElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                ", color='" + color + '\'' +
                ", maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", peso=" + peso +
                ", large=" + large +
                ", speed=" + speed +
                "motorElectrico='" + motorElectrico + '\'' +
                '}';
    }
}
