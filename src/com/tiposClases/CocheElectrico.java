package com.tiposClases;

public class CocheElectrico extends  Coche{

    String motorElectrico;

    public CocheElectrico(){}

    public CocheElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }


    // the method super
    public CocheElectrico(String color, String maker, String model, Double peso, Double large, Integer speed, String motorElectrico){
        super(color, maker, model, peso, large, speed);
        this.motorElectrico = motorElectrico;
    }

    @Override //sobre escritura
    public void speedUp(Integer speed){
        Integer speedAjustada = speed * 2;
        super.speedUp(speedAjustada);
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
                " motorElectrico='" + motorElectrico + '\'' +
                '}';
    }
}
