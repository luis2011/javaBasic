package ejercicios;

public class EjercicioTema1 {

    public static void main(String[] args) {
        //1.enteros
        byte valor = 5;
        short corto = 1;
        int entero = 55;
        long enteroLargo = 1500564564; // hasta 10 digitos

        // 2.decimales
        float flotante = 5.5f;
        double largo = 15.5556d;

        //3.booleano
        boolean verdadero = true;
        boolean falso = false;

        //4.texto
        char text = 'a';
        String mensaje = "Hola mundo desde java";

        System.out.println(valor);
        System.out.println(corto);
        System.out.println(entero);
        System.out.println(enteroLargo);

        System.out.println(flotante);
        System.out.println(largo);

        System.out.println(verdadero);
        System.out.println(falso);

        System.out.println(text);
        System.out.println(mensaje);


        final int enteros = 50; // una constante

        // convertir un string a entero
        String texto = "21";

        int number = Integer.parseInt(texto);
        System.out.println(number);

        /*
         * se pueden sobrecargar los metodos estaticos: verdadero
         * SobreCarga permite duplicar un método siempre y cuando tengan diferentes tipo de parametros
         *
         * se pueden sobreescribir los metodos estaticos: falso
         *
         */


    }





}
