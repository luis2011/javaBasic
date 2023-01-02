package ejercicios;

public class EjercicioTema4 {

    public static void main(String[] args) {

        String[] nombres = {"Luis","Roberto","Julio","Alejandra"};
        StringBuilder printer= new StringBuilder();
        for(String nombre : nombres) {
            printer.append(" "+nombre);
        }
        System.out.println(printer);

    }
}
