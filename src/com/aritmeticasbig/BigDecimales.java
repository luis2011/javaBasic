package com.aritmeticasbig;

import java.math.BigDecimal;

public class BigDecimales {

    public static void main(String[] args) {

        // error de calculo : para uso financiero o numeros enormes
        // no usar ni float ni doble: puede causar error ej:

        System.out.println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f);

        BigDecimal valorA = new BigDecimal(3.14);
        BigDecimal valorB = new BigDecimal(3.15);

        BigDecimal result = valorA.add(valorB);
        //valorA.multiply(valorB);

        System.out.println(result.toString());

    }

}
