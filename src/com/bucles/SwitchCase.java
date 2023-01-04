package com.bucles;

public class SwitchCase {

    public static void main(String[] args) {

        String weather = "sunny";

        switch (weather){

            case "sunny":
                System.out.println("El tiempo es soleado");
                break;
            case "cloudy":
                System.out.println("El tiempo es nubleado");
                break;
            default:
                System.out.println("No se puedo indentificar el clima");

        }

    }
}
