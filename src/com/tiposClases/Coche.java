package com.tiposClases;

public class Coche {
    //attributes
    String color;
    String maker;
    String model;
    Double peso;
    Double large;
    Integer speed = 0;

    //constructor
    public  Coche(){

    }
    public Coche(String color, String maker, String model, Double peso, Double large, Integer speed){
        this.color = color;
        this.maker = maker;
        this.model = model;
        this.peso = peso;
        this.large = large;
    }

    //getter and setter


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getLarge() {
        return large;
    }

    public void setLarge(Double large) {
        this.large = large;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    //behaviors
    public void speedUp(Integer speed){
        if(speed > 0 && speed <=120) {
            this.speed += speed;
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", peso=" + peso +
                ", large=" + large +
                ", speed=" + speed +
                '}';
    } // podría modificar la vista
}
