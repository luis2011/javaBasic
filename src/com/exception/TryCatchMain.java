package com.exception;

public class TryCatchMain {

    public static void main(String[] args) {
   boolean fallo = false;
        try {
            int result = 5/0;
        } catch (ArithmeticException e) {
                e.printStackTrace();
                fallo = true;
        }finally {
            System.out.println("cierre de recursos");
            // este codigo se va a ejecutar si o si sin importa si falla o no
        }

        if(fallo){
            System.out.println("el sistema ha fallado y se guardara en la db");
        }else{
            System.out.println("No se reportan fallos");
        }

        System.out.println("fin");

    }
}
