package inter2;

public class PrinterA implements lnkBox ,Paper{

    @Override
    public void printSize() {
        System.out.println("A4");


    }

    @Override
    public void printColor() {
        System.out.println("黑白");
    }
}
