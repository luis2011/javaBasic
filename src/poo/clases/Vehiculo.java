package poo.clases;

/**
 * Clase base o superClase o clase padre
 */


public class Vehiculo {

//    1. atributos
    protected String fabricante;
    protected String modelo;
    protected Double cc; // al trabajar con tipos de datos en clases nos permite poner null lo cual un primitivo no
    protected int year;
    protected boolean sport;
    protected int speed;
    protected Motor motor;

//    2. constructores
    public Vehiculo(){}

    public Vehiculo(String fabricante, String modelo, Double cc, int year, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, String modelo){
        this.fabricante =fabricante;
        this.modelo =modelo;
    }

//    3. métodos (comportamientos)
    public void acelerar(int quantity){
        this.speed += quantity;
    }

    //getter y setter

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getCc() {
        return cc;
    }

    public void setCc(Double cc) {
        this.cc = cc;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    //toString

}
