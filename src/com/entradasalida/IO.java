package com.entradasalida;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IO {
    public static void main(String[] args) {



        try{


//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Mete dos numeros: ");
//            String a = scanner.next();
//            String b = scanner.next();
//            System.out.println("Enteros son: " + a + " "+ b);


            // codigo correcto para que no de error la entrada de datos

            boolean ok = false;
            do{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Mete dos numeros: ");
                try {
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    ok = true;
                }catch (InputMismatchException e){
                    System.out.println("Numero invalidos");
                }
            }while (!ok);


            // PrintStream : para escribir un fichero
             PrintStream info = new PrintStream("d:/copia.txt");
             info.println("Hola copia");



            InputStream file = new FileInputStream("d:/document.txt");
            BufferedInputStream fileBuffer = new BufferedInputStream(file);

        try{
            int data = fileBuffer.read();
            while (data != -1){
                System.out.print((char)data);
                data = fileBuffer.read();
            }

        }catch (IOException e){
            System.out.println("No puedo leer el fichero: " + e.getMessage());
        }


        }catch (FileNotFoundException e){
            System.out.println("No existe el archivo " + e.getMessage());
        }


       // BufferedInputStream : trabaja con entrada de datos
    }
}
