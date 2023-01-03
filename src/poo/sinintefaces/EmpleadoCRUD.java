package poo.sinintefaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

    //estructura de datos
    private List<Empleado> empleados = new ArrayList<>();

    // OPERACIONES CRUD

    //guardar un empleado
    public void save(Empleado empleado) {
        empleados.add(empleado);
    }

    public  List<Empleado> findAll(){
       return empleados;
    }
}
