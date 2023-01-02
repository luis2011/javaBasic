package com.exception;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ThorwMain {

    public static void main(String[] args) {

        try{
            leerNombres();
        }catch (NameFormatException e){
            e.printStackTrace();
        }
        System.out.println("cerrando teclado");
    }

    /**
     * Metodo que lee nombres de consola y verifica que tengan la longitud igual o mayor que 8
     * caracteres
     * @throws NameFormatException
     */

    private static void leerNombres() throws NameFormatException{
            // throws: crear la exceptiom
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        while(teclado.hasNext()){
            System.out.println("Introduce un nombre");
            String nombre = teclado.next();
            if(nombre.length()< 8){
                teclado.close();
                throw new NameFormatException("El nombre debe contener minimo 8 caracteres");
                //throw: lanzar la exception
            }
        }

        teclado.close();
    }


}
