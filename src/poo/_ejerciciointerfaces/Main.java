package poo._ejerciciointerfaces;

public class Main {


    //static CocheCRUD cocheCRUD = new CocheCRUDImpl() ;
    public static void main(String[] args) {

        CocheCRUD cocheCRUD = new CocheCRUDImpl() ;
        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();

    }
}
