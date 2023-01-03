package poo.coninterfaces;

import poo.sinintefaces.Empleado;

public class Main {

    static EmpleadoCRUD empleadoCRUD = new EmpleadosCRUDMySQL();
    // el dia de mañana podemos cambiarlo por:
    //static EmpleadoCRUD empleadoCRUD = new EmpleadosCRUDExcel();

    public static void main(String[] args) {

        empleadoCRUD.findAll();
        empleadoCRUD.save(new Empleado());



    }
}
