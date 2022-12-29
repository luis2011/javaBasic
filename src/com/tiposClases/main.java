package com.tiposClases;

public class main {
    public static void main(String[] args) {

        Coche coche1 = new CocheElectrico("rojo", "honda" , "civic" , 1430.45 , 5.4 , 0, "motor");
        Coche coche2 = new CocheElectrico("azul", "fiat" , "uno" , 1600.45 , 4.3 , 0, "motor");

        coche1.speedUp(50);
        System.out.println(coche1);


        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico ="Ejempo motor";
        cocheElectrico.color ="Azul";
        cocheElectrico.maker ="Ford";
        cocheElectrico.model ="Fiesta 1.6";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("azul", "alfa","romeo", 1500d,4.99, 120, "txz");
        System.out.println(cocheElectrico2);

        cocheElectrico2.speedUp(50);
        System.out.println(cocheElectrico2);
    }
}
