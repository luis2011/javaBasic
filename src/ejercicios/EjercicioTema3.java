package ejercicios;

public class EjercicioTema3 {

    public static void main(String[] args) {

        double priceMasIva;
        double price = 10000;
        double iva = 1.21;

        priceMasIva = getPriceIva(price, iva);
        System.out.println(priceMasIva);

    }

    private static double getPriceIva(double price , double iva) {

        return price * iva;
    }
}
