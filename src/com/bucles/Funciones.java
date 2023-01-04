package com.bucles;

public class Funciones {

    public static void main(String[] args) {

        holaMundo();

       holaMundo("Luis");

        String hola = devolverHola();
        System.out.println(hola);

        sobrecarga();
        sobrecarga(5);
        sobrecarga("Luis" , "Zelarrayan");
    }

    // private : solo se puede acceder desde esta clase
    private static void holaPrivado() {
        System.out.println("privado");
    }

    //public : se puede acceder desde cualquier clase de nuestro sistema
    public static void holaMundo() {
        System.out.println("Hola mundo desde mi metodo");
    }

    //protected : se puede acceder desde otra clase si esta dentro del mismo paquete osea hija.
    protected static void holaMundo(String name) {
        System.out.println("Hola " + name);
    }

    // al no poner acceso se convierte a algo parecido a protected
    static String devolverHola() {
        return "Hola";
    }

   // la sobrecarga de funciones es cuando 2 funciones tienen el mismo nombre pero distintos parametros

    public static void sobrecarga() {
       System.out.println("sobrecarga1");
   }

    public static void sobrecarga(Integer number) {
        System.out.println("sobrecarga2 " + number);
    }
    public static void sobrecarga(String name , String surname) {
        System.out.println("sobrecarga3 " + name + surname);
    }
}
