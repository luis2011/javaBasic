package com.tiposClases;

public class PolimorfismoMain {
    public static void main(String[] args) {

        Coche coche1 = new CocheElectrico();
        CocheElectrico coche2 = new CocheElectrico();
        CocheHibrido coche3 = new CocheHibrido();

        //Polimorfismo

        Coche coche4 = new CocheElectrico();
        Coche coche5 = new CocheHibrido();


        if (coche4 instanceof Coche){
            System.out.println("coche");
        }

        if (coche4 instanceof CocheElectrico){
            System.out.println("coche electrico");
        }

        if (coche4 instanceof CocheHibrido){
            System.out.println("coche Hibrido");
        }else{
            System.out.println("NO ES coche Hibrido");
        }


    }
}
