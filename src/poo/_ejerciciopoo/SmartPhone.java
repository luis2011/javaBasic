package poo._ejerciciopoo;

public class SmartPhone  extends SmartDevice{

    String typeReproduction;
    String typeCamera;


    public SmartPhone (){}

    public SmartPhone(String marca, String so, Double screen, String color, boolean autonomous, int cantSensor, String typeReproduction, String typeCamera) {
        super(marca,so, screen, color, autonomous, cantSensor);
        this.typeReproduction = typeReproduction;
        this.typeCamera = typeCamera;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                ", marca='" + marca + '\'' +
                "typeReproduction='" + typeReproduction + '\'' +
                ", typeCamera='" + typeCamera + '\'' +
                ", so='" + so + '\'' +
                ", screen=" + screen +
                ", color='" + color + '\'' +
                ", autonomous=" + autonomous +
                ", cantSensor=" + cantSensor +
                '}';
    }
}
