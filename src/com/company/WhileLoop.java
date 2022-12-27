package com.company;

public class WhileLoop {

    public static void main(String[] args) {

        boolean check = true;

        int count = 0;
        while (count < 10){

            count++; // condition

            if (count==6 || count==7){
                continue; //  code jump
            }
            System.out.println(count + " hello while");
        }
        count = 0;
        while (count < 10){

            count++; // condition

            if (count==6){
               break; // code break
            }
            System.out.println(count + " hello while");
        }

    }
}
