package poo._ejerciciopoo;

public class SmartDevice {

    protected  String marca;
    protected String so;
    protected Double screen;
    protected String color;
    protected boolean autonomous;
    protected int cantSensor;

    public SmartDevice() {
    }

    public SmartDevice(String marca,String so, Double screen, String color, boolean autonomous, int cantSensor) {
        this.marca = marca;
        this.so = so;
        this.screen = screen;
        this.color = color;
        this.autonomous = autonomous;
        this.cantSensor = cantSensor;
    }


}
