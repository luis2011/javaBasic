package poo._ejerciciopoo;

public class SmartWatch extends SmartDevice {

    boolean sleepMonitoring;
    double distance;

    public SmartWatch(){}



    public SmartWatch(String marca, String so, Double screen, String color, boolean autonomous, int cantSensor, boolean sleepMonitoring, double distance) {
        super(marca, so, screen, color, autonomous, cantSensor);
        this.sleepMonitoring = sleepMonitoring;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                ", marca='" + marca + '\'' +
                ", so='" + so + '\'' +
                "sleepMonitoring=" + sleepMonitoring +
                ", distance=" + distance +
                ", screen=" + screen +
                ", color='" + color + '\'' +
                ", autonomous=" + autonomous +
                ", cantSensor=" + cantSensor +
                '}';
    }
}
