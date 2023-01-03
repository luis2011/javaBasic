package poo.sinintefaces;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado juanito = new Empleado("Juanito", 30 , 40000 , true);
        Empleado patricia = new Empleado("Patricia", 30 , 40000 , true);
        Empleado roberto = new Empleado("Roberto", 30 , 40000 , true);

        // guardar empleados
        empleadoCRUD.save(juanito);
        empleadoCRUD.save(patricia);
        empleadoCRUD.save(roberto);

        //consultar empleados
        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);
    }
}
