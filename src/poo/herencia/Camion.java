package poo.herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;
/**
 * Clase derivada o clase hija o subclase
 */
public class Camion  extends Vehiculo {

    double capacidadCarga;

    public Camion(){}

    public Camion(String fabricante, String modelo, Double cc, int year, boolean sport, int speed, Motor motor, double capacidadCarga) {
        super(fabricante, modelo, cc, year, sport, speed, motor);
        this.capacidadCarga = capacidadCarga;
    }
}
