package com.company;

public class StringMain {
    public static void main(String[] args) {

        // la clase String

        /*
          length()
          startsWith("")
          endsWith("")
          indexOf("")
          subString(1,5)
          trim()
          equals()
          compareTo()
 */

        String mensaje=" Hola Mundo ";
        System.out.println(mensaje.length());
        String mensajeMay = mensaje.toUpperCase();
        System.out.println(mensajeMay);
        System.out.println(mensaje.trim());
        mensajeMay = mensajeMay.trim();

        String otro = "HOLA MUNDO";
        if (mensajeMay.equals(otro)) {
            System.out.println("verdadero");
        }

        otro = "Hola Mundo";
        if (mensajeMay.equalsIgnoreCase(otro)) {
            System.out.println("verdadero ignorando las mayúsculas");
        }

        String test = "Luis";
        if(test.startsWith("L") && test.endsWith("s")){
            System.out.println("Eres un afortunado");
        }

        System.out.println("la u se encuentra en la posición " + test.indexOf("L"));

        System.out.println("corte en la posicion 1 y 2 " + test.substring(0,2));

        String str_Sample = "a"; // devuelve -1 sino coincide y cero si coincide
        System.out.println("Compare To 'a' b is : " + str_Sample.compareTo("a"));

        otro= "otro";
        test = "otra";
        System.out.println("otro con test" + otro.compareTo("r"));

    }
}
