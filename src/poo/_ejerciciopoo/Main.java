package poo._ejerciciopoo;

public class Main {

    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone("Samsung","Android", 5.0, "Negro" , true,2, "mp3", "8MB"  );
        System.out.println(smartPhone);

        SmartWatch smartWatch = new SmartWatch("Hitachi","IOS",2.5,"Azul",true,1,true,50);
        System.out.println(smartWatch);
    }



}
