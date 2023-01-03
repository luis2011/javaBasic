package poo.herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;

/**
 * Clase derivada o clase hija o subclase
 */

public class Coche  extends Vehiculo {

    int numPuertas;

    public Coche(){}


    public Coche(String fabricante, String modelo, Double cc, int year, boolean sport, int speed, Motor motor, int numPuertas) {
        super(fabricante, modelo, cc, year, sport, speed, motor);
        this.numPuertas = numPuertas;
    }
}
