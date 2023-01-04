package com.entradasalida;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class CopiaFichero {

    public static void main(String[] args) {

        try{
            InputStream in =  new FileInputStream("d:/document.txt");
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream("d:/copia.txt");
            out.write(datos);
            in.close();

        }catch (Exception e){
            System.out.println("Exception " + e.getMessage());
        }


    }
}
