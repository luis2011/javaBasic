package poo._ejerciciointerfaces;

public class CocheCRUDImpl implements  CocheCRUD{


    @Override
    public void save() {
        System.out.println("imprimiendo el método SAVE");
    }

    @Override
    public void findAll() {
        System.out.println("imprimiendo el método FIND ALL");
    }

    @Override
    public void delete() {
        System.out.println("imprimiendo el método DELETE");
    }
}
