package com.tiposClases;

public class main {
    public static void main(String[] args) {

        Coche coche1 = new Coche("rojo", "honda" , "civic" , 1430.45 , 5.4 , 0);
        Coche coche2 = new Coche("azul", "fiat" , "uno" , 1600.45 , 4.3 , 0);

        coche1.speedUp(50);
        System.out.println(coche1);


        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico ="Ejempo motor";
        cocheElectrico.color ="Azul";
        cocheElectrico.maker ="Ford";
        cocheElectrico.model ="Fiesta 1.6";

        System.out.println(cocheElectrico);
    }
}
